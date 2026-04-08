package com.selenium.Selenium_Basics.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoAutomateThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   //View in maximize
		driver.get("https://omayo.blogspot.com");
		driver.findElement(By.cssSelector("div.dropdown > button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div#myDropdown > a:first-child")).click();
		driver.close();
		System.out.println("Facebook opened");
	}

}
