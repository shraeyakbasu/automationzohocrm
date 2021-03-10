package com.pages.mavencrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmhomepage extends Basepage implements Autoconstant
{

	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='topLink'])[6]")
	private WebElement logoutlink;
	
	@FindBy(xpath="(//a[contains(text(),'Leads')])[1]")
	private WebElement leadslink;
	
	@FindBy(xpath="(//a[contains(text(),'Accounts')])[1]")
	private WebElement accountslink;
	
	@FindBy(xpath="(//a[contains(text(),'Contacts')])[1]")
	private WebElement contactslink;
	
	@FindBy(xpath="(//a[contains(text(),'Potentials')])[1]")
	private WebElement potentialslink;
	
	@FindBy(xpath="(//a[contains(text(),'Campaigns')])[1]")
	private WebElement campaignslink;
	
	@FindBy(xpath="(//a[contains(text(),'Product')])[1]")
	private WebElement productslink;
	
	@FindBy(xpath="(//a[contains(text(),'Price Books')])[1]")
	private WebElement pricebookslink;
	
	@FindBy(xpath="(//a[contains(text(),'Quotes')])[1]")
	private WebElement quoteslink;
	
	@FindBy(xpath="(//a[contains(text(),'Sales Orders')])[1]")
	private WebElement salesorderlink;
	
	@FindBy(xpath="(//a[contains(text(),'Purchase Orders')])[1]")
	private WebElement purchaseorderlink;
	
	@FindBy(xpath="(//a[contains(text(),'Invoices')])[1]")
	private WebElement invoicelink;
	
	
	
	
	
	public zohocrmhomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void leads()
	{
		leadslink.click();
		gettitle(driver);
	}
	
	public void accounts()
	{
		accountslink.click();
		gettitle(driver);
	}
	
	public void contact()
	{
		contactslink.click();
		gettitle(driver);
	}
	
	public void potential()
	{
		potentialslink.click();
		gettitle(driver);
	}
	
	public void campaign()
	{
		campaignslink.click();
		gettitle(driver);
	}
	
	public void product()
	{
		productslink.click();
		gettitle(driver);
	}
	
	public void pricebook()
	{
		pricebookslink.click();
		gettitle(driver);
	}
	
	public void quotes()
	{
		quoteslink.click();
		gettitle(driver);
	}
	
	public void salesorder()
	{
		salesorderlink.click();
		gettitle(driver);
	}
	
	public void purchaseorder()
	{
		purchaseorderlink.click();
		gettitle(driver);
	}
	
	public void invoice()
	{
		invoicelink.click();
		gettitle(driver);
	}
	
	
	public void logout()
	{
		javascriptexecuterclick(logoutlink, driver);
	}
}
