package com.adacrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources",
		glue = "com.adactinstepdef",
		plugin = {"pretty","html:target/adactinreport.html", "json:target/adacreport.json"}
		
		
		)

public class AdactinHotelRunner {

}
