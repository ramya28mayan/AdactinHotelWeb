package com.adacpom;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactinbase.AdactinHotelBase;

public class AdacBookingConfirmationPage extends AdactinHotelBase {
	static String orderno;
	public AdacBookingConfirmationPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//order no. field
	@FindBy(xpath = "//input[@id='order_no']")
		private WebElement orderNo;
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myiternary;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getMyiternary() {
		return myiternary;
	}
	
	
	@SuppressWarnings("deprecation")
	public void confirmbook() {
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		orderno = getOrderNo().getAttribute("value");
		System.out.println(orderno);
		
		myiternary.click();
	}
	
	
	

}
