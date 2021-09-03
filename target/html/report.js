$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AssignmentOnline.feature");
formatter.feature({
  "line": 1,
  "name": "Assignment Shop",
  "description": "This feature verifies Registration and Login functionalities",
  "id": "assignment-shop",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10820116100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify if user is able to search and product to checkout",
  "description": "",
  "id": "assignment-shop;verify-if-user-is-able-to-search-and-product-to-checkout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Manual"
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
  "name": "I search for product \"printed dress\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify that valid products are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I add any item to cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click Proceed to Checkout in Quick view and Cart Summary",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Agree to Terms and Conditions in Shipping",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify valid product and item price is displayed in Payment page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs_Homepage.i_launch_Chrome_browser_and_land_in_Sign_in_page()"
});
formatter.result({
  "duration": 19683083900,
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
  "duration": 1915054500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_SearchAndValidate.i_verify_that_valid_products_are_displayed()"
});
formatter.result({
  "duration": 59450300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_AddItemsToCart.i_add_any_item_to_cart()"
});
formatter.result({
  "duration": 4189424200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs_Checkout.i_click_Proceed_to_Checkout_in_Quick_view_and_Cart_Summary()"
});
formatter.result({
  "duration": 1405755700,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window\n  (Session info: chrome\u003d93.0.4577.63)\n  (Driver info: chromedriver\u003d93.0.4577.15 (660fc11082ba57405eca2e8c49c3e1af756fbfae-refs/branch-heads/4577@{#203}),platform\u003dWindows NT 10.0.19041 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.28 seconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027DESKTOP-PI4CKF3\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:64349}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d93.0.4577.15 (660fc11082ba57405eca2e8c49c3e1af756fbfae-refs/branch-heads/4577@{#203}), userDataDir\u003dC:\\Users\\trint\\AppData\\Local\\Temp\\scoped_dir13464_849321371}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d93.0.4577.63, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 177aba475d2e1632d200939e24c0d44d\n*** Element info: {Using\u003dcss selector, value\u003ddiv#layer_cart a}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:492)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat SeleniumPages.QuickViewPage.clickGotoCheckout(QuickViewPage.java:71)\r\n\tat StepDefinitions.stepDefs_Checkout.i_click_Proceed_to_Checkout_in_Quick_view_and_Cart_Summary(stepDefs_Checkout.java:36)\r\n\tat ✽.And I click Proceed to Checkout in Quick view and Cart Summary(AssignmentOnline.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefs_Checkout.i_Agree_to_Terms_and_Conditions_in_Shipping()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefs_Checkout.verify_valid_product_and_item_price_is_displayed_in_Payment_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 466391400,
  "status": "passed"
});
formatter.after({
  "duration": 2665874100,
  "status": "passed"
});
});