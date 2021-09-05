$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AssignmentOnline.feature");
formatter.feature({
  "line": 2,
  "name": "Assignment Shop",
  "description": "This feature verifies Registration and Login functionalities",
  "id": "assignment-shop",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Verify if registration is successful for new user",
  "description": "",
  "id": "assignment-shop;verify-if-registration-is-successful-for-new-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I launch Chrome browser and land in Sign-in page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"\u003ccustomer\u003e\" information",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Create Account button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify that Landing page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I verify that correct name and surname are displayed",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "assignment-shop;verify-if-registration-is-successful-for-new-user;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 14,
      "id": "assignment-shop;verify-if-registration-is-successful-for-new-user;;1"
    },
    {
      "cells": [
        "TestAutomation123456@gmail.com"
      ],
      "line": 15,
      "id": "assignment-shop;verify-if-registration-is-successful-for-new-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2781276300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify if registration is successful for new user",
  "description": "",
  "id": "assignment-shop;verify-if-registration-is-successful-for-new-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I launch Chrome browser and land in Sign-in page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"TestAutomation123456@gmail.com\" information",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Create Account button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify that Landing page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I verify that correct name and surname are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs_Homepage.i_launch_Chrome_browser_and_land_in_Sign_in_page()"
});
formatter.result({
  "duration": 11133470800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestAutomation123456@gmail.com",
      "offset": 9
    }
  ],
  "location": "stepDefs_ShopRegistration.i_enter_information(String)"
});
formatter.result({
  "duration": 3966585100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_ShopRegistration.click_on_Create_Account_button()"
});
formatter.result({
  "duration": 1898542300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_ShopRegistration.i_verify_that_Landing_page_is_displayed()"
});
formatter.result({
  "duration": 80014400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_ShopRegistration.i_verify_that_correct_name_and_surname_are_displayed()"
});
formatter.result({
  "duration": 1913925300,
  "status": "passed"
});
formatter.after({
  "duration": 78400,
  "status": "passed"
});
formatter.after({
  "duration": 1071076400,
  "status": "passed"
});
formatter.before({
  "duration": 1796755900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify if logout is successful for logged in user",
  "description": "",
  "id": "assignment-shop;verify-if-logout-is-successful-for-logged-in-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I launch Chrome browser and land in Sign-in page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I login as existing customer \"TestAutomation123456@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Logout button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I verify that Sign-in page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs_Homepage.i_launch_Chrome_browser_and_land_in_Sign_in_page()"
});
formatter.result({
  "duration": 10466488300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestAutomation123456@gmail.com",
      "offset": 30
    }
  ],
  "location": "stepDefs_ShopRegistration.i_login_as_existing_customer(String)"
});
formatter.result({
  "duration": 2803986900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_ShopRegistration.i_click_on_Logout_button()"
});
formatter.result({
  "duration": 2444609800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_Homepage.i_verify_that_Sign_in_page_is_displayed()"
});
formatter.result({
  "duration": 29088800,
  "status": "passed"
});
formatter.after({
  "duration": 50000,
  "status": "passed"
});
formatter.after({
  "duration": 921893800,
  "status": "passed"
});
formatter.before({
  "duration": 1563967800,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify if login is successful for existing user",
  "description": "",
  "id": "assignment-shop;verify-if-login-is-successful-for-existing-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I launch Chrome browser and land in Sign-in page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify that Landing page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I login as existing customer \"TestAutomation123456@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I verify that correct name and surname are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs_Homepage.i_launch_Chrome_browser_and_land_in_Sign_in_page()"
});
formatter.result({
  "duration": 10126593000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_ShopRegistration.click_on_Login_button()"
});
formatter.result({
  "duration": 1809417700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_ShopRegistration.i_verify_that_Landing_page_is_displayed()"
});
formatter.result({
  "duration": 43165700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestAutomation123456@gmail.com",
      "offset": 30
    }
  ],
  "location": "stepDefs_ShopRegistration.i_login_as_existing_customer(String)"
});
formatter.result({
  "duration": 2218903200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_ShopRegistration.i_verify_that_correct_name_and_surname_are_displayed()"
});
formatter.result({
  "duration": 1955548600,
  "status": "passed"
});
formatter.after({
  "duration": 57100,
  "status": "passed"
});
formatter.after({
  "duration": 972128600,
  "status": "passed"
});
formatter.before({
  "duration": 1542013200,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Verify if user is able to search and product to checkout",
  "description": "",
  "id": "assignment-shop;verify-if-user-is-able-to-search-and-product-to-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I launch Chrome browser and land in Sign-in page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I search for product \"printed dress\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I verify that valid products are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I add any item to cart",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click Proceed to Checkout in Quick view and Cart Summary",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I login as existing customer \"TestAutomation123456@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I Checkout and Agree to Terms and Conditions in Shipping",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "verify valid product and item price is displayed in Payment page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs_Homepage.i_launch_Chrome_browser_and_land_in_Sign_in_page()"
});
formatter.result({
  "duration": 11640112600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "printed dress",
      "offset": 22
    }
  ],
  "location": "stepDefs_SearchAndValidate.i_search_for_product(String)"
});
formatter.result({
  "duration": 2083890400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_SearchAndValidate.i_verify_that_valid_products_are_displayed()"
});
formatter.result({
  "duration": 63737600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_AddItemsToCart.i_add_any_item_to_cart()"
});
formatter.result({
  "duration": 3330950400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_Checkout.i_click_Proceed_to_Checkout_in_Quick_view_and_Cart_Summary()"
});
formatter.result({
  "duration": 5692889800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestAutomation123456@gmail.com",
      "offset": 30
    }
  ],
  "location": "stepDefs_ShopRegistration.i_login_as_existing_customer(String)"
});
formatter.result({
  "duration": 2261182100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_Checkout.i_Checkout_and_Agree_to_Terms_and_Conditions_in_Shipping()"
});
formatter.result({
  "duration": 85000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_Checkout.verify_valid_product_and_item_price_is_displayed_in_Payment_page()"
});
formatter.result({
  "duration": 91000,
  "status": "passed"
});
formatter.after({
  "duration": 54300,
  "status": "passed"
});
formatter.after({
  "duration": 922374400,
  "status": "passed"
});
});