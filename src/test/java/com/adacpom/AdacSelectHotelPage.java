package com.adacpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactinbase.AdactinHotelBase;

//import net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator.Implicit;

public class AdacSelectHotelPage extends AdactinHotelBase {
	
	public AdacSelectHotelPage() {
		
		// Constructor - Instance of class
		
		PageFactory.initElements(driver, this); //Pagefactory has been initiated here
			
		}
		
		//Radio button to select the searched hotel
		@FindBy(xpath = "//input[@id='radiobutton_0']")
		private WebElement radio;
		
		//Continue button to navigate next page
		@FindBy(xpath = "//input[@id='continue']")
		private WebElement conti;


		public WebElement getRadio() {
			return radio;
		}


		public WebElement getConti() {
			return conti;
		}
		
	 @SuppressWarnings("deprecation")
	public void selecthotel() {
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 radio.click();
		 conti.click();
	 }
		
	}


