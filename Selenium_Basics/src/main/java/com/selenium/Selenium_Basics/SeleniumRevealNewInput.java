package com.selenium.Selenium_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumRevealNewInput {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   //View in maximize
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement revealedInput = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#revealed"))
		);
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.findElement(By.cssSelector("input#reveal")).click();
		driver.findElement(By.cssSelector("input#revealed")).sendKeys("Hello");
		WebElement web = driver.findElement(By.cssSelector("input#revealed"));
		System.out.println(web.getAccessibleName());
	}

}
