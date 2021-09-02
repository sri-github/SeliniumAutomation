/**
 * 
 */
package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import testDataTypes.Customer;
import cucumber.api.java.en.Then;
import SeleniumPages.ShopRegistrationPage;
import SeleniumPages.HomePage;

import managers.FileReaderManager;

public class stepDefs_ShopRegistration {
	HomePage homePage = new HomePage(stepDefs_Homepage.driverObj);
	ShopRegistrationPage shopRegistrationPage = new ShopRegistrationPage(stepDefs_Homepage.driverObj);


	@When("^I enter \\\"(.*)\\\" information$")
	public void i_enter_information(String customerName) throws Throwable {
		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
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
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I verify that correct name and surname are displayed$")
	public void i_verify_that_correct_name_and_surname_are_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^I click on Logout button$")
	public void i_click_on_Logout_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I verify that I am in Homepage successfully$")
	public void i_verify_that_I_am_in_Homepage_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}
