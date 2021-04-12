package com.vtiger.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/**
	 * @author adi123
	 * read data from property file
	 * @param path of property file
	 * @param pass key for which u want to read data
	 * @return 
	 * @return value
	 * @throws IOException
	 */
	
	public String readDatafrompropfile(String path,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}

}
