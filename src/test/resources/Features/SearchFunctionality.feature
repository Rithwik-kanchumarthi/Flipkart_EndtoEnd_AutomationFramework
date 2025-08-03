Feature: To validate the Flipkart Appliation

Background: 

Given Launch the Flipkart Application
When Close the Popup
Then User should navigate to the Home Page

@Test
Scenario: To validate the search functionality
Given User enter the Text in the Search field
When User click the search button
Then User should navigate to the search result page and display the relevant details