package com.pages.mavencrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmeditleadpage extends Basepage implements Autoconstant
{

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='property(First Name)']")
	private WebElement firstnametext;
	
	@FindBy(xpath="//input[@name='property(Last Name)']")
	private WebElement lastnametext;
	
	@FindBy(xpath="//input[@name='property(Email)']")
	private WebElement emailidtext;
	
	
	
	
	public zohocrmeditleadpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void checkelement()
	{
		String actualtitle=gettitle(driver);
		Reporter.log(actualtitle,true);
		if(firstnametext.getAttribute("value").equalsIgnoreCase("shraeyak")&&lastnametext.getAttribute("value").equalsIgnoreCase("basu")&& emailidtext.getAttribute("value").equalsIgnoreCase("abc@gmail.com"))
			Reporter.log("element found",true);
	}
}
