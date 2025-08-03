package com.flipkart.Stepdefinitions;

import java.io.IOException;

import com.flipkart.Baseclass.Library;
import com.flipkart.Pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_Testcase extends Library
{
	SearchPage sp;
	@Given("Launch the Flipkart Application")
	public void launch_the_flipkart_application() throws IOException
	{
		launchapplication();
	}

	@When("Close the Popup")
	public void close_the_popup()
	{
		System.out.println(driver.getTitle());
	}

	@Then("User should navigate to the Home Page")
	public void user_should_navigate_to_the_home_page() 
	{
		sp=new SearchPage(driver);
		sp.HomeScreen();
	}

	@Given("User enter the Text in the Search field")
	public void user_enter_the_text_in_the_search_field() 
	{
	    sp.Search("Mobiles");
	}

	@When("User click the search button")
	public void user_click_the_search_button()
	{
	    sp.ClickSearch();
	}

	@Then("User should navigate to the search result page and display the relevant details")
	public void user_should_navigate_to_the_search_result_page_and_display_the_relevant_details()
	{
	    sp.Result();
	}

}
