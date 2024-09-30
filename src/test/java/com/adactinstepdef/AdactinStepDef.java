package com.adactinstepdef;

import org.openqa.selenium.WebElement;

import com.adacpom.AdacLoginpage;
import com.adacpom.AdacSearchHotelpage;
import com.adactinbase.AdactinHotelBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepDef extends AdactinHotelBase {
	
	AdacLoginpage adaclogin;
	AdacSearchHotelpage adacsearch;

	@Given("User should launch the browser")
	public void user_should_launch_the_browser() {
		initURL();
	}
	@When("User should write {string} and {string}")
	public void user_should_write_and(String username, String password) {
	  //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("giugiugj");
		adaclogin = new AdacLoginpage();
		
		EnterValue(adaclogin.getUserName(), username); 
		EnterValue(adaclogin.getPassword(), password);
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
	   Click(adaclogin.getClick());
	}

	@Then("User should verify success message after login")
	public void user_should_verify_success_message_after_login() {
	   WebElement welcomtxt = adaclogin.getText();
	   System.out.println(welcomtxt.getText());
	}

	@Then("User should logoff")
	public void user_should_logoff() {
driver.quit();
	}
	
	@Then("User should search the hotel")
	public void user_should_search_the_hotel() {
		
	// Search for the hotel by selecting the values 
	    adacsearch = new AdacSearchHotelpage();
	    adacsearch.searchhotel();
	}
	  
	    @Then("User should select the hotel")
	    public void user_should_select_the_hotel() {
//	    	select = new AdacSelectHotelPage();
//		    select.selecthotel();
	    }
	    
}
