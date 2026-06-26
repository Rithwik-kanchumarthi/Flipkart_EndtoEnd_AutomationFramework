#Author: rithwik.h@highradius.com
@RithwikTest
Feature: To validate the Flipkart Appliation

Background: 

Given Launch the Flipkart Application
When Close the Popup
Then User should navigate to the Home Page

@Test1 @Regression
Scenario: To validate the search functionality
Given User enter the Text in the Search field
When User click the search button
Then User should navigate to the search result page and display the relevant details
Then Extract the result and print in console
Then Print the result and keep it in the console

@Test2 @Regression
Scenario: To validate the search functionality
Given User enter the Text in the Search field
When User click the search button
Then User should navigate to the search result page and display the relevant details
And Select Minimum and Maximum amount
And Select the Brand
And Select the RAM
And Select the Battery capacity
Then It should display the Relevant result

@Test3
Scenario: To validate the fashion functionality
Given User to press the login link
When Cursor to move to the Baby & Kids link
And Move to Dresses and Skirts link and click
And Click the price high to low link
Then It should display the relevant details and get the title
