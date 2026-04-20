package com.selenium.Selenium_Basics.Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();  //Using the chromedriver
		driver.get("https://www.google.co.in"); //Open the website
		driver.close();  //close the window
	}

}
