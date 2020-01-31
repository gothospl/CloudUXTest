package org.auto.fw;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LoginTestNG {
	
	public static final WebDriver driver = new ChromeDriver();
	public static final SoftAssert sa = new SoftAssert();

  @Parameters({ "address"})
  @BeforeSuite
  public void beforeSuite(String address) throws InterruptedException {
	  
	  	driver.get(address);
		ClearWarning.clear(driver);			
	  }
  
  @Parameters({ "username", "password", "expmsg" })
  @Test
  public void loginTest(String username, String password, String expmsg) {
		LoginTest.test(driver, username, password);
		String bodyText = driver.findElement(By.tagName("body")).getText();
		sa.assertFalse(bodyText.contains(expmsg), "Login failed!");
		sa.assertAll();
  }
  /*
  @Test
  public void tabTest() {
	  TabTest.test(driver);
  }
  */
  

  
  @Test
  public void searchTest() {
	  SearchTest.test(driver);
  }
  
  @AfterSuite
  public void afterSuite() {
	    LoginTest.logout(driver);
		driver.quit();
  }
  
}
