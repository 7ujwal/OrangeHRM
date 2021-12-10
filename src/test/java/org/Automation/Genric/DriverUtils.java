package org.Automation.Genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils 
{
	static WebDriver driver;
	public static void createDriver()
	{
		System.setProperty("webdriver.chrome.driver","D:\\capgemini work space\\java\\New folder\\ORANGEHRM\\Driver\\chromedriver.exe");
		

		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public static WebDriver getDriver()
	{
		if(driver==null)
		{
		  createDriver();
		} 
		return driver;
	}
	}
