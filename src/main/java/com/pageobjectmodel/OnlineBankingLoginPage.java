package com.pageobjectmodel;

import org.openqa.selenium.By;

public class OnlineBankingLoginPage {
	//POM= By()
	//PF= @FINDBY

	private static By user= By.xpath("//*[@id='username']");
	private static By password = By.xpath("//*[@type='password']");
	private static By login= By.xpath("//*[@type='submit']");
	private static By logoutBtn=By.xpath("//*[@id='logoutButton']");
	
	
	public static By getUser() {
		return user;
	}
	public static By getPassword() {
		return password;
	}
	public static By getLogin() {
		return login;
	}
	public static By getLogoutBtn() {
		return logoutBtn;
	}
	
	
	
	
	
	
} 
