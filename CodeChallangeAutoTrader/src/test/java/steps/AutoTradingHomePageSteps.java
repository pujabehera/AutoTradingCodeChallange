package steps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.AutoTradingHomePageAction;
import utils.SeleniumDriver;

public class AutoTradingHomePageSteps {

	AutoTradingHomePageAction autoTradingHomePageAction = new AutoTradingHomePageAction();
	
	
	@Given("^Navigate to home page \"([^\"]*)\" of AutoTrading website$")
	public void navigate_to_home_page_of_AutoTrading_website(String websiteURL) throws Throwable {
	    SeleniumDriver.openPage(websiteURL);
	}

	@When("^Click on the Links and check links are enabled$")
	public void click_on_the_Links_and_check_links_are_enabled(List<String> list) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		String link1 = list.get(1);
		System.out.println("The 1st Link is: "+link1);
		autoTradingHomePageAction.browsebyMakeLink();
		
		SeleniumDriver.waitForPageToLoad();
		String link2 = list.get(2);
		System.out.println("The 2nd Link is: "+link2);
		autoTradingHomePageAction.browsebyStyleLink();
		
		SeleniumDriver.waitForPageToLoad();
		String link3 = list.get(3);
		System.out.println("The 3rd Link is: "+link3);
		autoTradingHomePageAction.advanceSearchLink();
		
	}
	
	@Then("^check the Search button$")
	public void check_the_Search_button() throws Throwable {
	   autoTradingHomePageAction.searchButton();
	}

	@Then("^Check the drop downs$")
	public void check_the_drop_downs() throws Throwable {
		
		//System.out.println("The 1st Link is: "+link1);
		autoTradingHomePageAction.anymakeDropdown();
		autoTradingHomePageAction.anyModelDropdown();
	    
	}

}
