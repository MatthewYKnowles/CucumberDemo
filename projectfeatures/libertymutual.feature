Feature: The get a quote workflow should not require a user to enter their city
  As a potential customer
  I want to enter my zipcode and not my city or state
  So that I actually want to finish putting in my information

Scenario: The user should put in the zipcode for Atlanta and see the city automatically populated
  Given the user is on the Liberty Mutual home page
  When the user enters the Atlanta zipcode
  Then the user should see the city of Atlanta populated on the create quote screen

Scenario: The user should put in the zipcode for Seattle and see the city automatically populated
  Given the user is on the Liberty Mutual home page
  When the user enters the Seattle zipcode
  Then the user should see the city of Seattle populated on the create quote screen