package com.selenium.Selenium_Basics.Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand_Practice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.navigate().to("https://www.leafground.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://demoqa.com/");
		driver.navigate().refresh();
		driver.close();
	}

}
