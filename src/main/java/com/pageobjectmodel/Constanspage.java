package com.pageobjectmodel;

import org.openqa.selenium.By;

import com.util.BaseConfig;

public class Constanspage {

	public static By signIn=By.xpath("//*[@class='authorization-link']");
	
	public static By email=By.xpath("//*[@id='email']");
	
	public static By password=By.xpath("title=\"Password\"");
	
	public static By finalSignIn=By.xpath("//*[@class=\"action login primary\"]");
	
	
}
