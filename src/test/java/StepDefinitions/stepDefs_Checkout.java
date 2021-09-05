/**
 * 
 */
package StepDefinitions;

import testDataTypes.Customer;
import cucumber.api.java.en.Then;
import enums.Context;
import managers.FileReaderManager;
import contextmanagers.TestContext;
import SeleniumPages.CartSummaryPage;
import SeleniumPages.CheckoutPage;
import SeleniumPages.HomePage;
import SeleniumPages.QuickViewPage;
import SeleniumPages.ShopRegistrationPage;

public class stepDefs_Checkout {
	ShopRegistrationPage shopRegistrationPage;
	TestContext testContext;
	QuickViewPage quickViewPage;
	CartSummaryPage cartSummaryPage;
	CheckoutPage checkoutPage;
	
	Customer customer ;
	
	public stepDefs_Checkout(TestContext context) {
		testContext = context;
		shopRegistrationPage = testContext.getPageObjectManager().getShopRegistrationPage();
		quickViewPage = testContext.getPageObjectManager().getQuickViewPage();
		cartSummaryPage = testContext.getPageObjectManager().getCartSummaryPage();
		checkoutPage = testContext.getPageObjectManager().getCheckoutPage();

	}
	

	@Then("^I click Proceed to Checkout in Quick view and Cart Summary$")
	public void i_click_Proceed_to_Checkout_in_Quick_view_and_Cart_Summary() throws Throwable {
		quickViewPage.clickGotoCheckout();
		cartSummaryPage.verifyIfValidProductAddedToCart(testContext.getScenarioContext().getContext(Context.Product).toString(),
											testContext.getScenarioContext().getContext(Context.Quantity1).toString(), 
											testContext.getScenarioContext().getContext(Context.ItemPrice1).toString());
		cartSummaryPage.clickCheckoutInSummary();
	}
	
	@Then("^I Checkout and Agree to Terms and Conditions in Shipping$")
	public void i_Checkout_and_Agree_to_Terms_and_Conditions_in_Shipping() throws Throwable {
		checkoutPage.clickCheckoutInShipping();
		checkoutPage.clickCheckoutInCarrier();
	}
	
	@Then("^verify valid product and item price is displayed in Payment page$")
	public void verify_valid_product_and_item_price_is_displayed_in_Payment_page() throws Throwable {
		checkoutPage.verifyProductDetailsInCheckout();
	}

}
