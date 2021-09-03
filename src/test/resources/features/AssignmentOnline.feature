
Feature: Assignment Shop
  This feature verifies Registration and Login functionalities

  @smoke
 Scenario Outline: Verify if registration is successful for new user
    Given I launch Chrome browser and land in Sign-in page
    When I enter "<customer>" information
    And Click on Create Account button
    Then I verify that Landing page is displayed
    And I verify that correct name and surname are displayed

    Examples: 
      | customer           |
      | TestAutomation1234 |

  Scenario: Verify if logout is successful for logged in user
    Given I am logged in
    When I click on Logout button
    Then I verify that I am in Homepage successfully

  Scenario: Verify if login is successful for existing user
    Given I launch Chrome browser and land in Sign-in page
    And Click on Login button
    Then I verify that Landing page is displayed
    And I verify that correct name and surname are displayed

  Scenario: Verify if user is able to search and product to checkout
    Given I launch Chrome browser and land in Sign-in page
    And I search for product "printed dress"
    Then I verify that valid products are displayed
    And I add any item to cart
    And I click Proceed to Checkout in Quick view and Cart Summary
    And I Agree to Terms and Conditions in Shipping
    And verify valid product and item price is displayed in Payment page
    