package org.auto.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	
	private LoginTest() {
		throw new IllegalStateException("Utility class");
	}
	
	static void test(WebDriver driver, String usrnm, String pwd) {
		
		// Find elements for login page
		WebElement usernameBox = driver.findElement(By.xpath("//input[@id='name']"));
		WebElement passwordBox = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
			
		// Send values to input boxes		
		usernameBox.sendKeys(usrnm);
		passwordBox.sendKeys(pwd);
		loginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div/table/tbody/tr[5]/td[2]/div/div")));
}
	
	static void logout(WebDriver driver) {
		
		boolean loggedIn = (!driver.findElements(By.xpath("/html/body/div[4]/div[1]/div/div/div[4]/div/div")).isEmpty());
		if (loggedIn) {
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement profileIcon = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[4]/div/div"));
			profileIcon.click();
			WebElement signOutButton = driver.findElement(By.xpath("/html/body/div[18]/div/div/div/div[4]"));
			wait.until(ExpectedConditions.visibilityOf(signOutButton));
			signOutButton.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[5]/div/form/p[3]/input")));
			
		}
	}
}


