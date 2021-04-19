package com.vtiger.generic;

import java.io.IOException;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.mongodb.connection.Connection;
import com.mysql.jdbc.Driver;
import com.vtiger.pompages.HomePage;
import com.vtiger.pompages.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	
	public JavaUtility ju=new JavaUtility();
	public FileUtility fu=new FileUtility();
	public ExcelUtility eu=new ExcelUtility();
	public WebdriverUtility wdu=new WebdriverUtility();
	
	/**
	 * create DB connection
	 * extent report
	 * @throws SQLException 
	 * 
	 */
	
	@BeforeSuite
	public void beforeSuite() throws SQLException
	{
		//		System.out.println("DB connection");

		
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ram","root","root");
		
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery("select * from emp");
		
		
		
		
		System.out.println("Extentreport");
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		String browsername=fu.readDatafrompropfile(AutoConstants.propfilepath, "browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
					
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();

		}
		wdu.maximizeWindow(driver);
		wdu.implicitwait(driver);
		driver.get(fu.readDatafrompropfile(AutoConstants.propfilepath, "url"));
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	/**
	 * 
	 * @throws IOException
	 */
	@BeforeMethod()
	public void logintoapp() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(fu.readDatafrompropfile(AutoConstants.propfilepath,"username"), fu.readDatafrompropfile(AutoConstants.propfilepath,"password"));
		
	}
	
	@AfterMethod
    public void logoutfromApp()
    {
		HomePage hp=new HomePage(driver);
		hp.logOut();
    }
	
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("close DB connection");
		System.out.println("close Extent report");
	}

}
