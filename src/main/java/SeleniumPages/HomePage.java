package SeleniumPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = ".login") 
	private WebElement btn_SignIn;

	@FindBy(how = How.CSS, using = "#search_query_top") 
	private WebElement txtbx_SearchBox;
	
	@FindBy(how = How.CSS, using = "button[name='submit_search']") 
	private WebElement lnk_ClickSearch;
	
	
	public void initiatePageElements() {
	    PageFactory.initElements(driver, this);
	}
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","E:/Eclipse Photon Workspace/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		initiateWait(driver);
		System.out.println("launched browser");

	}

	public void openShopURL(String strURL) {
		driver.get(strURL);
		System.out.println("launched URL");
		
	}
	
	public void clickSignInButton() {
		btn_SignIn.click();
		System.out.println("clicked sign in");
		Reporter.addStepLog("Clicked sign in button");
	}
	
	public void quitChromeBrowser() {
		driver.quit();
	}
	
	public void searchProduct(String strProductName) {
		txtbx_SearchBox.sendKeys(strProductName);
	}
	
	public void clickSearch() {
		lnk_ClickSearch.click();
	}
	
	public void searchForProduct(String strProductName) {
		searchProduct(strProductName);
		clickSearch();
		waitForPageLoad();
	}
	
	
}
