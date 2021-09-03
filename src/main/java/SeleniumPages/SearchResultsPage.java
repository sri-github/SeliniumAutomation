package SeleniumPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.listener.Reporter;

public class SearchResultsPage extends BasePage{

	public SearchResultsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = ".product-listing span") 
	private WebElement lbl_SearchResultsFound;

	@FindBy(how = How.CSS, using = ".product-listing .heading-counter") 
	private WebElement lbl_NumberOfSearchResults;

	@FindAll(@FindBy(how = How.CSS, using = "ul.product_list  li .product-container"))
	private List<WebElement> grpList_Products;

	@FindBy(how = How.CSS, using = "a.quick-view") 
	private WebElement lnk_QuickView;
	
	public void initiatePageElements() {
	    PageFactory.initElements(driver, this);
	}
	
	public void validateSearchResultsDisplayedByName(String strSearchTerm) {
		if(lbl_SearchResultsFound.getText().contains(strSearchTerm.toUpperCase()))
			Reporter.addStepLog(strSearchTerm + " results displayed");
		else
			Reporter.addStepLog("no results found for : " + strSearchTerm);
		int iNumOfResults = Integer.parseInt(lbl_NumberOfSearchResults.getText().split(" ")[0]);
		Assert.assertEquals(iNumOfResults >0 ,true,"No search results displayed");
	}
	
	public void openQuickViewOfAnyProductFromSearch() {
		Actions mouseHoverAction = new Actions(driver);
		mouseHoverAction.moveToElement(grpList_Products.get(0)).moveToElement(lnk_QuickView).click(lnk_QuickView).build().perform();
		waitForPageLoad();
	}
	
}
