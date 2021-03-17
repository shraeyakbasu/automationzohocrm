package com.pages.mavencrm;

import org.openqa.selenium.By;
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
	
	public void campaigndetails()
	{
		java.util.List<WebElement> elements=driver.findElements(By.xpath("//td[@class='tableData']/a"));
		for(int i=0;i<elements.size();i++)
		{
	    if(elements.get(i).getText().contains("samsung mobile"))
	    	System.out.println(elements.get(i).getText());
	    break;
		}
	    
	}

	public void campaignselect() 
	{
		WebElement element=null;
		java.util.List<WebElement> elementstoselect=driver.findElements(By.xpath("//td[@class='tableData']/a"));
		for(int i=0;i<elementstoselect.size();i++)
		{
	    if(elementstoselect.get(i).getText().contains("samsung mobile"))
	    	 element=elementstoselect.get(i);
	    element.click();
	    break;
		}
	
	}
}
