/**
 * 
 */
package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import testDataTypes.Customer;
import cucumber.api.java.en.Then;
import SeleniumPages.ShopRegistrationPage;
import contextmanagers.TestContext;

import SeleniumPages.HomePage;
import SeleniumPages.MyAccountPage;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class stepDefs_ShopRegistration {
	HomePage homePage ;
	ShopRegistrationPage shopRegistrationPage ;
	MyAccountPage myAccountPage ;
	TestContext testContext;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	Customer customer ;
	
	public stepDefs_ShopRegistration(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		shopRegistrationPage = testContext.getPageObjectManager().getShopRegistrationPage();
		myAccountPage = testContext.getPageObjectManager().getMyAccountPage();
		//to be commented below
//		pageObjectManager = new PageObjectManager(stepDefs_Homepage.driverObj);
//		homePage = pageObjectManager.getHomePage();
//		shopRegistrationPage = pageObjectManager.getShopRegistrationPage();
	}

	@When("^I enter \\\"(.*)\\\" information$")
	public void i_enter_information(String customerName) throws Throwable {
		customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
		shopRegistrationPage.enterEmailIdForCreation(customer);
		shopRegistrationPage.clickCreateAccount();
		shopRegistrationPage.fill_PersonalDetails(customer);	
	}
	
	@When("^Click on Create Account button$")
	public void click_on_Create_Account_button() throws Throwable {
		shopRegistrationPage.clickRegisterButton();
	}

	@Then("^I verify that Landing page is displayed$")
	public void i_verify_that_Landing_page_is_displayed() throws Throwable {
		myAccountPage.verifyMyAccountPageDisplayed();
	}

	@Then("^I verify that correct name and surname are displayed$")
	public void i_verify_that_correct_name_and_surname_are_displayed() throws Throwable {
		myAccountPage.verifyNameDisplayed(customer);
	}

	@Given("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		myAccountPage.verifyNameDisplayed(customer);
	}

	@When("^I click on Logout button$")
	public void i_click_on_Logout_button() throws Throwable {
		myAccountPage.clickLogout();
	}

	@Then("^I verify that I am in Homepage successfully$")
	public void i_verify_that_I_am_in_Homepage_successfully() throws Throwable {
		
	}

	@When("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
		homePage.clickSignInButton();
	}

}
