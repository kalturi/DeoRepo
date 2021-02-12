
  
Feature: Home page feature



Scenario: HomePage TodaysDeal Check
Given user is on Home Page
When Todays Deal button clicked
Then Verify "Deal of the Day" is present
