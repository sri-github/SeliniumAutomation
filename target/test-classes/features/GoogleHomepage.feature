Feature: Google Homepage
This feature verifies the functionality on Google Homepage
@Manual
 
Scenario: Check that main elements on Google Homepage are displayed
Given I launch Chrome browser
When I open Google Homepage
Then I verify that the page displays search text box
And the page displays Google Search button
And the page displays Im Feeling Lucky button
And I search for "weather tomorrow" on Google
And I quit Chrome browser