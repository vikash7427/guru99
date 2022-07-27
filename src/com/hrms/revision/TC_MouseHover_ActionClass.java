package com.hrms.revision;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * moving the cursor to the respective element
 * TestSteps:-
 * Open Application
 * Login into Application
 * Perform Mouse over to PIM Element
 * Click on Add Employee sub menu
 * Click on Logout Option
 * Close Application
 */

public class TC_MouseHover_ActionClass {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Thread.sleep(1000);
		//Mouse hover 
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Click on sum menu");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		driver.quit();
		
		
		
		
	}

}
