package com.flipkart.ReusableFunctions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flipkart.Baseclass.Library;

public class SeleniumReusable extends Library 
{
	public SeleniumReusable(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Enter the text of an element
	public void EnterValue(WebElement element, String text)
	{
		try
		{
			element.sendKeys(text);
		}
		
		catch(Exception e)
		{
			System.out.println("NoSuchElementException");
		}
	}
	
	//click the element
	public void click(WebElement element)
	{
		try
		{
			element.click();
		}
		
		catch(Exception e)
		{
			System.out.println("NoSuchElementException");
		}
	}
	
	//Get the title of the page
	public void getTitle(WebElement element)
	{
		try
		{
			System.out.println(driver.getTitle());;
		}
		
		catch(Exception e)
		{
			System.out.println("Couldnot get the title of the page");
		}
	}
	
	//Takes the screenshot of the test case
	public void screenshot(String path)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(src, new File(path));
		}
		catch(Exception e)
		{
			System.out.println("Screenshot not found");
		}
	}	
}
