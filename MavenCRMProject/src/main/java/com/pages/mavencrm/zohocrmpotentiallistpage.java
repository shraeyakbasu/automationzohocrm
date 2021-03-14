package com.pages.mavencrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.generics.mavencrm.Basepage;

public class zohocrmpotentiallistpage extends Basepage
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@value='New Potential']")
	private WebElement newpotentialbutton;
	
	public zohocrmpotentiallistpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void newpotentials()
	{
		newpotentialbutton.click();
		String expectedtitle="Zoho CRM - Create Potential";
		String actualtitle=gettitle(driver);
		Reporter.log(actualtitle,true);
		Assert.assertEquals(actualtitle, expectedtitle);
		Reporter.log("title matched",true);
		
		
		
	}

}
