package com.scripts.mavencrm;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.mavencrm.Basetest;
import com.pages.mavencrm.zohocrmcreateleadpage;
import com.pages.mavencrm.zohocrmhomepage;
import com.pages.mavencrm.zohocrmleadlistpage;

public class createlead extends Basetest
{
	@Test(description="integration test between create lead page and lead list page")
	public void createnewlead() throws IOException, InterruptedException
	{
	zohocrmhomepage zchp=new zohocrmhomepage(driver);
	zchp.leads();
	zohocrmleadlistpage zcllp=new zohocrmleadlistpage(driver);
	zcllp.newleadbuttonclick();
	zohocrmcreateleadpage zcclp=new zohocrmcreateleadpage(driver);
	zcclp.createlead();
	zchp.leads();
	zcllp.leadlistdetails();
	}

}
