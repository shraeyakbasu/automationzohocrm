package com.pages.mavencrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmhomepage extends Basepage implements Autoconstant
{

	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='topLink'])[6]")
	private WebElement logoutlink;
	
	
	public zohocrmhomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{
		javascriptexecuterclick(logoutlink, driver);
	}
}
