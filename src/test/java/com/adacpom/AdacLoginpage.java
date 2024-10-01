package com.adacpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactinbase.AdactinHotelBase;

public class AdacLoginpage extends AdactinHotelBase {
	
	public AdacLoginpage() { // constructor - Instance of a class
		PageFactory.initElements(driver, this); // PageFactory is being intialized here
	}
	//Encapsulation (Data Hiding)- Below private declaration are used to call within the class 

	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='login']")
	private WebElement click;
	
	@FindBy(xpath = "//td[contains(text(),'Welcome to Adactin')]")
	private WebElement text;
	
	@FindBy(xpath = "//b[contains(text(),'Invalid')]")
	private WebElement wrongtext;

	//Encapsulation -Below Getter and Setter method are used
	//Get -To retrieve the value of above private field
	//Set -To set the value of above private field


	public WebElement getUsername() {
		return username;
	}

	public WebElement getWrongtext() {
		return wrongtext;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClick() {
		return click;
	}
	
	public WebElement getText() {
		return text;
		
	}

}


