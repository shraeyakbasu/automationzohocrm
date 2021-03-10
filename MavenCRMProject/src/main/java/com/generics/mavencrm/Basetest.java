package com.generics.mavencrm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pages.mavencrm.zohocrmhomepage;
import com.pages.mavencrm.zohocrmloginpage;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest implements Autoconstant
{
	public WebDriver driver;

	@BeforeClass
	public void openbrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url1);
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		zohocrmloginpage zlp= new zohocrmloginpage(driver);
		zlp.login();
	}
	
	
	@AfterMethod
	public void logout()
	{
		zohocrmhomepage zhp=new zohocrmhomepage(driver);
		zhp.logout();
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
}
