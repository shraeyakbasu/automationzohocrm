package com.pages.mavencrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class zohocrmcloneleadpage 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='property(First Name)']")
	private WebElement firstnametext;
	
	@FindBy(xpath="//input[@name='property(Last Name)']")
	private WebElement lastnametext;
	
	@FindBy(xpath="//input[@name='property(Email)']")
	private WebElement emailtext;
	
	public zohocrmcloneleadpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void leadmatching()
	{
		String firstname=firstnametext.getAttribute("value");
		String lastname=lastnametext.getAttribute("value");
		String email=emailtext.getAttribute("value");
		if(firstname.equalsIgnoreCase("shraeyak")||lastname.equalsIgnoreCase("basu")||email.equalsIgnoreCase("abc@gmail.com"))
			Reporter.log("lead found",true);
	}

}
