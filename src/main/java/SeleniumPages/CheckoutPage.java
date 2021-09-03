package SeleniumPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class CheckoutPage extends BasePage{
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	//button[name*='processAddress']
	//button[name*='processCarrier']
	//input[type='checkbox']
	//#total_product
	//[id*='product'] .product-name a
	//.cart_avail span ==> should be as : 'In stock'
	public void clickCheckoutInShipping() {
		
	}
	
	public void clickCheckoutInCarrier() {
		
	}
	
	public void verifyProductDetailsInCheckout() {
		
	}
}
