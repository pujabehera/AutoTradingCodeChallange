package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutoTradingHomePageLocators {

	@FindBy(how=How.XPATH,using="//*[contains(@title,'Browse by Make')]")
	public WebElement browsebyMakeLink;
	
	@FindBy(how=How.XPATH,using="//span[@title='Browse by Style']")
	public WebElement browsebyStyleLink;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Advanced Search')]")
	public WebElement advanceSearchLink;
	
	@FindBy(how=How.XPATH,using="//button[@id='search']")
	public WebElement searchBtn;
	
	@FindBy(how=How.XPATH,using="//select[@id='makeCodeListPlaceHolder']")
	public WebElement anymakeDropdown;
	
	@FindBy(how=How.XPATH,using="//select[@id='modelCodeListPlaceHolder']")
	public WebElement anyModelDropDown;
}
