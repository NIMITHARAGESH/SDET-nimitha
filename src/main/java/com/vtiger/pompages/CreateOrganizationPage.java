package com.vtiger.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgnametxtfield;
	
	@FindBy(id="phone")
	private WebElement phonetextfield;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryDD;
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement ratingDD;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement typeDD;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	
	public CreateOrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrgnametxtfield() {
		return orgnametxtfield;
	}


	public WebElement getPhonetextfield() {
		return phonetextfield;
	}


	public WebElement getIndustrydd() {
		return industryDD;
	}


	public WebElement getRatingdd() {
		return ratingDD;
	}


	public WebElement getTypedd() {
		return typeDD;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	

}
