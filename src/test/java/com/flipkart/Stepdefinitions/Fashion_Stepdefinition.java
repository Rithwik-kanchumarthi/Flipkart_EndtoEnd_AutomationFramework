package com.flipkart.Stepdefinitions;

import com.flipkart.Baseclass.Library;
import com.flipkart.Pages.Fashion_page;
import com.flipkart.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fashion_Stepdefinition extends Library{
	Fashion_page fp;
	SeleniumReusable se;
	
	@Given("User to press the login link")
	public void user_to_press_the_login_link() {
	  fp = new Fashion_page(driver);
	  System.out.println("Before Clicking Login Link");
	  se = new SeleniumReusable(driver);
	  se.getTitle();
	  fp.moveLoginlink();
	}

	@When("Cursor to move to the Baby & Kids link")
	public void cursor_to_move_to_the_baby_kids_link() {
		fp.moveBabyKids();
	}

	@When("Move to Dresses and Skirts link and click")
	public void move_to_dresses_and_skirts_link_and_click() {
		fp.moveDressesSkirts();
	}

	@When("Click the price high to low link")
	public void click_the_price_high_to_low_link() {
		fp.highToLow();
	}

	@Then("It should display the relevant details and get the title")
	public void it_should_display_the_relevant_details_and_get_the_title() {
		System.out.println("After Clicking:");
		se.getTitle();
	}

}
