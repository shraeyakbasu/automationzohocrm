package com.pages.mavencrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmleaddetailspage extends Basepage implements Autoconstant
{

	public WebDriver driver;
	
	@FindBy(xpath="(//input[@value='Edit'])[1]")
	private WebElement editbutton;
	
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	private WebElement deletebutton;
	
	@FindBy(xpath="(//input[@value='Clone'])[1]")
	private WebElement clonebutton;
	
	@FindBy(xpath="(//input[@value='Convert'])[1]")
	private WebElement convertbutton;
	
	@FindBy(xpath="(//input[@value='Print Preview '])[1]")
	private WebElement printpreviewbutton;
	
	
	
	
	public zohocrmleaddetailspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void leadedit()
	{
		editbutton.click();
	}
	
	public void leaddelete()
	{
		deletebutton.click();
	}
	
	public void leadclone()
	{
		clonebutton.click();
		String expectedtitle="Zoho CRM - Clone Lead";
		String actualtitle=gettitle(driver);
		Reporter.log(actualtitle,true);
		Assert.assertEquals(actualtitle, expectedtitle);
		Reporter.log("title matched",true);
	}
	
	public void leadconvert()
	{
		convertbutton.click();
	}
	
	public void leadprintpreview()
	{
		printpreviewbutton.click();
		
	}
}
