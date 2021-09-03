package managers;

import org.openqa.selenium.WebDriver;

import SeleniumPages.*;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private ShopRegistrationPage shopRegistrationPage;	
	private SearchResultsPage searchResultsPage;
	private QuickViewPage quickViewPage;
	private CartSummaryPage cartSummaryPage;
	private CheckoutPage checkoutPage;	

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

	public SearchResultsPage getSearchResultsPage() {
		return (searchResultsPage == null) ? searchResultsPage = new SearchResultsPage(driver) : searchResultsPage;
	}

	public QuickViewPage getQuickViewPage() {
		return (quickViewPage == null) ? quickViewPage = new QuickViewPage(driver) : quickViewPage;
	}
	
	public CartSummaryPage getCartSummaryPage() {
		return (cartSummaryPage == null) ? cartSummaryPage = new CartSummaryPage(driver) : cartSummaryPage;
	}
	
	public CheckoutPage getCheckoutPage() {
		return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
	}

}