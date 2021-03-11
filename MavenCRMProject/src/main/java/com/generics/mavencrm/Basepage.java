package com.generics.mavencrm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	public String geturl(WebDriver driver)
	{
		return driver.getCurrentUrl();
	}
	
	public String gettitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	
	public void javascriptexecuterclick(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
	}
	
	public void openinnewtab(WebDriver driver,WebElement element) throws AWTException
	
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_ENTER);
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowhandles);
		driver.switchTo().window(al.get(0));
		
			
	}
	
	public void openinnewwindow(WebDriver driver,WebElement element) throws AWTException
	
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowhandles);
		driver.switchTo().window(al.get(0));
		
	}
	
	
	
	
	
	




}
