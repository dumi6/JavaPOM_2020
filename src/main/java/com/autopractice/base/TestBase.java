package com.autopractice.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.autopractice.util.TestUtil;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	

	public TestBase(){
		
		

			try {
			 prop = new Properties();
				FileInputStream fis = new FileInputStream("C:\\JavaProject\\eclipse-workspace\\POM_Project\\src\\main\\java\\com\\autopractice\\config\\config.properties");
				
					prop.load(fis);
				} catch ( FileNotFoundException e) {
					e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
}
	
	public static void initilization() {
         		//String browserName = prop.getProperty("chrome");
         		
         			System.setProperty("webdriver.chrome.driver", "C:\\JavaProject\\eclipse-workspace\\POM_Project\\Drivers\\chromedriver.exe");
         			driver = new ChromeDriver();
         		
         		//}else if(browserName.equals("Firefox")) {
         			//System.setProperty("webdriver.gecko.driver", "C:\\JavaProject\\eclipse-workspace\\POM_Project\\Drivers\\geckodriver.exe");
         			//driver = new FirefoxDriver();
         		
         		
         			driver.manage().window().maximize();
         			driver.manage().deleteAllCookies();
         			driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
         			driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
         			driver.get(prop.getProperty("url"));
         		
	}
}
