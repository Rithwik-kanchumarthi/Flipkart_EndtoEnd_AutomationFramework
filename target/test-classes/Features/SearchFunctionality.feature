#Author: rithwik.h@highradius.com
@RithwikTest
Feature: To validate the Flipkart Appliation

Background: 

Given Launch the Flipkart Application
When Close the Popup
Then User should navigate to the Home Page

@Test1
Scenario: To validate the search functionality
Given User enter the Text in the Search field
When User click the search button
Then User should navigate to the search result page and display the relevant details
Then Extract the result and print in console
Then Print the result and keep it in the console

@Test2
Scenario: To validate the search functionality
Given User enter the Text in the Search field
When User click the search button
Then User should navigate to the search result page and display the relevant details
And Select Minimum and Maximum amount
And Select the Brand
And Select the RAM
And Select the Battery capacity
Then It should display the Relevant result
