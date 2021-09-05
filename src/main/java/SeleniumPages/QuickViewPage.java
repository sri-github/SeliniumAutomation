package SeleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class QuickViewPage extends BasePage{
	
	public QuickViewPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	private String string_iFrameQuickview= "iframe[id*='fancybox-frame']";
	private By byIframeQuickView = By.cssSelector(string_iFrameQuickview);
	
	WebDriver driverExisting;

	@FindBy(how = How.CSS, using = "#product") 
	private WebElement group_Product;
	
	@FindBy(how = How.CSS, using = "h1[itemprop='name']") 
	private WebElement lbl_ProductName;

	@FindBy(how = How.CSS, using = "input#quantity_wanted") 
	private WebElement txtbx_Quantity;
	
	@FindBy(how = How.CSS, using = "#our_price_display") 
	private WebElement lbl_ProductPrice;

	
	@FindBy(how = How.CSS, using = "#add_to_cart button") 
	private WebElement btn_AddToCart;

	@FindBy(how = How.CSS, using = "div#layer_cart a") 
	private WebElement btn_ProceedCheckout;
	
	public void switchToQuickViewFrame() {
		waitForPageLoad();
		driverExisting = driver;
		driver = frameToBeAvailableAndSwitchToIt(byIframeQuickView);
	}

	public String getProductNameFromQuickView() {
		switchToQuickViewFrame();
		String strPrice= lbl_ProductName.getText();
		driver.switchTo().defaultContent();
		return strPrice;
	}

	public String getItemPriceFromQuickView() {
		switchToQuickViewFrame();
		String strPrice= lbl_ProductPrice.getText();
		driver.switchTo().defaultContent();
		return strPrice;
	}
	
	public void addItemToCart() {
		switchToQuickViewFrame();
		btn_AddToCart.click();
		waitForPageLoad();
		driver.switchTo().defaultContent();
	}
	
	public void clickGotoCheckout() {
//		switchToQuickViewFrame();
		btn_ProceedCheckout.click();
		waitForPageLoad();
	}
	
}
