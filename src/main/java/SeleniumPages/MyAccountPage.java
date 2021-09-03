package SeleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import org.junit.Assert;
import testDataTypes.Customer;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "#center_column p") 
	private WebElement lbl_WelcomeNote;

	@FindBy(how = How.CSS, using = ".myaccount-link-list li a[title='Information']") 
	private WebElement lnk_PersonalDetailsSection;
	
	@FindBy(how = How.CSS, using = ".logout") 
	private WebElement btn_Logout;

	@FindBy(how = How.CSS, using = "#firstname") 
	private WebElement txtbx_FirstName;

	@FindBy(how = How.CSS, using = "#lastname") 
	private WebElement txtbx_LastName;
	
	@FindBy(how = How.CSS, using = "a.button[href$='account']") 
	private WebElement btn_GoBackToMyAccount;

	public void initiatePageElements() {
	    PageFactory.initElements(driver, this);
	}
	
	public boolean verifyMyAccountPageDisplayed() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
         WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#center_column p")));
         return element.getText().startsWith("Welcome");
	}
	
	public void clickPersonalDetailsSection() {
		lnk_PersonalDetailsSection.click();
	}
	
	public void clickLogout() {
		btn_Logout.click();
	}
	
	public void verifyNameDisplayed(Customer customer) {
		Assert.assertEquals("Expected customer name not displayed",customer.firstName , txtbx_FirstName.getAttribute("value"));
		Reporter.addStepLog("Valid customer name is displayed: " + customer.firstName);
	}
	public void clickGoBackToMyAccount() {
		btn_GoBackToMyAccount.click();
	}
	
}
