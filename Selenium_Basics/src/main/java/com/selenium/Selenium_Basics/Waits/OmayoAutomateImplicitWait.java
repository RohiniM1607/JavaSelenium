package com.selenium.Selenium_Basics.Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoAutomateImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   //View in maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com");
		driver.findElement(By.cssSelector("div.dropdown > button")).click();
		
		driver.findElement(By.cssSelector("div#myDropdown > a:first-child")).click();
		driver.close();
		System.out.println("Facebook opened");
	}

}
