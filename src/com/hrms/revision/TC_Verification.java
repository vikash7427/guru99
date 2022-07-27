package com.hrms.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Launch Browser
 * Enter URL
 * Verify Page Title
 * Enter UserName
 * Enter Password
 * Click on Login Button
 * Verify Page Title
 * Click on Logout Button
 * Close Application
 */

public class TC_Verification {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title 1 matched");
		}
		else{
			System.out.println("Title 1 not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		driver.close();
	}

}
