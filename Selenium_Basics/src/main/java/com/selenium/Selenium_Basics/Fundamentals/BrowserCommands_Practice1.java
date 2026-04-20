package com.selenium.Selenium_Basics.Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands_Practice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		driver.get(url);
		String title = driver.getTitle();
		int titleLen = driver.getTitle().length();
		System.out.println("Page Title: "+ title);
		System.out.println("Page Title Length: "+ titleLen);
		String pageURL = driver.getCurrentUrl();
		System.out.println("Page URL: "+pageURL);
		if(url.equals(pageURL))
			System.out.println("Correct Page Opened");
		else
			System.out.println("Wrong Page Opened");
		String pageSource = driver.getPageSource();
		int pageSourceLen = pageSource.length();
		System.out.println("Page Source Length: "+ pageSourceLen);
		driver.close();
		
	}

}
