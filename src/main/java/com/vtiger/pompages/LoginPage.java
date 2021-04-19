package com.vtiger.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath ="//input[@name='user_name']")
	WebElement usernameEdt1;
	
    @FindBy(name="user_name")                   //Rule -2 
    private WebElement usernameEdt;
    
    @FindBy(name="user_password")
    private WebElement passwordEdt;
    
    @FindBy(id="submitButton")
    private WebElement loginButon;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//getters methods

	public WebElement getUsernameEdt() {        //rule-3
		return usernameEdt1;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginButon() {
		return loginButon;
	}	
	
	public void loginToApp(String username,String password)
	{
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginButon.click();
	}

	public void loginToApp(String readDatafrompropfile) {
		// TODO Auto-generated method stub
		
	}

		// TODO Auto-generated method stub
		
	
	

}
