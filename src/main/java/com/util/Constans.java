package com.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pageobjectmodel.Constanspage;

import cucumber.api.cli.Main;

public class Constans {
	@Test
	public void getLogin() throws IOException {
	//open browser
	
		WebDriver driver = new ChromeDriver();
	//maximize
		driver.manage().window().maximize();
	//go to URL
		driver.get(BaseConfig.getConfig("URL"));
	//click sign in
	driver.findElement(Constanspage.signIn).click();
	//send email
	driver.findElement(Constanspage.email).click();
	driver.findElement(Constanspage.email).sendKeys(BaseConfig.getConfig("email"));
	//send password
	driver.findElement(Constanspage.password).click();
	driver.findElement(Constanspage.password).sendKeys(BaseConfig.getConfig("password"));
	//click final sign in
	driver.findElement(Constanspage.finalSignIn).click();
	//close browser
	driver.quit();
	
	
	
	
	
	
	
	
	
	
		
		
		
		
}
}