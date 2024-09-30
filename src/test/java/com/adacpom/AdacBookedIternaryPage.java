package com.adacpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.adactinbase.AdactinHotelBase;

public class AdacBookedIternaryPage extends AdactinHotelBase {
	
	
	public AdacBookedIternaryPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Search Order ID
	@FindBy(xpath = "//input[@id='order_id_text']")
	private WebElement searchorderid;
	
	//Go button
	@FindBy(xpath = "//input[@id='search_hotel_id']")
	private WebElement gobtn;

	public WebElement getSearchorderid() {
		return searchorderid;
	}

	public WebElement getGobtn() {
		return gobtn;
	}
	
	public void bookediternary() {
		
		searchorderid.sendKeys(AdacBookingConfirmationPage.orderno);
		gobtn.click();
		
	}

}
