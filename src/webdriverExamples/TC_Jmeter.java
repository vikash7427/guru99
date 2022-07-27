package webdriverExamples;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Jmeter {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    driver = new ChromeDriver();
	    baseUrl = "https://www.blazedemo.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testBatch20() throws Exception {
	    // Label: Test
	    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1536,753 | ]]
	    driver.get("http://183.82.103.245/nareshit/login.php");
	    driver.findElement(By.name("txtUserName")).click();
	    driver.findElement(By.name("txtUserName")).clear();
	    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	    driver.findElement(By.name("txtPassword")).click();
	    driver.findElement(By.name("txtPassword")).clear();
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    driver.findElement(By.name("Submit")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | id=rightMenu | ]]
	    driver.findElement(By.cssSelector("div.actionbuttons > input.plainbtn")).click();
	    driver.findElement(By.name("txtEmpFirstName")).click();
	    driver.findElement(By.name("txtEmpFirstName")).clear();
	    driver.findElement(By.name("txtEmpFirstName")).sendKeys("ram");
	    driver.findElement(By.id("txtEmpLastName")).click();
	    driver.findElement(By.id("txtEmpLastName")).clear();
	    driver.findElement(By.id("txtEmpLastName")).sendKeys("rajya");
	    driver.findElement(By.id("btnEdit")).click();
	    driver.findElement(By.cssSelector("#personalLink > span")).click();
	    driver.findElement(By.cssSelector("#contactsLink > span")).click();
	    driver.findElement(By.cssSelector("#emgcontactsLink > span")).click();
	    driver.findElement(By.cssSelector("#dependentsLink > span")).click();
	    driver.findElement(By.cssSelector("#immigrationLink > span")).click();
	    driver.findElement(By.cssSelector("#photoLink > span")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
	    driver.findElement(By.linkText("Logout")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
