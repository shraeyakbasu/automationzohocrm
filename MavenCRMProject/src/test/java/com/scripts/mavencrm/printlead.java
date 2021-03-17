package com.scripts.mavencrm;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.mavencrm.Basetest;
import com.generics.mavencrm.Utility;
import com.pages.mavencrm.zohocrmcreateleadpage;
import com.pages.mavencrm.zohocrmhomepage;
import com.pages.mavencrm.zohocrmleaddetailspage;
import com.pages.mavencrm.zohocrmleadlistpage;
import com.pages.mavencrm.zohocrmprintpreviewpage;

@Listeners(Utility.class)
public class printlead extends Basetest
{

	@Test(description = "integration between create lead page and print lead page")
	public void leadprint() throws IOException, InterruptedException
	{
		zohocrmhomepage zchp=new zohocrmhomepage(driver);
		zchp.leads();
		zohocrmleadlistpage zcllp=new zohocrmleadlistpage(driver);
		zcllp.newleadbuttonclick();
		zohocrmcreateleadpage zcclp=new zohocrmcreateleadpage(driver);
		zcclp.createlead();
		zchp.leads();
		zcllp.leadselect();
		zohocrmleaddetailspage zcldp=new zohocrmleaddetailspage(driver);
		zcldp.leadprintpreview();
		zohocrmprintpreviewpage zcppg=new zohocrmprintpreviewpage(driver);
		zcppg.searchelement();
		
	}
}
