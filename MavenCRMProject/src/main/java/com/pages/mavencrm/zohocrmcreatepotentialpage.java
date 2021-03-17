package com.pages.mavencrm;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmcreatepotentialpage extends Basepage implements Autoconstant
{
	WebDriver driver;
	
	@FindBy(xpath="//img[@title='Campaign Name Lookup']")
	private WebElement campaignsourcelookup;
	
	@FindBy(xpath="//img[@title='Account Name Lookup']")
	private WebElement accountnamelookup;
	
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
		driver.switchTo().window(al.get(1));
		String actualtitle=gettitle(driver);
		Reporter.log(actualtitle,true);
		java.util.List<WebElement> elements=driver.findElements(By.xpath("//td[@class='tableData']/a"));
	    for(int i=0;i<elements.size();i++)
	    {
	    	if(elements.get(i).getText().contains("samsung mobile"))
	    		element=elements.get(i);
	    	System.out.println(element.getText());
	    	Reporter.log("element found",true);
	    	break;
	    }
	    driver.switchTo().window(al.get(0));
	    }

	public void accountnamelookupicon() throws InterruptedException
	{
		
		WebElement element1=null;
		accountnamelookup.click();
		Thread.sleep(6000);
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al1=new ArrayList<String>(windowhandles);
		driver.switchTo().window(al1.get(1));
		String actualtitle=gettitle(driver);
		Reporter.log(actualtitle,true);
		java.util.List<WebElement> elementss=driver.findElements(By.xpath("//td[@class='tableData']/a"));
	    for(int i=0;i<elementss.size();i++)
	    {
	    	if(elementss.get(i).getText().contains("bose enterprize"))
	    	{
	    		element1=elementss.get(i);
	    	System.out.println(element1.getText());
	    	Reporter.log("element found",true);
	    	break;
	    	}
	    }
	    driver.switchTo().window(al1.get(0));
	    }
		
	
}
