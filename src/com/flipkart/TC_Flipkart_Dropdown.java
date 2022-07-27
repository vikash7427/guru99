package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Flipkart_Dropdown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2500);
		//Select st=new Select(driver.findElement(By.xpath("//div[@class='_28p97w']"))).cl
	
	}
	

}
