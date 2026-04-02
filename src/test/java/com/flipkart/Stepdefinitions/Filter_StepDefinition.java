package com.flipkart.Stepdefinitions;

import org.openqa.selenium.By;

import com.flipkart.Baseclass.Library;
import com.flipkart.Pages.Filter_Page;
import com.flipkart.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;

public class Filter_StepDefinition extends Library
{
	Filter_Page fp;
	SeleniumReusable se;
	
	@Then("Select Minimum and Maximum amount")
	public void select_minimum_and_maximum_amount() throws InterruptedException {
		fp = new Filter_Page(driver);
		String beforeFilter = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();		
		System.out.println("Before Filter: "+beforeFilter);
		
		fp.min();
		se=new SeleniumReusable(driver);
		se.waits();
		fp.max();
		se.waits();
		
	}

	@Then("Select the Brand")
	public void select_the_brand() throws InterruptedException {
	    fp.brand();
	    se.waits();
	}

	@Then("Select the RAM")
	public void select_the_ram() throws InterruptedException {
	    fp.ram();
	    se.waits();
	}

	@Then("Select the Battery capacity")
	public void select_the_battery_capacity() throws InterruptedException {
	    fp.clickBattery();
	    se.waits();
	}

	@Then("It should display the Relevant result")
	public void it_should_display_the_relevant_result() {
		System.out.println("*************************");
		String afterFilter = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();		
		System.out.println("After Filter: "+afterFilter);
	}


}
