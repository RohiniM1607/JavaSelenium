package com.selenium.Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLoginAutomate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   //View in maximize
		driver.get("https://www.linkedin.com");
		driver.navigate().to("https://www.linkedin.com/login");
		driver.findElement(By.cssSelector("input#username")).sendKeys("mrohini7558@gmail.com");
		driver.findElement(By.cssSelector("div.form__input--floating.margin-top-24 input#password")).sendKeys("Rohini_1607");
		driver.findElement(By.cssSelector("div.login__form_action_container > button")).click();
		if (driver.findElement(By.cssSelector("nav.d4199148:first-child")).isDisplayed()) {
	        System.out.println("Login Successful");
	    }
		else
			System.out.println("Login failed");
		driver.close();
	}

}
