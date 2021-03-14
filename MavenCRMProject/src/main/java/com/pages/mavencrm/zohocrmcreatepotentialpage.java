package com.pages.mavencrm;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zohocrmcreatepotentialpage 
{
	WebDriver driver;
	
	@FindBy(xpath="//img[@title='Campaign Name Lookup']")
	private WebElement campaignsourcelookup;
	
	public zohocrmcreatepotentialpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void campaignsourcelookupicon() throws InterruptedException
	{
		WebElement element=null;
		campaignsourcelookup.click();
		Thread.sleep(6000);
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowhandles);
		driver.switchTo().window(al.get(0));
		java.util.List<WebElement> elements=driver.findElements(By.xpath("//td[@class='tableData']/a"));
	    for(int i=0;i<elements.size();i++)
	    {
	    	if(elements.get(i).getText().contains("samsung mobile"))
	    		element=elements.get(i);
	    	element.click();
	    		//Reporter.log(element);
	    	//System.out.println(elements.get(i).getText());
	    	break;
	    }
		
	
	}

}
