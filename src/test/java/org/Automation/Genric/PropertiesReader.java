package org.Automation.Genric;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader
{
	static Properties ke= new Properties();
	
	public static void initProperty()
	{
		try 
		{
			ke.load(new FileInputStream("D:\\capgemini work space\\java\\New folder\\ORANGEHRM\\src\\test\\resources\\config\\keys"));
		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String Key)
	{
		return ke.getProperty(Key);
	}
}
