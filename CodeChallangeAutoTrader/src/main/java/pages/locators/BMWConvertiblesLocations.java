package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BMWConvertiblesLocations {

	@FindBy(how=How.XPATH,using="//*[@class='text-bold text-size-400 text-size-sm-500 display-inline margin-right-2' and contains(text(),'Certified BMW Convertibles for Sale in Alpharetta, GA')]")
	public WebElement bmwHeading;
	
	@FindBy(how=How.XPATH,using="//*[@data-cmp='inventoryListing']")
	public List<WebElement> listOfBMW;
	
}
