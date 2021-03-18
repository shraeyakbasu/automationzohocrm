package com.pages.mavencrm;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.generics.mavencrm.Autoconstant;
import com.generics.mavencrm.Basepage;

public class zohocrmprintpreviewpage extends Basepage implements Autoconstant
{

	WebDriver driver;
	
	
	
	public zohocrmprintpreviewpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchelement()
	{
		
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowhandles);
		driver.switchTo().window(al.get(1));
		String actualtitle=gettitle(driver);
		Reporter.log(actualtitle,true);
		WebElement companyname=driver.findElement(By.xpath("//td[contains(text(),'abc')]"));
		WebElement designationname=driver.findElement(By.xpath("//td[contains(text(),'qa engineer')]"));
		String compname=companyname.getText();
		String designame=designationname.getText();
		if(compname.equalsIgnoreCase("abc") && designame.contains("qa engineer"))
		{
			Reporter.log("found",true);
		}
		driver.switchTo().window(al.get(0));
		
	}
}
