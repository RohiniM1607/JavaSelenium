package com.selenium.Selenium_Basics.Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand_Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.smartcliff.in");
		driver.navigate().back();  //Go back to google
		driver.navigate().forward();  //Go back to smartcliff
		driver.navigate().refresh();
		driver.close();
	}

}
