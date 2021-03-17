package com.pages.mavencrm;

import java.io.IOException;
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
import com.generics.mavencrm.Excellibrary;

public class zohocrmcreateaccountpage extends Basepage implements Autoconstant
{

	 WebDriver driver;
	
	@FindBy(xpath="//input[@name='property(Account Name)']")
	private WebElement accountnametext;
	
	@FindBy(xpath="//input[@name='property(Account Site)']")
	private WebElement accountsitetext;
	
	@FindBy(xpath="//input[@name='property(Account Number)']")
	private WebElement accountnunbertext;
	
	@FindBy(xpath="//input[@name='property(Annual Revenue)']")
	private WebElement annualrevenuetext;
	
	@FindBy(xpath="//input[@name='property(Phone)']")
	private WebElement phonetext;
	
	@FindBy(xpath="//input[@name='property(Fax)']")
	private WebElement faxtext;
	
	@FindBy(xpath="//input[@name='property(Website)']")
	private WebElement websitenametext;
	
	@FindBy(xpath="//input[@name='property(Ticker Symbol)']")
	private WebElement tickersymboltext;
	
	@FindBy(xpath="//input[@name='property(Employees)']")
	private WebElement employeetext;
	
	@FindBy(xpath="//input[@name='property(SIC Code)']")
	private WebElement siccodetext;
	
	@FindBy(xpath="//input[@name='property(Billing Street)']")
	private WebElement billingstreettext;
	
	@FindBy(xpath="//input[@name='property(Billing City)']")
	private WebElement billingcitytext;
	
	@FindBy(xpath="//input[@name='property(Billing State)']")
	private WebElement billingstatetext;
	
	@FindBy(xpath="//input[@name='property(Billing Code)']")
	private WebElement billingcodetext;
	
	@FindBy(xpath="//input[@name='property(Billing Country)']")
	private WebElement billingcountrytext;
	
	@FindBy(xpath="//select[@name='property(Account Type)']")
	private WebElement accounttypedropdown;
	
	@FindBy(xpath="//select[@name='property(Industry)']")
	private WebElement industrydropdown;
	
	@FindBy(xpath="//select[@name='property(Rating)']")
	private WebElement ratingdropdown;
	
	@FindBy(xpath="//select[@name='property(Ownership)']")
	private WebElement ownershipdropdown;
	
	@FindBy(xpath="//input[@id='copyAddress']")
	private WebElement copyaddressbutton;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement savebutton;
	
	@FindBy(xpath="//img[@title='Account Name Lookup']")
	private WebElement accountnamelookup;
	
	
	public zohocrmcreateaccountpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void parentaccountselect() throws InterruptedException
	{
		WebElement element=null;
		accountnamelookup.click();
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowhandles);
		driver.switchTo().window(al.get(1));
		System.out.println(gettitle(driver));
		Thread.sleep(3000);
		java.util.List<WebElement> elements=driver.findElements(By.xpath("//td[@class='tableData']/a"));
		for(int i=0;i<elements.size();i++)
		{
			if(elements.get(i).getText().contains("accenture"))
			{
				element=elements.get(i);
			element.click();
			break;
			}
		}
		driver.switchTo().window(al.get(0));
	}
	
	public void copyaddressbuttonclick()
	{
		copyaddressbutton.click();
		driver.findElement(By.xpath("//td[contains(text(),'Billing to Shipping')]")).click();
	}
	
	public void createaccount() throws IOException, InterruptedException
	{
		accountnametext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 0));
		accountsitetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 1));
		accountnunbertext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 2));
		annualrevenuetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 3));
		phonetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 4));
		faxtext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 5));
		websitenametext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 6));
		employeetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 8));
		siccodetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 9));
		billingstreettext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 10));
		billingcitytext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 11));
		billingstatetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 12));
		billingcodetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 13));
		billingcountrytext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, accountdetails, 1, 14));
		parentaccountselect();
		selectbyvalue(accounttypedropdown, "Customer");
		selectbyvalue(industrydropdown, "Large Enterprise");
		selectbyvalue(ratingdropdown, "Active");
		selectbyvalue(ownershipdropdown, "Private");
		copyaddressbuttonclick();
		savebutton.click();
		
	
	}
}
