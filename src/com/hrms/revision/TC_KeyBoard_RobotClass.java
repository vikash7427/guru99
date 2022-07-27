package com.hrms.revision;
/*
 * Open Application
 * Enter UserName
 * Enter Password
 * Perform TAB Activity from Keyword
 * Perform ENTER Activity from KeyBoard
 * Click On Logout option
 * Close Application
*/

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_KeyBoard_RobotClass {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(1500);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("TAB activity completed");
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("ENTER activity completed");
		System.out.println("Login Completed");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		driver.quit();
	}

}
