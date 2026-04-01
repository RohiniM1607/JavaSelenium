package com.selenium.Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1_Flipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   //View in maximize
		driver.get("https://www.flipkart.com/");   //Open the page
		
		System.out.println("Page Title: "+driver.getTitle()+"\nTitle Length: "+driver.getTitle().length());
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.flipkart.com/"))
			System.out.println("Correct page opened");
		else
			System.out.println("Wrong file!!");
	
		System.out.println("Page Source: "+driver.getPageSource()+"\npageSourceLen: "+driver.getPageSource().length());
		driver.close();
	}

}
