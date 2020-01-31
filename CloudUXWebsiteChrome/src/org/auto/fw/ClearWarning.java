// This test dismisses the Chrome warning about lacking certificate. 

package org.auto.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClearWarning {
	
	private ClearWarning() {
		throw new IllegalStateException("Utility class");
	}
	
	public static void clear(WebDriver driver) throws InterruptedException {
		
	WebElement certAdvButton = driver.findElement(By.xpath("//button[@id='details-button']"));
	certAdvButton.click();
	WebElement certProceedLink = driver.findElement(By.id("proceed-link"));
	certProceedLink.click();
		
		Thread.sleep(1500);
		
	}
}
