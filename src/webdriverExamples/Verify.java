package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify {
	    public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title is not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title Is Matched");
		}
		else {
			System.out.println(driver.getTitle());
			System.out.println("Title Is Not Matched");
		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
