package com.scripts.mavencrm;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.mavencrm.Basetest;
import com.generics.mavencrm.Utility;
import com.pages.mavencrm.zohocrmaccountlistpage;
import com.pages.mavencrm.zohocrmcreateaccountpage;
import com.pages.mavencrm.zohocrmhomepage;

@Listeners(Utility.class)
public class createaccount extends Basetest
{

	@Test(description = "integration testing between create account page and account list page")
	public void accountcreate() throws IOException, InterruptedException
	{
		zohocrmhomepage zhp=new zohocrmhomepage(driver);
		zhp.accounts();
		zohocrmaccountlistpage zcalp=new zohocrmaccountlistpage(driver);
		zcalp.newaccountclick();
		zohocrmcreateaccountpage zccap=new zohocrmcreateaccountpage(driver);
		zccap.createaccount();
		zhp.accounts();
		zcalp.findaccount();
		//zcalp.accountclick();
		
	}
}
