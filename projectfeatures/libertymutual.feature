Feature: The Login Page should allow someone to login
  As a returning customer
  I want to login to the application
  So that I can view my account balance

Scenario: The user should be able to login with valid credentials
  Given the user is on the Liberty Mutual home page
  When the user enters the Atlanta zipcode
  Then the user should see the city of Atlanta populated on the create quote screen