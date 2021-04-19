package com.vtiger.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {
	public WebDriver driver;
	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement createopportunitybtn;
	
	
@FindBy(xpath="//input[@name='search_text']")
private WebElement oppsearchbox;

@FindBy(xpath="//div[@id='basicsearchcolumns_real']/select[@id='bas_searchfield']")
private WebElement selectopptypedd;


@FindBy(xpath="//input[@name='submit']")
private WebElement submitbtn;

public OpportunitiesPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getCreateopportunitybtn() {
	return createopportunitybtn;
}

public WebElement getOppsearchbox() {
	return oppsearchbox;
}

public WebElement getSelectopptypedd() {
	return selectopptypedd;
}

public WebElement getSubmitbtn() {
	return submitbtn;
}

}
