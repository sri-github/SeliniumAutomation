package SeleniumPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartSummaryPage extends BasePage{
	
	public CartSummaryPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "#cart_summary .product-name a") 
	private WebElement lbl_ProductName;

	@FindBy(how = How.CSS, using = "input[name*='quantity'][type=text]") 
	private WebElement txtbx_Quantity;

	@FindBy(how = How.CSS, using = "[id*='product_price'] span") 
	private WebElement lbl_ProductSalePrice;

	@FindBy(how = How.CSS, using = "[id*='total_product_price']") 
	private WebElement lbl_FinalProductPrice;

	@FindBy(how = How.CSS, using = "#cart_summary  #total_product") 
	private WebElement lbl_TotalCartPrice;
	
	@FindBy(how = How.CSS, using = "a[class*='checkout']") 
	private WebElement btn_CheckoutInSummary;
	
	private int iQuantity;

	@SuppressWarnings("unused")
	private String strProduct;
	@SuppressWarnings("unused")
	private String strPrice;
	
	public void verifyIfValidProductAddedToCart(String strProduct, String strQuantity,String strPrice) {
		verifyQuantityValue(strQuantity);
		verifyProductName(strProduct);
		verifyProductSalePrice(strPrice);
	}

	private void verifyQuantityValue(String strQuantity) {
		this.iQuantity=Integer.parseInt(strQuantity);
		Assert.assertEquals(iQuantity, Integer.parseInt(txtbx_Quantity.getAttribute("value")));
	}

	private void verifyProductSalePrice(String strPrice) {
		this.strPrice=strPrice;
		Assert.assertEquals(strPrice, lbl_ProductSalePrice.getText());
	}
	
	private void verifyProductName(String strProduct) {
		Assert.assertEquals(lbl_ProductName.getText(), strProduct);
		this.strProduct=strProduct;
	}
	
	public void clickCheckoutInSummary() {
		btn_CheckoutInSummary.click();
	}
}
