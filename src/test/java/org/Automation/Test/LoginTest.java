package org.Automation.Test;

import org.Automation.Genric.PropertiesReader;
import org.Automation.Page.AdminPage;
import org.Automation.Page.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
	LoginPage loginpage = new LoginPage();
	AdminPage act=new AdminPage();
	@Test
	public void VerifyLogin() throws InterruptedException 
	{
		
		loginpage.openpage();
		Thread.sleep(3000);
		PropertiesReader.initProperty();
		
		loginpage.enterUsename(PropertiesReader.getProperty("login.username"));
		Thread.sleep(2000);
		loginpage.enterPassword(PropertiesReader.getProperty("login.password"));
		Thread.sleep(2000);
		
		
		/*loginpage.clickLogin();
		Thread.sleep(2000);		
		loginpage.ClickAdmin();
		Thread.sleep(1000);
		loginpage.AddUser();
		*/
	}
	public void VerifyAddUser()
	{
		act.Action();
		act.SelectRole();
		PropertiesReader.initProperty();
		act.enterUname(PropertiesReader.getProperty("login.Ename"));
		
		act.enterEname(PropertiesReader.getProperty("login.Ename"));
		
		act.enterPwd(PropertiesReader.getProperty("login.pass"));
		
		act.enterCPwd(PropertiesReader.getProperty("login.confirmpass"));
	}
	
	
}