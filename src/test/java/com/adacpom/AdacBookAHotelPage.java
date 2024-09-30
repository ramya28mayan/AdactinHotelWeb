package com.adacpom;

import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.model.Value;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.adactinbase.AdactinHotelBase;

public class AdacBookAHotelPage extends AdactinHotelBase{


	public AdacBookAHotelPage() {
		
		//Constructor - Instance of class
				PageFactory.initElements(driver, this);
				}
			
			
			//Name of the booked hotle 
			@FindBy(xpath = "//input[@id='hotel_name_dis']")
			private WebElement htlnameval;
			
			//Location of the hotel booked 
			@FindBy(xpath = "//input[@id='location_dis']")
			private WebElement htllocationval;
			
			//Room type
			@FindBy(xpath = "//input[@id='room_type_dis']")
			private WebElement roomtypeval;
			
			//No. of rooms booked
			@FindBy(xpath = "//input[@id='room_num_dis']")
			private WebElement roomsbkdval;
			
			//Total no. of days
			@FindBy(xpath = "//input[@id='total_days_dis']")
			private WebElement noofdaysstayval;
			
			//Price per night
			@FindBy(xpath = "//input[@id='price_night_dis']")
			private WebElement pricepernightval;
			
			//Total price
			@FindBy(xpath = "//input[@id='total_price_dis']")
			private WebElement totalpriceval;
			
			//GST
			@FindBy(xpath = "//input[@id='gst_dis']")
			private WebElement gstval;
			
			//final billed price
			@FindBy(xpath = "//input[@id='final_price_dis']")
			private WebElement finalpriceval;
			
			//Enter the first name
			@FindBy(xpath = "//input[@id='first_name']")
			private WebElement firtnametxt;
			
			//Enter the last name
			@FindBy(xpath = "//input[@id='last_name']")
			private WebElement lastnametxt;
			
			//billing address
			@FindBy(xpath = "//*[@id='address']")
			private WebElement addresstxt;
			
			//credit card
			@FindBy(xpath = "//input[@id='cc_num']")
			private WebElement creditcardint;
			
			//credit card type
			@FindBy(xpath = "//select[@id='cc_type']")
			private WebElement ccdrpdwn;
			//Expiry MOnth
			@FindBy(xpath = "//select[@id='cc_exp_month']")
			private WebElement expirymntdrpdwn;
			//Expiry year
			@FindBy(xpath = "//select[@id='cc_exp_year']")
			private WebElement expiryyeardrpdwn;
			//cvv no.
			@FindBy(xpath = "//input[@id='cc_cvv']")
			private WebElement cvvnoint;
			
			//book now button
			@FindBy(xpath = "//input[@id='book_now']")
			private WebElement booknowbtn;

			private String value;

			public WebElement getHtlnameval() {
				return htlnameval;
			}

			public WebElement getHtllocationval() {
				return htllocationval;
			}

			public WebElement getRoomtypeval() {
				return roomtypeval;
			}

			public WebElement getRoomsbkdval() {
				return roomsbkdval;
			}

			public WebElement getNoofdaysstayval() {
				return noofdaysstayval;
			}

			public WebElement getPricepernightval() {
				return pricepernightval;
			}

			public WebElement getTotalpriceval() {
				return totalpriceval;
			}

			public WebElement getGstval() {
				return gstval;
			}

			public WebElement getFinalpriceval() {
				return finalpriceval;
			}

			public WebElement getFirtnametxt() {
				return firtnametxt;
			}

			public WebElement getLastnametxt() {
				return lastnametxt;
			}

			public WebElement getAddresstxt() {
				return addresstxt;
			}

			public WebElement getCreditcardint() {
				return creditcardint;
			}

			public WebElement getCcdrpdwn() {
				return ccdrpdwn;
			}

			public WebElement getExpirymntdrpdwn() {
				return expirymntdrpdwn;
			}

			public WebElement getExpiryyeardrpdwn() {
				return expiryyeardrpdwn;
			}

			public WebElement getCvvnoint() {
				return cvvnoint;
			}

			public WebElement getBooknowbtn() {
				return booknowbtn;
			}
			
		@SuppressWarnings("deprecation")
		public void bookhotel() {
			
//			Object nameofthehotel = htlnameval.getAttribute(value);
//			System.out.println(nameofthehotel);
			
		//Print the name of the hotel
			String hotelname = getHtlnameval().getAttribute("value");
           System.out.println("Hotel name you booked is " + hotelname + ".");
           
           //Print the location of the hotel
           String location = getHtllocationval().getAttribute("value");
           System.out.println("It is located in " + location + ".");
           
           //Print the room type
           String typeofroom = getRoomtypeval().getAttribute("value");
           System.out.println("And the room type you booked is "+ typeofroom);
           
           //Print the no. of rooms booked
          
           String noofrooms = getRoomsbkdval().getAttribute("value");
           System.out.println("Total no. of rooms booked are " + noofrooms);
           
           //Total no. of days booked
           String totaldays = getNoofdaysstayval().getAttribute("value");
           System.out.println("The total no. of days booked are " + totaldays);
           
           //Final billed value
           String finalamnt = getFinalpriceval().getAttribute("value");
           System.out.println("The final amount to be paid " + finalamnt);
           
           firtnametxt.sendKeys("Ramya");
           lastnametxt.sendKeys("M");
           driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
           addresstxt.sendKeys("dubai main road");
           creditcardint.sendKeys("2345678987654323");
           
           //list of credit card types(Visa , Master )
           WebElement creditcardtype = getCcdrpdwn();
           creditcardtype.click();
           Select cctype = new Select(creditcardtype);
           cctype.selectByIndex(2);
           
           //Expiry month from dropdown
           WebElement expirymnth = getExpirymntdrpdwn();
           expirymnth.click();
           Select month = new Select(expirymnth);
           month.selectByIndex(2);
           
           //Expiry year from dropdown
           WebElement expiryyear = getExpiryyeardrpdwn();
           expiryyear.click();
           Select year = new Select(expiryyear);
           year.selectByIndex(12);
           
           //Cvv no.
           cvvnoint.sendKeys("342");
           
           //Click on Book Now button
           
           booknowbtn.click();
           
           }	
		
				
	}


