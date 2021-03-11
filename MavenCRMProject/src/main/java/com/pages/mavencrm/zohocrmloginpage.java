package com.pages.mavencrm;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;
import com.generics.mavencrm.Excellibrary;

public class zohocrmloginpage extends Basepage implements Autoconstant
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement useridtextfield;
	
	@FindBy(xpath="//input[@id='passWord']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement signinbutton;
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
	private WebElement forgotpasswordlink;
	
	@FindBy(xpath="//img[@title=\"New User Registration\"]")
	private WebElement newuserregbutton;
	
	@FindBy(xpath="(//input[@type=\"checkbox\"])[1]")
	private WebElement remembermecheckbox;
	
	
	public zohocrmloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

	public void login() throws IOException
	{
		
		useridtextfield.sendKeys(Excellibrary.Getstringcellvalue(excelpath, logindetails, 1, 0));
		passwordtextfield.sendKeys(Excellibrary.Getstringcellvalue(excelpath, logindetails, 1, 1));
		remembermecheckbox.click();
		signinbutton.click();
		
	}
	
	public void forgotpassword()
	{
		forgotpasswordlink.click();
	}
	
	public void newuserregistration()
	{
		newuserregbutton.click();
	}
	
}
