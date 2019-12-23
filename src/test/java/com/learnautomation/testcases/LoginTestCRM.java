package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.learnautomation.utility.BrowserFactory;

public class LoginTestCRM {
	
	WebDriver driver;
	
	@Test
	public void loginApp() {
		
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://1dgrouptest.info/adminLogin ");
		
		System.out.println(driver.getTitle());
	}
	

}
