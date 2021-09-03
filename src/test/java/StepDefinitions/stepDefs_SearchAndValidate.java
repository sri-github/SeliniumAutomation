/**
 * 
 */
package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import enums.Context;
import SeleniumPages.HomePage;
import SeleniumPages.SearchResultsPage;
import contextmanagers.TestContext;

public class stepDefs_SearchAndValidate {
	TestContext testContext;
	String strProductName;
	
	HomePage homePage ;
	SearchResultsPage searchResultsPage;
	
	public stepDefs_SearchAndValidate(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		searchResultsPage = testContext.getPageObjectManager().getSearchResultsPage();
	}
	
	@Given("^I search for product \"([^\"]*)\"$")
	public void i_search_for_product(String strProductName) throws Throwable {
		this.strProductName = strProductName;
		testContext.scenarioContext.setContext(Context.Product, strProductName);
		testContext.scenarioContext.setContext(Context.SearchTerm, strProductName);
		homePage.searchForProduct(strProductName);
	}
	
	@Then("^I verify that valid products are displayed$")
	public void i_verify_that_valid_products_are_displayed() throws Throwable {
		searchResultsPage.validateSearchResultsDisplayedByName(strProductName);
	}
	

}
