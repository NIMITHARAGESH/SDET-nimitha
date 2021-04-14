package com.vtiger.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Contact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();

		WebElement firstname=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select title=new Select(firstname);
		title.selectByVisibleText("Ms.");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("MIlana");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R M");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();


		
		

	}

}
