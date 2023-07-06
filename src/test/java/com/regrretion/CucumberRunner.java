package com.regrretion;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//options={}= report
		//feature file path=
		//glue= stefdef package name
		//@tag
		
				plugin = { "json:target/cucumber.json" }, // report = main in json format {}
				features = { "./src/test/resources/OnlineBankingLogin.feature" }, // feature file location/path
				glue = { "com.generic" }, // step def package name
				tags = "@SmokeTest" // test type= @Smoke

		)


public class CucumberRunner extends AbstractTestNGCucumberTests {

}
