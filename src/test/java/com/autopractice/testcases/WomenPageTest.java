package com.autopractice.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autopractice.base.TestBase;
import com.autopractice.pages.HomePage;
import com.autopractice.pages.SignInPage;
import com.autopractice.pages.WomenPage;

public class WomenPageTest extends TestBase{

	
	WomenPage WP;
	SignInPage SP;
	HomePage HP;

public WomenPageTest() {
super();	
}

//test cases should be separated and independent. 
//close the test after every test
@BeforeMethod
public void setUp() {
   
   initilization();
   SP = new SignInPage();
   HP = SP.loginDetails(prop.getProperty("email"), prop.getProperty("password"));
   WP = new WomenPage();
}
@Test
public void verifyWomenPageTest() {
	WP.clickOnWomenTab();
	
	//Assert.assertEquals(WomenPage, "Women - My Store");
	
	 
}

@AfterMethod
public void tearDown() {
	driver.quit();
}
}