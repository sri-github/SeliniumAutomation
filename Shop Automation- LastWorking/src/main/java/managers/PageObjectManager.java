package managers;

import org.openqa.selenium.WebDriver;

import SeleniumPages.*;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage homePage;

	private MyAccountPage myAccountPage;

	private ShopRegistrationPage shopRegistrationPage;

	

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	

	public HomePage getHomePage(){
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	

	public MyAccountPage getMyAccountPage() {
		return (myAccountPage == null) ? myAccountPage = new MyAccountPage(driver) : myAccountPage;
	}

	

	public ShopRegistrationPage getShopRegistrationPage() {
		return (shopRegistrationPage == null) ? shopRegistrationPage = new ShopRegistrationPage(driver) : shopRegistrationPage;
	}

}