package com.adacpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.adactinbase.AdactinHotelBase;

public class AdacSearchHotelpage extends AdactinHotelBase  {

	public AdacSearchHotelpage() {
		
		// Constructor - Instance of class

				PageFactory.initElements(driver, this); //Pagefactory has been initiated here
			}

			//list of location dropdowndown
			@FindBy(xpath = "//select[@id='location']")
			private WebElement drpdwn1;

			//list of hotels dropdown
			@FindBy(xpath = "//select[@id='hotels']")
			private WebElement drpdwn2;

			//list of Room Type dropdown
			@FindBy(xpath = "//select[@id='room_type']")
			private WebElement drpdwn3;

			//No. of rooms dropdown
			@FindBy(xpath = "//select[@id='room_nos']")
			private WebElement drpdwn4;

			// Datein text field
			@FindBy(xpath = "//input[@id='datepick_in']")
			private WebElement indate;

			//Dateout text field
			@FindBy(xpath = "//input[@id='datepick_out']")
			private WebElement outdate;

			//Adults per Room drop down
			@FindBy(xpath = "//select[@id='adult_room']")
			private WebElement drpdwn5;

			//Children per Room drop down
			@FindBy(xpath = "//select[@id='child_room']")
			private WebElement drpdwn6;

			//Submit button
			@FindBy(xpath = "//input[@id='Submit']")
			private WebElement submit;

			public WebElement getDrpdwn1() {
				return drpdwn1;
			}

			public WebElement getDrpdwn2() {
				return drpdwn2;
			}

			public WebElement getDrpdwn3() {
				return drpdwn3;
			}

			public WebElement getDrpdwn4() {
				return drpdwn4;
			}

			public WebElement getIndate() {
				return indate;
			}

			public WebElement getOutdate() {
				return outdate;
			}

			public WebElement getDrpdwn5() {
				return drpdwn5;
			}

			public WebElement getDrpdwn6() {
				return drpdwn6;
			}

			public WebElement getDrpdwn7() {
				return submit;
			}

			public void searchhotel() {
				//list of location dropdowndown
				WebElement dropdown1 = getDrpdwn1();
				dropdown1.click();
				Select select1 = new Select(dropdown1);
				select1.selectByIndex(3);
				
				//list of hotels dropdown
				WebElement dropdown2 = getDrpdwn2();
				dropdown2.click();
				Select select2 = new Select(dropdown2);
				select2.selectByIndex(2);
				
				//list of Room Type dropdown
				WebElement dropdown3 = getDrpdwn3();
				dropdown3.click();
				Select select3 = new Select(dropdown3);
				select3.selectByIndex(2);
				
				//No. of rooms dropdown
				WebElement dropdown4 = getDrpdwn4();
				dropdown4.click();
				Select select4 = new Select(dropdown4);
				select4.selectByIndex(2);
				
				indate.sendKeys("27/09/2024");
				outdate.sendKeys("30/09/2024");
				
				//Adults per Room drop down
				WebElement dropdown5 = getDrpdwn5();
				dropdown5.click();
				Select select5 = new Select(dropdown5);
				select5.selectByIndex(2);
				
				//Children per Room drop down
				WebElement dropdown6 = getDrpdwn5();
				dropdown6.click();
				Select select6 = new Select(dropdown6);
				select6.selectByIndex(2);
				
				submit.click();
				
				
			}

	}

