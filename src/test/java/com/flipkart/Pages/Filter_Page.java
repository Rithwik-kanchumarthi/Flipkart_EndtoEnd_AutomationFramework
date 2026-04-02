package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.Baseclass.Library;
import com.flipkart.ReusableFunctions.SeleniumReusable;

public class Filter_Page extends Library
{
	SeleniumReusable se;
	public Filter_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='FrhiFV']//select[@class='hbnjE2']")
	WebElement minAmount;
	
	@FindBy(xpath="//div[@class='WoGl7t']//select[@class='hbnjE2']")
	WebElement maxAmount;

	@FindBy(xpath="//div[text()='Samsung']//preceding-sibling::div[@class='ybaCDx']")
	WebElement brand;
	
	@FindBy(xpath="//div[text()='3 GB']//preceding-sibling::div[@class='ybaCDx']")
	WebElement ram;
	
	@FindBy(xpath="//div[text()='Battery Capacity']/..")
	WebElement batteryArrow;
	
	@FindBy(xpath="//div[@title='4000 - 4999 mAh']//div[@class='ybaCDx']")
	WebElement batteryCapacity;
	
	public void min()
	{
		se =new SeleniumReusable(driver);
		se.dropDown(minAmount, "10000");
	}
	
	public void max()
	{
		se.dropDown(maxAmount, "20000");
	}
	
	public void brand()
	{
		se.click(brand);
	}
	
	public void ram()
	{
		se.scrollDown(ram);
		se.click(ram);
	}
	
	public void clickBattery()
	{
		se.scrollDown(batteryArrow);
		se.click(batteryArrow);
		se.click(batteryCapacity);
	}
	
	
}
