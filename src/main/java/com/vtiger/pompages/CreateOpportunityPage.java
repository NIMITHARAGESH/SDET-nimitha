package com.vtiger.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.generic.JavaUtility;

public class CreateOpportunityPage {
	WebDriver driver;
	public JavaUtility ju=new JavaUtility();
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement opportunityname;
	
	@FindBy(xpath="//select[@id='related_to_type']")
	private WebElement relateddd;
	
	@FindBy(xpath="//input[@id='related_to_display']//following-sibling::img")
	private WebElement selectBtn;
	@FindBy(id="search_txt")
	private WebElement searchboxchild;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchnowchild;
	
	@FindBy(xpath="//a[@id='2']")
	private WebElement searchsuggestion;
	
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement grpradiobtn;
	
	@FindBy(xpath="//select[@name='assigned_group_id']")
	private WebElement assigneddd;
	
	@FindBy(xpath="//input[@name='closingdate']//following-sibling::img")
	private WebElement closedate;
	
	@FindBy(xpath="//select[@name='sales_stage']")
	private WebElement stagedd;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement oppsavebtn;
	
	public CreateOpportunityPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOpportunityname() {
		return opportunityname;
	}

	public WebElement getRelateddd() {
		return relateddd;
	}

	public WebElement getSelectBtn() {
		return selectBtn;
	}

	public WebElement getSearchboxchild() {
		return searchboxchild;
	}

	public WebElement getSearchnowchild() {
		return searchnowchild;
	}

	public WebElement getSearchsuggestion() {
		return searchsuggestion;
	}

	public WebElement getRadiobtn() {
		return grpradiobtn;
	}

	public WebElement getAssigneddd() {
		return assigneddd;
	}

	public WebElement getCalendarimage() {
		return closedate;
	}

	public WebElement getStagedd() {
		return stagedd;
	}

	public WebElement getOppsavebtn() {
		return oppsavebtn;
	}

	public void oppselectorg(String orgname)
	{
		searchboxchild.sendKeys(orgname);
		searchnowchild.click();
		searchsuggestion.click();
	}
	
public void createopportunity(String oppname)
{
	opportunityname.sendKeys(oppname);
	grpradiobtn.click();
	closedate.click();
	ju.getDate();
	oppsavebtn.click();
	
}
}
