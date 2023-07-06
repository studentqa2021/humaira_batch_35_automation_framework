package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileCacheImageInputStream;


public class BaseConfig {
	//getConfig return "value"
	
	public static String getConfig (String testData) throws IOException {
	String filepath = "./Environments/dev.properties";
	//file> fin class> stream
	FileInputStream fis = new FileInputStream(filepath);
	//read the value from the file
	Properties pro = new Properties();
	pro.load(fis);	
	// read each value 
	String value =  pro.get(testData).toString();
	
	return value;
}
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(BaseConfig.getConfig("URL"));

		System.out.println(BaseConfig.getConfig("USER"));

		System.out.println(BaseConfig.getConfig("PASSWORD"));
	}
	
	
		
}