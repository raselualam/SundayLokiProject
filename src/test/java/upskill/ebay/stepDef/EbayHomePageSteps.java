package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		//Wait
	}
	

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
	}
	
	@When("^Search for Shirts$")
	public void search_for_Shirts() throws Throwable {
		EbayHomePageActionsObj.searchShirt();
	}
	
	@When("^Search for Pants$")
	public void search_for_Pants() throws Throwable {
		EbayHomePageActionsObj.searchPent();
	}
}
