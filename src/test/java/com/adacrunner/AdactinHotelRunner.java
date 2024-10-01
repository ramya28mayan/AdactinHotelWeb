package com.adacrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources",
		glue = "com.adactinstepdef",
		dryRun = false,
		tags = "@adactin_Login_logout or @adactin_InvalidLogin_logout",
		plugin = {"pretty","html:target/adactinreport.html", "json:target/adacreport.json"},
		monochrome = true
		
		
		)

public class AdactinHotelRunner {

}
