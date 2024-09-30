package com.adactinbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdactinHotelBase {
	public static WebDriver driver;
	
	public static void initURL() {
		
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
	}
	//For entering the Values
	public void EnterValue(WebElement w,String s) {
	w.sendKeys(s);
	}
	
	public static void Click(WebElement c) {
		c.click();
		
	}
}
