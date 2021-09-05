package SeleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testDataTypes.Customer;

public class ShopRegistrationPage extends BasePage{
	
	public ShopRegistrationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "#email_create") 
	private WebElement txtbx_EmailForCreation;

	@FindBy(how = How.CSS, using = "#SubmitCreate") 
	private WebElement btn_CreateAccount;
	
	@FindBy(how = How.CSS, using = "#email") 
	private WebElement txtbx_ExistingEmail;
	
	@FindBy(how = How.CSS, using = "#passwd") 
	private WebElement txtbx_ExistingPassword;

	@FindBy(how = How.CSS, using = "#SubmitLogin") 
	private WebElement btn_SigninLogin;
	
	@FindBy(how = How.CSS, using = "#customer_firstname") 
	private WebElement txtbx_FirstName;
	
	@FindBy(how = How.CSS, using = "#customer_lastname") 
	private WebElement txtbx_LastName;

	@FindBy(how = How.CSS, using = "#email") 
	private WebElement txtbx_Email;
	
	@FindBy(how = How.CSS, using = "#passwd") 
	private WebElement txtbx_Password;
	
	@FindBy(how = How.CSS, using = "#firstname") 
	private WebElement txtbx_AddressFirstName;

	@FindBy(how = How.CSS, using = "#lastname") 
	private WebElement txtbx_AddressLastName;
	
	@FindBy(how = How.CSS, using = "#alias") 
	private WebElement txtbx_AliasAddress;
	
	@FindBy(how = How.CSS, using = "#phone_mobile") 
	private WebElement txtbx_Phone;
	
	@FindAll(@FindBy(how = How.CSS, using = "#id_country"))
	private WebElement drpdown_Country;	

	@FindBy(how = How.CSS, using = "#id_state")
	private WebElement drpdown_State;	
	
	@FindBy(how = How.CSS, using = "#city") 
	private WebElement txtbx_City;
	
	@FindBy(how = How.CSS, using = "#address1") 
	private WebElement txtbx_Address;
	
	@FindBy(how = How.CSS, using = "#postcode") 
	private WebElement txtbx_PostCode;
		
	@FindBy(how = How.CSS, using = "#submitAccount") 
	private WebElement btn_Register;
	
	public void initiatePageElements() {

	    PageFactory.initElements(driver, this);
		
	}
	public boolean verifyRegistrationPageDisplayed() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
         return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#center_column h1")))!=null;
	}
	
	public void quitChromeBrowser() {
		driver.quit();
	}

	public void clickCreateAccount() {
		btn_CreateAccount.click();
		
	}
	public void enter_Name(String name) {
		visibilityOf(txtbx_FirstName);
		txtbx_FirstName.sendKeys(name);
	}
	
	public void enter_LastName(String lastName) {
		txtbx_LastName.sendKeys(lastName);
	}

	public void enter_Email(String email) {
		txtbx_Email.clear();
		txtbx_Email.sendKeys(email);
	}

	public void enter_Password(String password) {
		txtbx_Password.clear();
		txtbx_Password.sendKeys(password);
	}
	
	public void enter_Phone(String phone) {
		txtbx_Phone.sendKeys(phone);
	}
	
	public void enter_City(String city) {
		txtbx_City.sendKeys(city);
	}
	
	public void enter_Address(String address) {
		txtbx_Address.sendKeys(address);
	}

	public void enter_PostCode(String postCode) {
		txtbx_PostCode.sendKeys(postCode);
	}

	public void enter_State(String strState) {
		new Select(drpdown_State).selectByVisibleText(strState);
	}
	
	public void select_Country(String countryName) {
		new Select(drpdown_Country).selectByVisibleText(countryName);
	}
	
	
	public void clickRegisterButton() {
		btn_Register.click();
	}
	
	public void enterEmailIdForCreation(Customer customer) {
		txtbx_EmailForCreation.clear();
		txtbx_EmailForCreation.sendKeys(customer.emailAddress);
	}
	
	public void enterEmailForLogin(String strEmailAddress) {
		txtbx_ExistingEmail.clear();
		txtbx_ExistingEmail.sendKeys(strEmailAddress);
	}
	
	public void enterPasswordForLogin(String strPassword) {
		txtbx_ExistingPassword.sendKeys(strPassword);
	}
	
	public void clickSignInButton() {
		btn_SigninLogin.click();
	}
	
	public void fill_PersonalDetails(Customer customer) {
		enter_Name(customer.firstName);
		enter_LastName(customer.lastName);
		enter_Phone(customer.phoneNumber.mob);
		enter_Email(customer.emailAddress);
		enter_Password(customer.password);
		enter_State(customer.address.state);
		enter_City(customer.address.city);
		enter_Address(customer.address.streetAddress);
		enter_PostCode(customer.address.postCode);
		select_Country(customer.address.country);
	}
	
	public void loginAsExistingUser(Customer customer) {
		enterEmailForLogin(customer.emailAddress);
		enterPasswordForLogin(customer.password);
		clickSignInButton();
	}
	
}
