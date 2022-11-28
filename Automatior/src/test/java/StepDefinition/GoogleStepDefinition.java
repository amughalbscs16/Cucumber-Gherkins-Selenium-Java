package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//TidyGherkin Tool

public class GoogleStepDefinition {
	@Given("User is on landing page {string}")
	public void user_on_LandingPage(String url) {
		System.out.println("Landing Page");
		
	}
	@When("User enters the search {string}")
	public void user_enter_search_words(String search_keyword) {
		System.out.println("Search Words");
	}
	@And("User Clicks on the search button")
	public void user_click_search_button() {
		System.out.println("Click Search");
	}
	@Then("Results are displayed")
	public void results_displayed() {
		System.out.println("Result Page");
	}
	
}
