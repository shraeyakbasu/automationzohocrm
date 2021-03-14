package com.scripts.mavencrm;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.mavencrm.Basetest;

@Listeners(com.generics.mavencrm.Utility.class)
public class loginlogout extends Basetest
{
	@Test(description="checking login,logout feature")
	public void loginandlogout()
	{
		
		
	}
}
