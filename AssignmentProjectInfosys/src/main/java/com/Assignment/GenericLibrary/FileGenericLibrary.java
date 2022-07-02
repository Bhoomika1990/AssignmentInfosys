package com.Assignment.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileGenericLibrary {
	
	public String readDataFromPropertyFile(String filePath, String key) throws FileNotFoundException, IOException {

		Properties propObj = new Properties();
		propObj.load(new FileInputStream(filePath));
		return propObj.getProperty(key, "Properties File :Incorrect Key");

	}

}
