package com.hrms.revision;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Launch Browser
 * Enter URL
 * Enter UserName
 * Enter Password
 * Click on Login Button
 * Click on Logout Option
 * Close Application
 */
public class TC_LoginLogout {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).clear();
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(2000);
		//driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout Completed");
		driver.close();
	}

}
