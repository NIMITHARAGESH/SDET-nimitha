package com.vtiger.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	
@FindBy(xpath="//select[@name='salutationtype']")
private WebElement selectinitial;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstnametextfield;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnametextfield;
	
	@FindBy(xpath="//input[@name='account_name']//following-sibling::img")
	private WebElement selectorgbtn;
	
	@FindBy(id="search_txt")
	private WebElement searchboxchild;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchnowchild;
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement searchsuggestion;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	public CreateContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSearchboxchild()
	{
		return searchboxchild;
		
	}
	public WebElement getfirstnametextfield() {
		return firstnametextfield;
	}
	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getSelectorgbtn() {
		return selectorgbtn;
	}
	
	public WebElement getSearchnowchild()
	{
		return searchnowchild;
		
	}
	public WebElement getSearchsuggestion()
	{
		return searchsuggestion;
	}
	public WebElement clickSavebtn()
	{
		return savebtn;
	}
	public WebElement getSelectinitial()
	{
		return selectinitial;
		
	}
	public void selectorg(String orgname)
	{
		searchboxchild.sendKeys(orgname);
		searchnowchild.click();
	}
	public void createcontact(String contactname)
	{
		//lastnametextfield.sendKeys((contactname);
		savebtn.click();
	}
	
	}
