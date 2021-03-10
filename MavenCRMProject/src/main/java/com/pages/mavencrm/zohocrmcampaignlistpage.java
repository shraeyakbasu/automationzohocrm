package com.pages.mavencrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmcampaignlistpage extends Basepage implements Autoconstant

{
	WebDriver driver;
	
	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newcampaignbutton;

	public zohocrmcampaignlistpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void newcampaign()
	{
		newcampaignbutton.click();
	}
}