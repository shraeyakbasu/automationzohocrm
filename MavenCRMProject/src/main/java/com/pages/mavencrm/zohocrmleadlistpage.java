package com.pages.mavencrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmleadlistpage extends Basepage implements Autoconstant
{
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@value='New Lead']")
	private WebElement newleadbutton;
	
	public zohocrmleadlistpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void newleadbuttonclick()
	{
		newleadbutton.click();
		String expectedtitle="Zoho CRM - Create Lead";
		String actualtitle=gettitle(driver);
		Assert.assertEquals(actualtitle, expectedtitle);
		Reporter.log("title matched",true);
		
		//Reporter.log(actualtitle,true);
	}
	
	public void leadlistdetails()
	{
		java.util.List<WebElement> elements=driver.findElements(By.xpath("//td[@class='tableData']/a"));
		for(int i=0;i<elements.size();i++)
		{
			if(elements.get(i).getText().contains("shraeyak basu"))
				System.out.println("passed");
			break;
		}
	}
	
	public void leadselect()
	{
		WebElement element=null;
		List<WebElement> elements=driver.findElements(By.xpath("//td[@class='tableData']/a"));
		for(int i=0;i<elements.size();i++)
		{
			if(elements.get(i).getText().contains("shraeyak basu"))
				 element = elements.get(i);
			element.click();
				
			break;
		}
		
		String expectedtitle="Zoho CRM - Lead Details";
		String actualtitle=gettitle(driver);
		Reporter.log(actualtitle,true);
		Assert.assertEquals(actualtitle, expectedtitle);
		Reporter.log("title matched",true);
	}

}
