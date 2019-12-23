package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {

	@Test
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\EGP\\Driver\\chromedriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://1dgrouptest.info/adminLogin ");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin@qualbe.com");
		driver.findElement(By.name("password")).sendKeys("AdminPassword");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.quit();
		
	}
	
}
