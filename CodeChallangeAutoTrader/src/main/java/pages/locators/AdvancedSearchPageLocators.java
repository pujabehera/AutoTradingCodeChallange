package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdvancedSearchPageLocators {

	@FindBy(how=How.XPATH,using="//input[@id='zip30004']")
	public WebElement zipCode;
	
	@FindBy(how=How.XPATH,using=" //div[contains(text(),'Certified')]")
	public WebElement certifiedCheckBox;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Convertible')]")
	public WebElement convertibleCheckBox;
	
	@FindBy(how=How.XPATH,using="//select[@id='4101482096']")
	public WebElement fromYearDropDown;
	
	@FindBy(how=How.XPATH,using=" //select[@id='258002540']")
	public WebElement toYearDropBox;
	
	@FindBy(how=How.XPATH,using="//select[@id='1970425032']")
	public WebElement anyMakeDropBox;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-xs-12 col-sm-5 col-lg-6']/div/button")
	public WebElement searchBtn;
	
	
}
