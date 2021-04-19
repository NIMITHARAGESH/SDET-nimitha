package com.vtiger.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	
	public WebDriver driver;
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement createcampbtn;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement campsearchbox;
	
	@FindBy(xpath="//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']")
	private WebElement selectcamptypedd;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement submitbtn;
    
    public CampaignPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreatecampbtn() {
		return createcampbtn;
	}

	public WebElement getCampsearchbox() {
		return campsearchbox;
	}

	public WebElement getSelectcamptypedd() {
		return selectcamptypedd;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	

}
