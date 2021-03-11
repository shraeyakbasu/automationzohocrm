package com.pages.mavencrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmcampaigndetailspage extends Basepage implements Autoconstant

{
	WebDriver driver;
	
	@FindBy(xpath="(//input[@name='edit2'])[1]")
	private WebElement editbutton;
	
	@FindBy(xpath="(//input[@name='Delete2'])[1]")
	private WebElement deletebutton;
	
	@FindBy(xpath="(//input[@name='Clone2'])[1]")
	private WebElement clonebutton;
	
	@FindBy(xpath="(//input[@name='Print2'])[1]")
	private WebElement printbutton;
	
	public zohocrmcampaigndetailspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void edit()
	{
		editbutton.click();
		String actualtitle=gettitle(driver);
		String expectedtitle="Zoho CRM - Edit Campaign";
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("matched");
	}
	
	public void delete()
	{
		deletebutton.click();
	}
	
	public void clones()
	{
		clonebutton.click();
	}
	
	public void printpreview()
	{
		printbutton.click();
		gettitle(driver);
	}
	
}
