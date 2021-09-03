/**
 * 
 */
package StepDefinitions;

import cucumber.api.java.en.Then;
import enums.Context;
import SeleniumPages.HomePage;
import SeleniumPages.QuickViewPage;
import SeleniumPages.SearchResultsPage;
import contextmanagers.TestContext;

public class stepDefs_AddItemsToCart {

	HomePage homePage ;
	TestContext testContext;
	SearchResultsPage searchResultsPage;
	QuickViewPage quickViewPage;
	
	public stepDefs_AddItemsToCart(TestContext context) {

		testContext = context;
		searchResultsPage = testContext.getPageObjectManager().getSearchResultsPage();
		quickViewPage = testContext.getPageObjectManager().getQuickViewPage();
	}
	

	@Then("^I add any item to cart$")
	public void i_add_any_item_to_cart() throws Throwable {
		searchResultsPage.openQuickViewOfAnyProductFromSearch();
		testContext.scenarioContext.setContext(Context.Product, quickViewPage.getProductNameFromQuickView());
		testContext.scenarioContext.setContext(Context.ItemPrice1, quickViewPage.getItemPriceFromQuickView());
		testContext.scenarioContext.setContext(Context.Quantity1, "1");
		quickViewPage.addItemToCart();
	}
	

}
