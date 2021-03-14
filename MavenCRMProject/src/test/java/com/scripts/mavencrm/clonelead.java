package com.scripts.mavencrm;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.mavencrm.Basetest;
import com.pages.mavencrm.zohocrmcloneleadpage;
import com.pages.mavencrm.zohocrmcreateleadpage;
import com.pages.mavencrm.zohocrmhomepage;
import com.pages.mavencrm.zohocrmleaddetailspage;
import com.pages.mavencrm.zohocrmleadlistpage;

public class clonelead extends Basetest

{
	@Test(description = "integration testing between create lead page and clone lead page")
	public void leadclone() throws IOException, InterruptedException
	{
		zohocrmhomepage zchp=new zohocrmhomepage(driver);
		zchp.leads();
		zohocrmleadlistpage zcllp=new zohocrmleadlistpage(driver);
		zcllp.newleadbuttonclick();
		zohocrmcreateleadpage zcclp=new zohocrmcreateleadpage(driver);
		zcclp.createlead();
		zchp.leads();
		zcllp.leadselect();
		zohocrmleaddetailspage zclddp=new zohocrmleaddetailspage(driver);
		zclddp.leadclone();
		zohocrmcloneleadpage zccldp= new zohocrmcloneleadpage(driver);
		zccldp.leadmatching();
	}

}
