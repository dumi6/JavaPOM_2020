package com.autopractice.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autopractice.base.TestBase;
import com.autopractice.pages.SignInPage;

public class SignInPageTest extends TestBase{
	
	SignInPage signInPage;
	
	public SignInPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initilization();
		signInPage = new SignInPage ();
		
		
	}
	@Test
	public void loginPageTest() {
		signInPage.loginDetails(prop.getProperty("email"),  prop.getProperty("password"));  
		signInPage.validateUserLoggedPage();
		Assert.assertTrue(signInPage.validateUserLoggedPage());
		
	}
			
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
