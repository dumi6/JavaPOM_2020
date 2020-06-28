package com.autopractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autopractice.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement dressesTab;
	
	@FindBy (className = "heading-counter")
	WebElement totalWomenProducts;
	
	@FindBy(linkText = "T-shirts")
	WebElement t_shirtsTab;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
    public DressesPage clickOnDressesTab() {
    	dressesTab.click();
    	totalWomenProducts.click();
    	
    	return new DressesPage();
    }
    
    public T_shirtsPage clickOnT_shirtsTab() {
    	t_shirtsTab.click();
    	
    	return new T_shirtsPage();
    }
}
