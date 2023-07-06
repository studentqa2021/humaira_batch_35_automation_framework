package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig1 {

	
	
	//getConfig return "value"
	
		public static String getConfig (String testData) throws IOException {
		String filepath = "./Environments/qa.properties";
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
			
			System.out.println(BaseConfig1.getConfig("URL"));

			System.out.println(BaseConfig1.getConfig("EMAIL"));

			System.out.println(BaseConfig1.getConfig("PASSWORD"));
		}
		
		
			
	}
	
	

