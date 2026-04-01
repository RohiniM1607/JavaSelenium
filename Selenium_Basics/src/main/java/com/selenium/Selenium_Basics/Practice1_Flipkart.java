package com.selenium.Selenium_Basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1_Flipkart {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("FlipkartOutput.txt"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   //View in maximize
		driver.get("https://www.flipkart.com/");   //Open the page
		
		writer.write("Page Title: " + driver.getTitle());
		writer.newLine();

		writer.write("Title Length: " + driver.getTitle().length());
		writer.newLine();
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.flipkart.com/")) {
			System.out.println("Correct page opened");
			writer.write("Page URL: "+driver.getCurrentUrl());
			writer.newLine();
		}
		else
			System.out.println("Wrong page opened!!");
		writer.write("Page source:\n"+driver.getPageSource());
		
		driver.close();
	}

}
