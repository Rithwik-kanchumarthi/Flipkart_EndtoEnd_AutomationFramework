package com.flipkart.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.Baseclass.Library;
import com.flipkart.ReusableFunctions.SeleniumReusable;

public class SearchPage extends Library
{
	SeleniumReusable se;
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchText;
	
	@FindBy(xpath="//html[@lang='en-IN']")
	WebElement homepage;
	
	@FindBy(xpath="//html[@lang='en']")
	WebElement searchResult;
	
	
	public void Search(String Text)
	{
		se = new SeleniumReusable(driver);
		se.EnterValue(searchText, Text);
	}
	
	public void ClickSearch()
	{
		searchText.sendKeys(Keys.ENTER);
	}
	
	public void HomeScreen()
	{
		System.out.println(homepage.isDisplayed());
	}
	
	public void Result()
	{
		System.out.println(searchResult.isDisplayed());
		System.out.println(driver.getTitle());
	}

}
