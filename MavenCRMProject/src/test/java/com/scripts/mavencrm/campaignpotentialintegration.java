package com.scripts.mavencrm;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.mavencrm.Basetest;
import com.generics.mavencrm.Utility;
import com.pages.mavencrm.zohocrmcampaignlistpage;
import com.pages.mavencrm.zohocrmcreatecampaignpage;
import com.pages.mavencrm.zohocrmcreatepotentialpage;
import com.pages.mavencrm.zohocrmhomepage;
import com.pages.mavencrm.zohocrmpotentiallistpage;

@Listeners(Utility.class)
public class campaignpotentialintegration extends Basetest
{
	@Test(description="integration between create campaign page and potential campaign name lookup page")
	public void campaignpotential() throws IOException, InterruptedException
	{
		zohocrmhomepage zchp=new zohocrmhomepage(driver);
		zchp.campaign();
		zohocrmcampaignlistpage zclp=new zohocrmcampaignlistpage(driver);
		zclp.newcampaign();
		zohocrmcreatecampaignpage zccp=new zohocrmcreatecampaignpage(driver);
		zccp.createcampaign();
		zchp.potential();
		zohocrmpotentiallistpage zcptp=new zohocrmpotentiallistpage(driver);
		zcptp.newpotentials();
		zohocrmcreatepotentialpage zccptp=new zohocrmcreatepotentialpage(driver);
		zccptp.campaignsourcelookupicon();
		
		
	}

}
