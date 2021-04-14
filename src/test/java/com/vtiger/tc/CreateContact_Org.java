package com.vtiger.tc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.generic.AutoConstants;
import com.vtiger.generic.ExcelUtility;
import com.vtiger.generic.FileUtility;
import com.vtiger.generic.JavaUtility;
import com.vtiger.generic.WebdriverUtility;

public class CreateContact_Org {
	
	JavaUtility ju=new JavaUtility();
	FileUtility fu=new FileUtility();
	WebdriverUtility wdu=new WebdriverUtility();
	ExcelUtility eu=new ExcelUtility();
	
	@Test
	public void createcontact() throws IOException, InterruptedException
	{
		String UN = fu.readDatafrompropfile(AutoConstants.propfilepath,"username");
		String PWD = fu.readDatafrompropfile(AutoConstants.propfilepath, "password");
        String URL = fu.readDatafrompropfile(AutoConstants.propfilepath,"url");
        
        
	WebDriver driver=new ChromeDriver();
	wdu.maximizeWindow(driver);
	driver.get(URL);
	wdu.implicitwait(driver);
	
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PWD);
      driver.findElement(By.id("submitButton")).click();
      driver.findElement(By.xpath("//a[text()='Contacts']")).click();
      driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
      driver.findElement(By.xpath("////input[@name='lastname']")).sendKeys("C P");
      
    driver.findElement(By.xpath("//input[@name='account_name']//following-sibling::img")).click();
    
    wdu.switchToWindow(driver,"winid");
    driver.findElement(By.id("search_text")).sendKeys("SBI");
    driver.findElement(By.xpath("//input[@name='search']")).click();
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@id='1']")).click();
    wdu.switchToWindow(driver, "Contacts");
    driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
    
    
    
   
   
   
   
}
}
