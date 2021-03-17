package com.scripts.mavencrm;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.mavencrm.Basetest;
import com.generics.mavencrm.Utility;
import com.pages.mavencrm.zohocrmaccountlistpage;
import com.pages.mavencrm.zohocrmcreateaccountpage;
import com.pages.mavencrm.zohocrmcreatepotentialpage;
import com.pages.mavencrm.zohocrmhomepage;
import com.pages.mavencrm.zohocrmpotentiallistpage;

@Listeners(Utility.class)
public class accountpotentialintegration extends Basetest
{

	@Test(description = "integration between create account page and potential account name lookup page" )
	public void integrationaccountpotential() throws IOException, InterruptedException
	{
		zohocrmhomepage zhp=new zohocrmhomepage(driver);
		zhp.accounts();
		zohocrmaccountlistpage zcalp=new zohocrmaccountlistpage(driver);
		zcalp.newaccountclick();
		zohocrmcreateaccountpage zccap=new zohocrmcreateaccountpage(driver);
		zccap.createaccount();
		zhp.potential();
		zohocrmpotentiallistpage zcplp=new zohocrmpotentiallistpage(driver);
		zcplp.newpotentials();
		zohocrmcreatepotentialpage zccpp=new zohocrmcreatepotentialpage(driver);
		zccpp.accountnamelookupicon();
	}
}
