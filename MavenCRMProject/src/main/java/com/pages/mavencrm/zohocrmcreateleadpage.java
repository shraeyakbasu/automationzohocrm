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

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;
import com.generics.mavencrm.Excellibrary;

public class zohocrmcreateleadpage extends Basepage implements Autoconstant
{

	WebDriver driver;
	
	@FindBy(xpath="//select[@name='property(saltName)']")
	private WebElement firstnamedropdown;
	
	@FindBy(xpath="//input[@name='property(First Name)']")
	private WebElement firstnametext;
	
	@FindBy(xpath="//input[@name='property(Last Name)']")
	private WebElement lastnametext;
	
	@FindBy(xpath="(//input[@maxlength='50'])[1]")
	private WebElement designationtext;
	
	@FindBy(xpath="//input[@name='property(Phone)']")
	private WebElement phonetext;
	
	@FindBy(xpath="//input[@name='property(Mobile)']")
	private WebElement mobiletext;
	
	@FindBy(xpath="//select[@name='property(Lead Source)']")
	private WebElement leadsourcedropdown;
	
	@FindBy(xpath="//select[@name='property(Industry)']")
	private WebElement industrydropdown;
	
	@FindBy(xpath="//input[@name='property(Annual Revenue)']")
	private WebElement annualrevenuetext;
	
	@FindBy(xpath="//input[@name='property(Campaign Source)']")
	private WebElement campaignsourcelookuptext;
	
	@FindBy(xpath="//img[@title='Campaign Name Lookup']")
	private WebElement campaignsourcelookupicon;
	
	@FindBy(xpath="//input[@name='property(Company)']")
	private WebElement companynametext;
	
	@FindBy(xpath="//input[@name='property(Email)']")
	private WebElement emailtext;
	
	@FindBy(xpath="//input[@name='property(Fax)']")
	private WebElement faxtext;
	
	@FindBy(xpath="//input[@name='property(Website)']")
	private WebElement websitetext;
	
	@FindBy(xpath="//select[@name='property(Lead Status)']")
	private WebElement leadstatusdropdown;
	
	@FindBy(xpath="//input[@name='property(No of Employees)']")
	private WebElement numberofemployeetext;
	
	@FindBy(xpath="//select[@name='property(Rating)']")
	private WebElement ratingdropdown;
	
	@FindBy(xpath="//input[@name='property(Street)']")
	private WebElement streettext;
	
	@FindBy(xpath="//input[@name='property(State)']")
	private WebElement statetext;
	
	@FindBy(xpath="//input[@name='property(Country)']")
	private WebElement countrytext;
	
	@FindBy(xpath="//input[@name='property(City)']")
	private WebElement citytext;
	
	@FindBy(xpath="//input[@name='property(Zip Code)']")
	private WebElement ziptext;
	
	@FindBy(xpath="(//input[@value='Save'])[1]")
	private WebElement savebutton;
	
	
	
	public zohocrmcreateleadpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void campaignsourcelookupclick() throws InterruptedException
	{
		WebElement element=null;
		campaignsourcelookupicon.click();
		Thread.sleep(3000);
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowhandles);
		driver.switchTo().window(al.get(1));
		List<WebElement> elements=driver.findElements(By.xpath("//td[@class='tableData']/a"));
		for(int i=0;i<elements.size();i++)
		{
			if(elements.get(i).getText().contains("samsung mobile"))
				element=elements.get(i);
			element.click();
			break;
		}
		driver.switchTo().window(al.get(0));
		
	}
	
	public void createlead() throws IOException, InterruptedException
	{
		selectbyvalue(firstnamedropdown, "Mr.");
		firstnametext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails,1 , 0));
		lastnametext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 1));
		designationtext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 2));
		phonetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 3));
		mobiletext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 4));
		companynametext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 5));
		emailtext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 6));
		faxtext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 7));
		websitetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 8));
		numberofemployeetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 9));
		streettext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 10));
		statetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 11));
		countrytext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 12));
		citytext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 13));
		ziptext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, leaddetails, 1, 14));
		selectbyvalue(leadsourcedropdown, "Advertisement");
		selectbyvalue(industrydropdown, "Large Enterprise");
		selectbyvalue(leadstatusdropdown, "Contacted");
		selectbyvalue(ratingdropdown, "Active");
		campaignsourcelookupclick();
		savebutton.click();
		
		
	
	}
	
	
}
