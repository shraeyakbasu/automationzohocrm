package com.scripts.mavencrm;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.mavencrm.Basetest;
import com.generics.mavencrm.Utility;
import com.pages.mavencrm.zohocrmcampaigndetailspage;
import com.pages.mavencrm.zohocrmcampaignlistpage;
import com.pages.mavencrm.zohocrmcreatecampaignpage;
import com.pages.mavencrm.zohocrmhomepage;


@Listeners(Utility.class)
public class editcampaign extends Basetest

{
	@Test(description="integration testing between create campaign and edit campaign page")
	public void editcampaigns() throws IOException
	{
		zohocrmhomepage zchp=new zohocrmhomepage(driver);
		zchp.campaign();
		zohocrmcampaignlistpage zcclp=new zohocrmcampaignlistpage(driver);
		zcclp.newcampaign();
		zohocrmcreatecampaignpage zccmp=new zohocrmcreatecampaignpage(driver);
		zccmp.createcampaign();
		zchp.campaign();
		zcclp.campaigndetails();
		zcclp.campaignselect();
		zohocrmcampaigndetailspage zcdp=new zohocrmcampaigndetailspage(driver);
		zcdp.edit();
		
		
	}

}
