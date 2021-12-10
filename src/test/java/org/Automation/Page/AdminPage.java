package org.Automation.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminPage extends BasePage{
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement btnadmin;
	
	@FindBy(id="menu_admin_UserManagement")
	private WebElement btnum;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	private WebElement btnuser;
	
	@FindBy(id="btnAdd")
	private WebElement btnadd;
	
	@FindBy(xpath = "//*[@id='systemUser_userType']")
	private WebElement userRoleSelect;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement ename;
	
	@FindBy(id="systemUser_userName")
	private WebElement uname;
	
	@FindBy(xpath = "//*[@id='systemUser_status']")
	private WebElement statusSelect;
	
	@FindBy(id="systemUser_password")
	private WebElement pwd;
	
	@FindBy(id="systemUser_confirmPassword")
	private WebElement cpwd;
	
	@FindBy(id="btnSave")
	private WebElement save;
	
	public void Action()
	{
	Actions act = new Actions(driver);
	act.moveToElement(btnadmin).perform();
	act.moveToElement(btnum).perform();
	btnuser.click();
	btnadd.click();
	}
	
	public void SelectRole()
	{
		Select slt = new Select(userRoleSelect);
		slt.selectByIndex(0);
	}
	
	public void enterEname(String en)
	{
		ename.sendKeys(en);
	}
	
	public void enterUname(String un)
	{
		uname.sendKeys(un);
	}
	
	public void SelectStatus()
	{
		Select slt1 = new Select(statusSelect);
		slt1.selectByIndex(0);
	}
	
	public void enterPwd(String pn)
	{
		pwd.sendKeys(pn);
	}
	
	public void enterCPwd(String cpn)
	{
		cpwd.sendKeys(cpn);
	}
	public void clickSave()
	{
		save.click();
	}



}
