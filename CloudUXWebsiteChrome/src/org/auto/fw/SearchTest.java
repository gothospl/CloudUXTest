package org.auto.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchTest {
	
	private SearchTest() {
		throw new IllegalStateException("Utility class");
	}
	
	public static void test(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		// Search options menu
		WebElement searchTab 				         = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div[2]/div[1]"));
		searchTab.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]")));
		WebElement searchPillSetting                 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div"));
		searchPillSetting.click();
		WebElement searchSettingAny                  = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[1]/div"));	
		WebElement searchSettingMetadata             = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div")); System.out.println("passed Meta");
		WebElement searchSettingName                 = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/div")); System.out.println("passed Name");
		WebElement searchSettingPhonetic             = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[4]/div")); System.out.println("passed Phonetic");
		WebElement searchSettingMarkersAndSegments   = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[5]/div")); System.out.println("passed MAS");
		WebElement searchSettingCreated              = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[6]/div")); System.out.println("passed Created");
		WebElement moreButton				         = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[7]/span")); System.out.println("passed moreButton");
		WebElement topSearchBar                      = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div[2]/div/div/div/div[1]/div/div/div"));
		
		searchPillSetting.click(); searchPillSetting.click();
		searchPillSetting.click(); searchSettingMetadata.click();
		searchPillSetting.click(); searchSettingName.click();
		searchPillSetting.click(); searchSettingPhonetic.click();
		searchPillSetting.click(); searchSettingMarkersAndSegments.click();
		searchPillSetting.click(); searchSettingCreated.click();
		searchPillSetting.click(); searchSettingAny.click();
		searchPillSetting.click(); moreButton.click();
		topSearchBar.click(); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div/div/div/div/div[3]")));
		WebElement searchPillXQuit                   = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div/div/div/div/div[3]"));
		searchPillXQuit.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div")));
		WebElement searchPillNew                     = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div"));
		searchPillNew.click();
	}

}
