package com.selenium.Selenium_Basics.Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoExplicitWait2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait and click timer button
        WebElement timerButton = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("HTML36")));

        timerButton.click();

        System.out.println("element located");

        driver.quit();
	}

}
