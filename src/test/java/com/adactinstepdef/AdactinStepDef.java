package com.adactinstepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.adacpom.AdacBookAHotelPage;
import com.adacpom.AdacBookedIternaryPage;
import com.adacpom.AdacBookingConfirmationPage;
import com.adacpom.AdacLoginpage;
import com.adacpom.AdacSearchHotelpage;
import com.adacpom.AdacSelectHotelPage;
import com.adactinbase.AdactinHotelBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepDef extends AdactinHotelBase {
	
	AdacLoginpage adaclogin;
	AdacSearchHotelpage adacsearch;
	AdacSelectHotelPage adacselect;
	AdacBookAHotelPage  adacbook;
	AdacBookingConfirmationPage confirmbook;
	AdacBookedIternaryPage iternary;
	
	@Given("User should launch the browser")
	public void user_should_launch_the_browser() {
		initURL();
	}
	@When("User should write {string} and {string}")
	public void user_should_write_and(String username, String password) {
	  //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("giugiugj");
		adaclogin = new AdacLoginpage();
		
		EnterValue(adaclogin.getUsername(), username); 
		EnterValue(adaclogin.getPassword(), password);
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
	   Click(adaclogin.getClick());
	}

	@Then("User should verify success message after login")
	public void user_should_verify_success_message_after_login() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   WebElement welcomtxt = adaclogin.getText();
	   System.out.println(welcomtxt.getText());
	}

	@When("User should write correct {string} and wrong {string}")
	public void user_should_write_correct_and_wrong(String username, String password) {
adaclogin = new AdacLoginpage();
		
		EnterValue(adaclogin.getUsername(), username); 
		EnterValue(adaclogin.getPassword(), password);
	}

	@SuppressWarnings("deprecation")
	@Then("User should validate the error message")
	public void user_should_validate_the_error_message() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String wrgtext = adaclogin.getWrongtext().getText();
	    System.out.println(wrgtext);
	}
	
	
	@When("User click on forgot password")
	public void user_click_on_forgot_password() {
		//Click(passwordlink);
		adaclogin = new AdacLoginpage();
		adaclogin.getPasswordlink().click();
		WebElement enteremail = adaclogin.getEnteremail();
		enteremail.sendKeys("ironmancaptainamerica28@gmail.com");
		adaclogin.getEmsubmitbtn().click();
	}

	@Then("Print the error message")
	public void print_the_error_message() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String text = adaclogin.getPassemail().getText();
	    System.out.println(text);
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
	    	
	    	//Select the hotel 
	    	System.out.println("User select the hotel");
	    	adacselect = new AdacSelectHotelPage();
	    	adacselect.selecthotel();
	    }
	    
	    @Then("User should book the hotel")
	    public void user_should_book_the_hotel() {
	        // Book a hotel
	    	
	    	adacbook = new AdacBookAHotelPage();
	    	adacbook.bookhotel();
	    	
	    }
	    

@Then("User should get the booking confirmation along with the orderID")
public void user_should_get_the_booking_confirmation_along_with_the_order_id() {
	confirmbook = new AdacBookingConfirmationPage();
	confirmbook.confirmbook();
}

@Then("Search for the order ID in the list of Booked Iternary")
public void search_for_the_order_id_in_the_list_of_booked_iternary() {
    iternary = new AdacBookedIternaryPage();
    iternary.bookediternary();
}



	    
	    

	    
}
