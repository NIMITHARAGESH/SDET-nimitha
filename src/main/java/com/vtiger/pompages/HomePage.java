package com.vtiger.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.generic.WebdriverUtility;

public class HomePage {
	public  WebDriver driver;

	
	public WebdriverUtility wdu = new WebdriverUtility();

	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orglink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactlnk;
	
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement opplink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement homepagelink;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutLnk;
	
	@FindBy(xpath="//img[Contains(@src,'user.PNG']")
	private WebElement adminstrationImg;
 
@FindBy(xpath="//a[text()= 'Campaigns']")
private WebElement campaignlink;
	
   public HomePage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }


public WebElement getOrglink() {
	return orglink;
}


public WebElement getContactlnk() {
	return contactlnk;
}


public WebElement getOpplink() {
	return opplink;
}


public WebElement getHomepagelink() {
	return homepagelink;
}


public WebElement getSignOutLnk() {
	return signOutLnk;
}


public WebElement getAdminstrationImg() {
	return adminstrationImg;
}


public WebElement getCampaignLink()
{
	return campaignlink;
	
}

public void logOut() {

	wdu.moveToelement(driver,adminstrationImg);
	signOutLnk.click();
	
}


}
