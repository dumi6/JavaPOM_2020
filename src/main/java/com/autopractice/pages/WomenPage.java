package com.autopractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autopractice.base.TestBase;

public class WomenPage extends TestBase{
	
	
	@FindBy(linkText = "Women")
	WebElement womenTab;
	
	@FindBy(className = "heading-counter")
	WebElement womenProducts;
	
	public WomenPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WomenPage clickOnWomenTab() {
		womenTab.click();
		womenProducts.click();
		
		return new WomenPage();

}
}