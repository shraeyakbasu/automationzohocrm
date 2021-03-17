package com.pages.mavencrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmcontactlistpage extends Basepage implements Autoconstant
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@value='New Contact']")
	private WebElement newcontactbutton;
	
	public zohocrmcontactlistpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void createcontact()
	{
		newcontactbutton.click();
		String actualtitle=gettitle(driver);
		Reporter.log(actualtitle,true);
		
	}

}
