package com.vtiger.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	WebDriver driver;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorgBTn;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchbox;
	
	@FindBy(xpath="//div[@id='basicsearchcolumns_real']/select[@id='bas_searchfield']")
	private WebElement selectorgtypedd;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement submitbtn;
    
    public OrganizationPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getCreateorgBTn() {
		return createorgBTn;
	}
	public WebElement getSubmitbtn()
	{
		return submitbtn;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}


	public WebElement getSelectorgtypedd() {
		return selectorgtypedd;
	}
   
}
