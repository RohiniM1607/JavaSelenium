package com.selenium.Selenium_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductStoreTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("a#login2")).click();
        driver.findElement(By.cssSelector("input#loginusername")).sendKeys("RohiniM");
        driver.findElement(By.cssSelector("input#loginpassword")).sendKeys("Rohini_16");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String expected = "Welcome RohiniM";
        String actual = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#nameofuser"))
        		).getText();
        System.out.println(driver.findElement(By.cssSelector("a#nameofuser")).getText());
        if(actual.matches(expected))
        	System.out.println("Login Successful");
        else
        	System.out.println("Login failed");
        driver.close();
	}

}
