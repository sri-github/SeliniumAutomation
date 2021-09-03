/**
 * 
 */
package StepDefinitions;

import testDataTypes.Customer;
import cucumber.api.java.en.Then;
import enums.Context;
import contextmanagers.TestContext;
import SeleniumPages.CartSummaryPage;
import SeleniumPages.CheckoutPage;
import SeleniumPages.HomePage;
import SeleniumPages.QuickViewPage;

public class stepDefs_Checkout {
	HomePage homePage ;
	TestContext testContext;
	QuickViewPage quickViewPage;
	CartSummaryPage cartSummaryPage;
	CheckoutPage checkoutPage;
	
	Customer customer ;
	
	public stepDefs_Checkout(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		quickViewPage = testContext.getPageObjectManager().getQuickViewPage();
		cartSummaryPage = testContext.getPageObjectManager().getCartSummaryPage();
		checkoutPage = testContext.getPageObjectManager().getCheckoutPage();

	}
	

	@Then("^I click Proceed to Checkout in Quick view and Cart Summary$")
	public void i_click_Proceed_to_Checkout_in_Quick_view_and_Cart_Summary() throws Throwable {
		quickViewPage.clickGotoCheckout();
		cartSummaryPage.verifyIfValidProductAddedToCart(testContext.getScenarioContext().getContext(Context.Product).toString(),
											testContext.getScenarioContext().getContext(Context.Product).toString(), 
											testContext.getScenarioContext().getContext(Context.Product).toString());
		cartSummaryPage.clickCheckoutInSummary();
		checkoutPage.clickCheckoutInShipping();
	}
	
	@Then("^I Agree to Terms and Conditions in Shipping$")
	public void i_Agree_to_Terms_and_Conditions_in_Shipping() throws Throwable {
		checkoutPage.clickCheckoutInCarrier();
	}
	
	@Then("^verify valid product and item price is displayed in Payment page$")
	public void verify_valid_product_and_item_price_is_displayed_in_Payment_page() throws Throwable {
		checkoutPage.verifyProductDetailsInCheckout();
	}

}
