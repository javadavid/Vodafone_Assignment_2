package com.vodafone.testautomation.src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReaderUtil {
	
	private static File file = new File("src/main/resources/datafile.properties");
	private static Properties prop = new Properties();

	public static void readFile()
	{
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//load properties file
		try {
			prop.load(fileInput);
			System.out.println("username:: " + prop.getProperty("username"));
			System.out.println("password:: " + prop.getProperty("password"));
			prop.getProperty("password");
		} catch (IOException ex) {
			ex.printStackTrace();
		}	
	}
	
	public static String getProperty(String propName) 
	{
		return prop.getProperty(propName);
		
	}
	
	
	
}


