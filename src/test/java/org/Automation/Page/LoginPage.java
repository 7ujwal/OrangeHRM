package org.Automation.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage
{@FindBy
	(id="txtUsername")
private WebElement unTB;

@FindBy
(id="txtPassword")
private WebElement pwTB;

@FindBy
(xpath = "//input[@type='submit']")
private WebElement btnLogin;
@FindBy(xpath="//b[text()='Admin']")
private WebElement btnAdmin;
@FindBy(xpath="//a[@class='arrow']")
private WebElement btnUsrManagement;
@FindBy(xpath="//a[text()='Users']")
private WebElement btnUser;

@FindBy(xpath = "//*[@id='systemUser_userType']")
private WebElement Selectuser;
@FindBy(xpath = "//*[@id='systemUser_employeeName_empName']")
private WebElement Ename;
@FindBy(xpath = "//*[@id='systemUser_userName']")
private WebElement Username;
@FindBy(xpath = "//*[@id='systemUser_status']")
private WebElement Selectstatus;
@FindBy(xpath = "//*[@id='systemUser_password']")
private WebElement password;
@FindBy(xpath = "//*[@id='systemUser_confirmPassword']")
private WebElement confirmPassword;
@FindBy(xpath = "//input[@class='addbutton']")
private WebElement btnSave;

//Utilization
public void openpage() 
{
	driver.get("https://opensource-demo.orangehrmlive.com/");
}	

public void enterUsename(String un)
{
	unTB.sendKeys(un);
}

public void enterPassword(String pw)
{
	pwTB.sendKeys(pw);
}

public void clickLogin()
{
	btnLogin.click();
}
/*
public void ClickAdmin()
{
Actions act = new Actions(driver);
act.moveToElement(btnAdmin).perform();
act.moveToElement(btnUsrManagement).perform();
btnUser.click();
}
public void AddUser() throws InterruptedException 
	{
		Select se = new Select(Selectuser);
		se.selectByIndex(0);
		Ename.sendKeys("Ujwal");
	
		Username.sendKeys("Ujwal@420");
		Select se2 = new Select(Selectstatus);
		se2.selectByIndex(0);
		password.sendKeys("Qwerty@96");
		confirmPassword.sendKeys("Qwerty@69");
		Thread.sleep(3000);
		 btnSave.click();
		 */
		 
	}

 


























