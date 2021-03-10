package com.scripts.mavencrm;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.mavencrm.Basetest;
import com.pages.mavencrm.zohocrmcampaignlistpage;
import com.pages.mavencrm.zohocrmcreatecampaignpage;
import com.pages.mavencrm.zohocrmhomepage;

public class createcampaign extends Basetest
{

	@Test(description="integration test case between create campaign and campaign list page ")
	public void newcampaign() throws IOException
	{
		zohocrmhomepage zchp=new zohocrmhomepage(driver);
		zchp.campaign();
		zohocrmcampaignlistpage zcclp=new zohocrmcampaignlistpage(driver);
		zcclp.newcampaign();
		zohocrmcreatecampaignpage zccmp=new zohocrmcreatecampaignpage(driver);
		zccmp.createcampaign();
		zchp.campaign();
	}
}
