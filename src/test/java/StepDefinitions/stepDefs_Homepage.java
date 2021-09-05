/**
 * 
 */
package StepDefinitions;

import cucumber.api.java.en.Given;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumPages.HomePage;
import SeleniumPages.ShopRegistrationPage;
import contextmanagers.TestContext;

public class stepDefs_Homepage {

	public static WebDriver driverObj;
	HomePage homePage ;
	TestContext testContext;
	ShopRegistrationPage shopRegistrationPage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	public stepDefs_Homepage(TestContext context) {

		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		shopRegistrationPage = testContext.getPageObjectManager().getShopRegistrationPage();
//to be commented below
//		pageObjectManager = new PageObjectManager(driverObj);
//		homePage = pageObjectManager.getHomePage();
//		shopRegistrationPage = pageObjectManager.getShopRegistrationPage();
	}
	
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath());
		driverObj = new ChromeDriver();
		driverObj.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		driverObj.manage().window().maximize();
		System.out.println("launched browser");
	}

	@Given("^I launch Chrome browser and land in Sign-in page$")
	public void i_launch_Chrome_browser_and_land_in_Sign_in_page() throws Throwable {

		homePage.openShopURL(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		homePage.clickSignInButton();
		Assert.assertEquals("Sign in page not displayed",true,shopRegistrationPage.verifyRegistrationPageDisplayed());
	}

	@Given("^I verify that Sign-in page is displayed$")
	public void i_verify_that_Sign_in_page_is_displayed() throws Throwable {
		Assert.assertEquals("Sign in page not displayed",true,shopRegistrationPage.verifyRegistrationPageDisplayed());
	}

}
