
package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pageobjectmodel.OnlineBankingLoginPage;
import com.util.BaseConfig;

public class OnlineBanking {

	//void method getLogin
	@Test
	public static void getLogin() throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseConfig.getConfig("URL"));
		
		//put user
		driver.findElement(OnlineBankingLoginPage.getUser()).click();
		System.out.println(BaseConfig.getConfig("USER"));
        driver.findElement(OnlineBankingLoginPage.getUser()).sendKeys(BaseConfig.getConfig("USER"));
		
		//put pass

	
        driver.findElement(OnlineBankingLoginPage.getPassword()).click();
		System.out.println(BaseConfig.getConfig("PASSWORD"));
        driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("PASSWORD"));
		
		//click login
        driver.findElement(OnlineBankingLoginPage.getLogin()).click();
        
        
        //assertion
		SoftAssert sf= new SoftAssert();
		sf.assertTrue(driver.findElement(OnlineBankingLoginPage.getLogoutBtn()).isDisplayed());
		System.out.println("Hello");
		
		sf.assertAll();
	}
	// check video 11 than 12
	
}
