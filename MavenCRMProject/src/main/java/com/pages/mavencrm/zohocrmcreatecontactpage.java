package com.pages.mavencrm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmcreatecontactpage extends Basepage implements Autoconstant
{

	WebDriver driver;
	
	@FindBy(xpath="//img[@title='Account Name Lookup']")
	private WebElement accountnamelookupicon;
	
	public zohocrmcreatecontactpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void accountnamecheck() throws InterruptedException
	{
		WebElement account;
		accountnamelookupicon.click();
		Thread.sleep(3000);
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowhandles);
		driver.switchTo().window(al.get(1));
		String actualtitle=gettitle(driver);
		Reporter.log(actualtitle,true);
		List<WebElement> accounts=driver.findElements(By.xpath("//td[@class='tableData']/a"));
		for(int i=0;i<accounts.size();i++)
		{
		
			if(accounts.get(i).getText().contains("bose enterprize"))
			{
				account=accounts.get(i);
				System.out.println(account.getText());
				Reporter.log("account found",true);
				break;
			}
			
		}
		driver.switchTo().window(al.get(0));	
	}
	
	
}
