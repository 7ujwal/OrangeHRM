package org.Automation.Test;

import org.Automation.Genric.DriverUtils;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
	 @BeforeTest 
  
		     public void setup() 
		  {
		    	 DriverUtils.createDriver();
		    	 
		     }
		    /* @AfterMethod
		     public void cleanUp() {
		    	 DriverUtils.getDriver().quit();
		     }*/
		}