package SeleniumPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = ".login") 
	private WebElement btn_SignIn;
	
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

	public void openShopURL() {
		driver.get("http://automationpractice.com/index.php");
		System.out.println("launched URL");
		
	}
	
	public void clickSignInButton() {
		btn_SignIn.click();
		System.out.println("clicked sign in");

	}
	
	public void openGoogleURL() {
		driver.get("http://google.com");
	}
	
	public void checkSearchBoxIsDisplayed() {
		if(driver.findElement(By.name("q")).isDisplayed())
			System.out.println("Search box is displayed");
		else
			System.out.println("Search box is NOT displayed");
	}
	
	public void checkGoogleSearchButtonIsDisplayed() {
		if(driver.findElement(By.name("btnK")).isDisplayed()) {
			System.out.println("Google Search button is displayed");
		} else {
			System.out.println("Google Search button is NOT displayed");
		}
	}
	
	public void checkImFeelingLuckyButtonIsDisplayed() {
		if(driver.findElement(By.name("btnI")).isDisplayed()) {
			System.out.println("I'm Feeling Lucky button is displayed");
		} else {
			System.out.println("I'm Feeling Lucky button is NOT displayed");
		}
	}
	
	public void searchGoogle() {
		if(driver.findElement(By.name("q")).isDisplayed()) {
			driver.findElement(By.name("q")).sendKeys("Search Google");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.name("q")).submit();
			@SuppressWarnings("unused")
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(ElementNotVisibleException.class);
			
		}
	}
	public void quitChromeBrowser() {
		driver.quit();
	}
	
	public void waitStatements() {
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.getOptions();
	}
	
	public void executeJavaScript() {
		
		@SuppressWarnings("unused")
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//TO BE IMPLEMENTED
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(driver.findElement(By.className("")), 10, 10);
	}
	
	public void driverNavigation() {
		driver.navigate().to("google.com");
		driver.manage().window().maximize();
		driver.navigate().to("yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
	}
}
