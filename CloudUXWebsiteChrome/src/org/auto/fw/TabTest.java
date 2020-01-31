package org.auto.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TabTest {
	
	private TabTest() {
		throw new IllegalStateException("Utility class");
	}
	
	static void test(WebDriver driver) {
		// Tab Elements
		WebElement searchTab 		=	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div[2]/div[1]"));
		WebElement associationsTab  =	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div[3]/div[1]"));
		WebElement ingestTab        =	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div[4]/div[1]"));
		WebElement researchTab      =	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div[5]/div[1]"));
		WebElement processTab       =	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div[6]/div[1]"));
		WebElement rundownTab       =	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div[7]/div[1]"));
		WebElement logTab           =	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div[8]/div[1]"));
		WebElement publishTab       =	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div[9]/div[1]"));
		WebElement mcdpStatusTab    =	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div[10]/div[1]"));

		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		searchTab.click();				
		associationsTab.click();		
		ingestTab.click();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[9]/div[1]/div/div/div/span")));
		researchTab.click();			
		processTab.click();				
		rundownTab.click();				
		logTab.click();			
		publishTab.click();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/form/fieldset")));
		mcdpStatusTab.click();		


	}

}
