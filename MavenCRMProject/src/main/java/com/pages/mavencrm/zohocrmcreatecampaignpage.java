package com.pages.mavencrm;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;
import com.generics.mavencrm.Excellibrary;

public class zohocrmcreatecampaignpage extends Basepage implements Autoconstant
{

	WebDriver driver;
	
	@FindBy(xpath="//input[@name='property(Campaign Name)']")
	private WebElement campaignnametextfield;
	
	@FindBy(xpath="//input[@name='property(Start Date)']")
	private WebElement startdatetextfield;
	
	@FindBy(xpath="//input[@name='property(Expected Revenue)']")
	private WebElement expectedrevenuetextfield;
	
	@FindBy(xpath="//input[@name='property(Actual Cost)']")
	private WebElement actualcosttext;
	
	@FindBy(xpath="//input[@name='property(Num sent)']")
	private WebElement numsenttext;
	
	@FindBy(xpath="//select[@name='property(Type)']")
	private WebElement typedropdown;
	
	@FindBy(xpath="//select[@name='property(Status)']")
	private WebElement statusdropdown;
	
	@FindBy(xpath="//input[@name='property(End Date)']")
	private WebElement enddatetextfield;
	
	@FindBy(xpath="//input[@name='property(Budgeted Cost)']")
	private WebElement budgetedcosttext;
	
	@FindBy(xpath="//input[@name='property(Expected Response)']")
	private WebElement expectedresponsetext;
	
	@FindBy(xpath="(//input[@value='Save'])[1]")
	private WebElement savebutton;
	
	@FindBy(xpath="(//input[@value='Cancel'])[1]")
	private WebElement cancelbutton;
	
	@FindBy(xpath="(//input[@value='Save & New'])[1]")
	private WebElement saveandnewbutton;
	
	
	
	public zohocrmcreatecampaignpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createcampaign() throws IOException
	{
		String actualtitle=gettitle(driver);
	    String expectedtitle="Zoho CRM - Create Campaign";
	    Assert.assertEquals(actualtitle, expectedtitle);
	    System.out.println("matched");
		campaignnametextfield.sendKeys(Excellibrary.Getstringcellvalue(excelpath, campaigndetails, 1, 0));
	    startdatetextfield.sendKeys(Excellibrary.Getstringcellvalue(excelpath, campaigndetails, 1, 1));
	    expectedrevenuetextfield.sendKeys(Excellibrary.Getstringcellvalue(excelpath, campaigndetails, 1, 2));
	    actualcosttext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, campaigndetails, 1, 3));
	    numsenttext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, campaigndetails, 1, 4));
	    enddatetextfield.sendKeys(Excellibrary.Getstringcellvalue(excelpath, campaigndetails, 1, 5));
	    budgetedcosttext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, campaigndetails, 1, 6));
	    expectedresponsetext.sendKeys(Excellibrary.Getstringcellvalue(excelpath, campaigndetails, 1, 7));
	    selectbyvalue(typedropdown, "Trade Show");
	    selectbyvalue(statusdropdown, "Planning");
	    savebutton.click();
	    
	
	
	
	}
	
}
