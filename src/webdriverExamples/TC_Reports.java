package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_Reports {
	public static void main(String []args) throws Exception{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		//Mouseover on pim submenu
		//WebElement element=driver.findElement(By.linkText("Reports"));
		WebElement element=driver.findElement(By.linkText("PIM"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2500);
		driver.switchTo().frame("rightMenu");
		//driver.findElement(By.linkText("View Reports"));
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Vikas");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Bablu");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		Thread.sleep(1500);		
	}

}
