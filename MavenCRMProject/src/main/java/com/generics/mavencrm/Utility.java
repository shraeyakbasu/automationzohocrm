package com.generics.mavencrm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Utility implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("*****IN On Test FAILURE*******");
		// TODO Auto-generated method stub
		TakesScreenshot ts=(TakesScreenshot) Basetest.driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(srcfile, new File("./screenshot/"+result.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		
		TakesScreenshot ts=(TakesScreenshot) Basetest.driver;
		File srcfile1=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile1, new File("./skipscreenshot/"+result.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	}

