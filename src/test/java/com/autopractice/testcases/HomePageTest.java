package com.autopractice.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autopractice.base.TestBase;
import com.autopractice.pages.DressesPage;
import com.autopractice.pages.HomePage;
import com.autopractice.pages.SignInPage;
import com.autopractice.pages.WomenPage;

public class HomePageTest extends TestBase{
	SignInPage SP;
	HomePage HP;
	WomenPage WP;
	DressesPage DP;
	
	public HomePageTest() {
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
	   DP = new DressesPage();
   }
	//4 Tests
   @Test(priority =1)
   public void verifyHomePageTitleTest() {
	   String homePageTitle = HP.verifyHomePageTitle();
	   Assert.assertEquals(homePageTitle, "My account - My Store1", "HomePage title not matched!"); //To continue
   }
   @Test
   public void VerifyLogedUserTest() {
	   
	   Assert.assertTrue(SP.validateUserLoggedPage());
   }
   @Test
   public void verifyWomenPageTest() {
	   WP.clickOnWomenTab();
   }
   
   @Test
   public void verifyDressesPageTest() {
	   DP = HP.clickOnDressesTab();
   }
   
   
   @AfterMethod
	   public void tearDown() {
		   driver.quit();
	   }
		   
	   
   }

