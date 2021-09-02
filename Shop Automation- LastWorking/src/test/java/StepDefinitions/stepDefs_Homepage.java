/**
 * 
 */
package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumPages.HomePage;
import SeleniumPages.ShopRegistrationPage;

public class stepDefs_Homepage {

	public static WebDriver driverObj;
	HomePage homePage ;
	ShopRegistrationPage shopRegistrationPage;

	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:/Eclipse Photon Workspace/chromedriver_win32/chromedriver.exe");
		driverObj = new ChromeDriver();
		driverObj.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driverObj.manage().window().maximize();
		System.out.println("launched browser");
	}

	@Given("^I launch Chrome browser and land in Sign-in page$")
	public void i_launch_Chrome_browser_and_land_in_Sign_in_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","E:/Eclipse Photon Workspace/chromedriver_win32/chromedriver.exe");
		driverObj = new ChromeDriver();
		driverObj.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driverObj.manage().window().maximize();
		System.out.println("launched browser");
		homePage = new HomePage(driverObj);
		shopRegistrationPage = new ShopRegistrationPage(driverObj);
		homePage.openShopURL();
		homePage.clickSignInButton();
		Assert.assertEquals("Sign in page not displayed",true,shopRegistrationPage.verifyRegistrationPageDisplayed());
	}

	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage() throws Throwable {
		homePage.openGoogleURL();
	}

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Throwable {
	    System.out.println("Verify search text box");
	    homePage.checkSearchBoxIsDisplayed();
	}

	@Then("^the page displays Google Search button$")
	public void the_page_displays_Google_Search_button() throws Throwable {
	    System.out.println("Verify Google Search button");
	    homePage.checkGoogleSearchButtonIsDisplayed();
	}

	@Then("^the page displays Im Feeling Lucky button$")
	public void the_page_displays_Im_Feeling_Lucky_button() throws Throwable {
		System.out.println("Verify Feeling lucky button displayed");
		homePage.checkImFeelingLuckyButtonIsDisplayed();
	}

	@Then("^I search for \"([^\"]*)\" on Google$")
	public void i_search_for_on_Google(String arg1) throws Throwable {
		System.out.println("Search Google");
		homePage.searchGoogle();
	}

	@Then("^I quit Chrome browser$")
	public void i_quit_Chrome_browser() throws Throwable {
		System.out.println("Quit Chrome Browser");
		homePage.quitChromeBrowser();
	}

}
