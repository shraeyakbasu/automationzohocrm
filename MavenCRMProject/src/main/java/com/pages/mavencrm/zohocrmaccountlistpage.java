package com.pages.mavencrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmaccountlistpage extends Basepage implements Autoconstant
{

	WebDriver driver;
	
	@FindBy(xpath="//input[@value='New Account']")
	private WebElement newaccountbutton;
	
	@FindBy(xpath="//select[@id='currentOption']")
	private WebElement recordperpagedropdown;
	
	public zohocrmaccountlistpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void findaccount() throws InterruptedException
	{
		Thread.sleep(3000);
		selectbyvalue(recordperpagedropdown, "20");
		java.util.List<WebElement> accounts=driver.findElements(By.xpath("//td[@class='tableData']/a"));
		for(int i=0;i<accounts.size();i++)
		{
			
			if(accounts.get(i).getText().contains("bose enterprize"))
			{
			System.out.println(accounts.get(i).getText());
			Reporter.log("account found",true);
				break;
				
			}
			
		}
	}
	
	public void accountclick()
	{
		WebElement account=null;
		selectbyvalue(recordperpagedropdown, "20");
		java.util.List<WebElement> accountstoselect=driver.findElements(By.xpath("//td[@class='tableData']/a"));
		for(int i=0;i<accountstoselect.size();i++)
		{
			if(accountstoselect.get(i).getText().contains("bose enterprize"))
			{
				account=accountstoselect.get(i);
			account.click();
			break;
			}
		}
	}
	
	
	public void newaccountclick()
	{
		newaccountbutton.click();
		String actualtitle=gettitle(driver);
		Reporter.log(actualtitle,true);
	}
}
