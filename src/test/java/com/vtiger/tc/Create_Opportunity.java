package com.vtiger.tc;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vtiger.generic.BaseClass;
import com.vtiger.pompages.CampaignPage;
import com.vtiger.pompages.CreateOpportunityPage;
import com.vtiger.pompages.HomePage;
import com.vtiger.pompages.OpportunitiesPage;

public class Create_Opportunity extends BaseClass{
	
	
	@Test
	public void  createopportunity()
	{
		HomePage hp=new HomePage(driver);
		wdu.moveToelement(driver,hp.getOpplink());
		//hp.getOpplink().click();
		
		
		OpportunitiesPage opp=new OpportunitiesPage(driver);
		opp.getCreateopportunitybtn().click();
		
		CreateOpportunityPage copp=new CreateOpportunityPage(driver);
		copp.createopportunity("XXXXX");
		//copp.getOpportunityname().sendKeys("CVBNNM");
		wdu.selectdropdownbyvalue(copp.getRelateddd(), "Organizations");
		wdu.switchToWindow(driver, "winid");
		copp.oppselectorg("SBI");
		//switch back s
		wdu.switchToWindow(driver,"Opportunities");
        wdu.selectdropdownbyvalue(copp.getAssigneddd(), "Team Selling" );
        wdu.selectdropdownbyvalue(copp.getStagedd(), "Prospecting");
        
		//wdu.waitandclick(driver, xpath);
		copp.getOppsavebtn().click();
		
		
		hp.getCampaignLink().click();
		
		CampaignPage camppage=new CampaignPage(driver);
		camppage.getCreatecampbtn().click(); 
		
		camppage.getCampsearchbox().sendKeys("SBI");
		wdu.selectdropdownbyvalue(camppage.getSelectcamptypedd(),"Campaign Name");
		camppage.getSubmitbtn().click();
//wdu.verify(actual, expected, page);
	}
	
}
