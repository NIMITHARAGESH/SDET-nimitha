package com.vtiger.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='campaignname']")
    private WebElement campaignname;	

	@FindBy(xpath="//input[@value='T']")
	private WebElement grpradiobtn;
	
	@FindBy(xpath="//select[@name='assigned_group_id']")
	private WebElement assigneddd;
	
	@FindBy(xpath="//select[@name='campaigntype']")
	private WebElement campaigntypedd;
	
	@FindBy(xpath="////select[@name='campaignstatus']")
	private WebElement campaignstatus;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement campsavebtn;
	
	public CreateCampaignPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getCampaignname() {
		return campaignname;
	}

	public WebElement getGrpradiobtn() {
		return grpradiobtn;
	}

	public WebElement getAssigneddd() {
		return assigneddd;
	}

	public WebElement getCampaigntypedd() {
		return campaigntypedd;
	}

	public WebElement getCampaignstatus() {
		return campaignstatus;
	}

	public WebElement getCampsavebtn() {
		return campsavebtn;
	}
	
	

}

