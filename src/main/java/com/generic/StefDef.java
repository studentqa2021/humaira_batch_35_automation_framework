package com.generic;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.pageobjectmodel.OnlineBankingLoginPage;
import com.util.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StefDef {
WebDriver driver;
	@Given("Go to application URL")
	public void go_to_application_url() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseConfig.getConfig("URL"));
		
	}

	@When("put valid username")
	public void put_valid_username() throws IOException {
		driver.findElement(OnlineBankingLoginPage.getUser()).click();
		System.out.println(BaseConfig.getConfig("USER"));
        driver.findElement(OnlineBankingLoginPage.getUser()).sendKeys(BaseConfig.getConfig("USER"));
		
	}

	@When("put valid password")
	public void put_valid_password() throws IOException {
		driver.findElement(OnlineBankingLoginPage.getPassword()).click();
		System.out.println(BaseConfig.getConfig("PASSWORD"));
        driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("PASSWORD"));
		
	}

	@When("Click login")
	public void click_login1() {
		driver.findElement(OnlineBankingLoginPage.getLogin()).click();
        
	}

	@Then("Logout button should visible for successful login")
	public void logout_button_should_visible_for_successful_login() {
		 //assertion
		SoftAssert sf= new SoftAssert();
		sf.assertTrue(driver.findElement(OnlineBankingLoginPage.getLogoutBtn()).isDisplayed());
		System.out.println("Hello");
		
		sf.assertAll();
	}

	@Given("Go to application")
	public void go_to_application() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseConfig.getConfig("URL"));
		
	}

	@When("put invalid username")
	public void put_invalid_username() throws IOException {
		driver.findElement(OnlineBankingLoginPage.getUser()).click();
		System.out.println(BaseConfig.getConfig("INVALID_USER"));
        driver.findElement(OnlineBankingLoginPage.getUser()).sendKeys(BaseConfig.getConfig("INVALID_USER"));
		
	}

	@When("put invalid password")
	public void put_invalid_password() throws IOException {
		driver.findElement(OnlineBankingLoginPage.getPassword()).click();
		System.out.println(BaseConfig.getConfig("INVALID_PASSWORD"));
        driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("INVALID_PASSWORD"));
		
	}

	@When("click login")
	public void click_login() {
		driver.findElement(OnlineBankingLoginPage.getLogin()).click();
        
	}

	@Then("Logout button should not visible for successful login")
	public void logout_button_should_not_visible_for_successful_login() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
		SoftAssert sf= new SoftAssert();
		sf.assertTrue(!driver.findElement(OnlineBankingLoginPage.getLogoutBtn()).isDisplayed());
		System.out.println("Hello");
		
		sf.assertAll();
	}


	
}
