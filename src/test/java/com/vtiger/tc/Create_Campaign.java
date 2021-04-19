package com.vtiger.tc;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vtiger.pompages.CampaignPage;
import com.vtiger.pompages.HomePage;

public class Create_Campaign {
	WebDriver driver;

@Test
public void createcampaign()
{
	HomePage hp=new HomePage(driver);
	hp.getCampaignLink().click();
	
	CampaignPage camppage=new CampaignPage(driver);
	camppage.getCreatecampbtn().click();
	
	
}

}
