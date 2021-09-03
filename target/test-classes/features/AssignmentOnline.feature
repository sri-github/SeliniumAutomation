Feature: Assignment Shop
  This feature verifies Registration and Login functionalities

  @smoke
  
  Scenario: Verify if user is able to search and product to checkout
    Given I launch Chrome browser and land in Sign-in page
    And I search for product "printed dress"
    Then I verify that valid products are displayed
    And I add any item to cart
    And I click Proceed to Checkout in Quick view and Cart Summary
    And I Agree to Terms and Conditions in Shipping
    And verify valid product and item price is displayed in Payment page
    