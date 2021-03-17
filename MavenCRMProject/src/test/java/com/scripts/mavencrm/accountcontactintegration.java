package com.scripts.mavencrm;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.mavencrm.Basetest;
import com.generics.mavencrm.Utility;
import com.pages.mavencrm.zohocrmaccountlistpage;
import com.pages.mavencrm.zohocrmcontactlistpage;
import com.pages.mavencrm.zohocrmcreateaccountpage;
import com.pages.mavencrm.zohocrmcreatecontactpage;
import com.pages.mavencrm.zohocrmhomepage;

@Listeners(Utility.class)
public class accountcontactintegration extends Basetest
{

	@Test(description = "integration between create account page and contact-account lookup page")
	public void integrationaccountcontact() throws IOException, InterruptedException
	{
		zohocrmhomepage zhp=new zohocrmhomepage(driver);
		zhp.accounts();
		zohocrmaccountlistpage zcalp=new zohocrmaccountlistpage(driver);
		zcalp.newaccountclick();
		zohocrmcreateaccountpage zccap=new zohocrmcreateaccountpage(driver);
		zccap.createaccount();
		zhp.contact();
		zohocrmcontactlistpage zcclp=new zohocrmcontactlistpage(driver);
		zcclp.createcontact();
		zohocrmcreatecontactpage zcccp=new zohocrmcreatecontactpage(driver);
		zcccp.accountnamecheck();
		
	}
}
