package com.selenium.Selenium_Basics.MultipleWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround_MultipleWindowsHandle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.cssSelector("button[id='j_idt88:new']")).click();
		Set<String> allElement = driver.getWindowHandles();
		System.out.println(allElement.size());
		System.out.println(driver.getWindowHandle());
		
	}
}
