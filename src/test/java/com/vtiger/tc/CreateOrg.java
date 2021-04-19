package com.vtiger.tc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.generic.AutoConstants;
import com.vtiger.generic.BaseClass;
import com.vtiger.generic.ExcelUtility;
import com.vtiger.generic.FileUtility;
import com.vtiger.generic.JavaUtility;
import com.vtiger.generic.WebdriverUtility;
import com.vtiger.pompages.CreateOrganizationPage;
import com.vtiger.pompages.HomePage;
import com.vtiger.pompages.OrganizationPage;

public class CreateOrg extends BaseClass{
	
	JavaUtility ju=new JavaUtility();
	
FileUtility fu=new FileUtility();
ExcelUtility eu=new ExcelUtility();
WebdriverUtility wdu=new WebdriverUtility();
WebDriver driver ;

@Test 
public void createOrg() throws IOException, InterruptedException
{
	int randomnumber=ju.createRandomNumber();
	
	//Read data from propertyfile
	
	String UN = fu.readDatafrompropfile(AutoConstants.propfilepath,"username");
	String PWD = fu.readDatafrompropfile(AutoConstants.propfilepath, "password");
	String URL = fu.readDatafrompropfile(AutoConstants.propfilepath, "url");
	
	//read data from excelfile
	
	String name = eu.readDatafromExcel("sheet1",0,0);
	String orgname=name+randomnumber;
	
	String phonenumber = eu.readDatafromExcel("sheet1",1,0);
	String intDD = eu.readDatafromExcel("sheet1",2,0);
	String ratingDD = eu.readDatafromExcel("sheet1",3,0);
	String typeDD = eu.readDatafromExcel("sheet1",4,0);
	
	
	//Name of org
	
	System.out.println(name+" "+orgname+" "+phonenumber+" "+intDD+" "+ratingDD+" "+typeDD);
	
	HomePage hp=new HomePage(driver);
	
	hp.getOrglink().click();
	
	OrganizationPage op=new OrganizationPage(driver);
	op.getCreateorgBTn().click();
	
	CreateOrganizationPage cop=new CreateOrganizationPage(driver);
	cop.getOrgnametxtfield().sendKeys(orgname);
	
	cop.getPhonetextfield().sendKeys(phonenumber);
	
	wdu.selectdropdownbyvalue(cop.getIndustrydd(),intDD);
	wdu.selectdropdownbyvalue(cop.getTypedd(),typeDD);
	wdu.selectdropdownbyvalue(cop.getRatingdd(), ratingDD);
	
	
	cop.getSaveBtn().click();
	
	wdu.refresh(driver);
	
	hp.getHomepagelink().click();
	hp.getOrglink().click();
	
	op.getSearchbox().sendKeys(orgname);
	wdu.selectdropdownbyvalue(op.getSelectorgtypedd(), "Organization Name");
	op.getSubmitbtn().click();
	
	WebElement actualorgname=driver.findElement(By.xpath("//a[text()='"+orgname+"']/ancestor::table[@class='lvt small']"));
 wdu.waitForElement(actualorgname);

System.out.println(actualorgname.getText());
	boolean result = actualorgname.getText().contains(orgname);
//	
	System.out.println(result);

	Assert.assertEquals(true, result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebDriver driver=new ChromeDriver();
//	wdu.maximizeWindow(driver);
//	driver.get(URL);
//	
//	wdu.implicitwait(driver);
//	
//	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
//	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PWD);
//	driver.findElement(By.id("submitButton")).click();
//	
//	
//	driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
//	
//	driver.findElement(By.id("phone")).sendKeys(phonenumber);
//	
//	WebElement industry=driver.findElement(By.xpath("//select[@name='industry']"));
//
//	
//	wdu.selectdropdownbyvalue(industry, intDD);
//	
//	WebElement rating=driver.findElement(By.xpath("//select[@name='rating']"));
//	wdu.selectdropdownbyvisibletext(rating, ratingDD);
//	
//	WebElement type=driver.findElement(By.xpath("//select[@name='accounttype']"));
//	wdu.selectdropdownbyvalue(type, typeDD);
//	
//	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//	wdu.refresh(driver);
//	driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']")).click();
//	
//	driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//	WebElement searchbox=driver.findElement(By.xpath("//input[@name='search_text']"));
//    wdu.elementsclickable(driver, searchbox);
//    
//    searchbox.sendKeys(orgname);
//   WebElement orgnameDD= driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@id='bas_searchfield']"));
//   
//   wdu.selectdropdownbyvalue(orgnameDD, "Organization Name");
//	driver.findElement(By.xpath("//input[@name='submit']")).click();	
//	WebElement actualorgname=driver.findElement(By.xpath("//a[text()='"+orgname+"']/ancestor::table[@class='lvt small']"));
//    wdu.waitForElement(actualorgname);
//	
//	System.out.println(actualorgname.getText());
//	
//	boolean result = actualorgname.getText().contains(orgname);
//	
//	System.out.println(result);
//	
//
//   
//   
   
   
   
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


}
