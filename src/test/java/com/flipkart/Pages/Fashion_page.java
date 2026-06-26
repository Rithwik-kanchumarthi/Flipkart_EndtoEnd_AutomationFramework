package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.Baseclass.Library;
import com.flipkart.ReusableFunctions.SeleniumReusable;

public class Fashion_page extends Library
{
	SeleniumReusable se;
	public Fashion_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Login']")
	WebElement loginLink;
	
	@FindBy(xpath="//span[text()='Baby & Kids']")
	WebElement babyKidsLink;
	
	@FindBy(xpath="//a[text()='Dresses & Skirts']")
	WebElement dressesSkirts;
	
	@FindBy(xpath="//div[text()='Price -- High to Low']")
	WebElement highLow;
	
	public void moveLoginlink()
	{
		se = new SeleniumReusable(driver);
		se.mouseHover(loginLink);
		se.click(loginLink);
	}
	
	public void moveBabyKids()
	{
		se.mouseHover(babyKidsLink);
		se.click(babyKidsLink);
	}
	
	public void moveDressesSkirts()
	{
		se.mouseHover(dressesSkirts);
		se.click(dressesSkirts);
	}
	
	public void highToLow()
	{
		se.mouseHover(highLow);
		se.click(highLow);
	}
	
}
