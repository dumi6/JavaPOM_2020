package com.autopractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autopractice.base.TestBase;

public class SignInPage extends TestBase {
	
public SignInPage() {
		
		PageFactory.initElements(driver, this); //Initialises page object
		
	}
	
	//page factory - OR (Page libraries)
	@FindBy(className ="login")
	WebElement loginBtn;
	
	@FindBy(id = "email")
	WebElement emailField;
	
	@FindBy(name = "passwd")
	WebElement passwdField;
	
	@FindBy(xpath = "//p[@class='submit']//span[1]")
     WebElement submitBtn;
	
	@FindBy(xpath ="//span[contains(text(),'DS Auto')]")
	WebElement DS_Auto;
	
	
	
	//Actions
	public HomePage loginDetails( String un, String pwd ) {
		loginBtn.click();
		emailField.sendKeys(un);
		passwdField.sendKeys(pwd);
		submitBtn.click();
		
		return new HomePage();
	}
	
	public boolean validateUserLoggedPage() {
		return DS_Auto.isDisplayed();
	}
}
