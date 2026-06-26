package com.flipkart.ReusableFunctions;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.flipkart.Baseclass.Library;

public class SeleniumReusable extends Library 
{
	Actions act;
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
	public void getTitle()
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
	
	public void multipleGetText(List<WebElement> element)
	{
		List<WebElement> texts = element;
		System.out.println(texts.size());
		
		for(WebElement text : texts)
		{
			String totalList = text.getText();
			System.out.println("************************************");
			System.out.println(totalList);
		}
		
	}
	
	public void GetValue(WebElement element)
	{
		String text = element.getText();
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(text);
	}
	
	public void dropDown(WebElement element, String text)
	{
		Select drp = new Select(element);
		drp.selectByValue(text);
	}
	
	public void scrollDown(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void waits() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	public void mouseHover(WebElement element)
	{
		act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	public void moveElement(WebElement element)
	{
		act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}
}
