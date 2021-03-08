package com.generics.mavencrm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Basepage 
{
	
	public void selectbyvalue(WebElement element,String value)
	{
		Select sc = new Select(element);
		sc.selectByValue(value);
	}
	
	public void selectbyindex(WebElement element,int index)
	{
		Select sc = new Select(element);
		sc.selectByIndex(index);
	}
	
	public void selectbytext(WebElement element,String text)
	{
		Select sc = new Select(element);
		sc.selectByVisibleText(text);
	}
	
	public void alertaccept(WebDriver driver)
	{
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}
	
	public void alertdismiss(WebDriver driver)
	{
		
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	
	public void geturl(WebDriver driver)
	{
		driver.getCurrentUrl();
	}
	
	public void gettitle(WebDriver driver)
	{
		driver.getTitle();
	}
	
	public void javascriptexecuterclick(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
	}
	
	
	
	
	
	




}
