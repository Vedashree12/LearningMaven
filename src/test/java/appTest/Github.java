package appTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Github {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.selenium.dev/");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.selenium.dev/");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\LTI\\DevOps1\\src\\test\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
