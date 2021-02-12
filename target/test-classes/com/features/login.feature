
  
Feature: Login page feature



Scenario: Login with correct credentials
Given user is on login page
When user enters email "kalturisusmitha943@gmail.com"
And user enters password "Sush@123"
And user clicks Login button
Then Page title should be "User Account - IKEA"


