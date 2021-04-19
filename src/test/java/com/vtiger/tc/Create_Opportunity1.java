package com.vtiger.tc;

import org.testng.annotations.Test;

import com.vtiger.generic.BaseClass;
import com.vtiger.pompages.CampaignPage;
import com.vtiger.pompages.CreateOpportunityPage;
import com.vtiger.pompages.HomePage;
import com.vtiger.pompages.OpportunitiesPage;

public class Create_Opportunity1 extends BaseClass {
	@Test
	public void createopportunity1()
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
		//switch back 
		wdu.switchToWindow(driver,"Opportunities");
        wdu.selectdropdownbyvalue(copp.getAssigneddd(), "Team Selling" );
        wdu.selectdropdownbyvalue(copp.getStagedd(), "Qualification");
		
	copp.getOppsavebtn().click();
		
		
		hp.getCampaignLink().click();
		
		CampaignPage camppage=new CampaignPage(driver);
		camppage.getCreatecampbtn().click(); 
		
		camppage.getCampsearchbox().sendKeys("SBI");
		wdu.selectdropdownbyvalue(camppage.getSelectcamptypedd(),"Campaign Name");
		camppage.getSubmitbtn().click();
	}

}
