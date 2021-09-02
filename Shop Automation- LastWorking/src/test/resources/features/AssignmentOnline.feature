Feature: Assignment Shop
This feature verifies Registration and Login functionalities
@Manual
 
Scenario Outline: Verify if registration is successful for new user
Given I launch Chrome browser and land in Sign-in page
When I enter "<customer>" information
And Click on Create Account button
Then I verify that Landing page is displayed
And I verify that correct name and surname are displayed
Examples:
	|customer|
	|TestAutomation1234|