package com.selenium.Selenium_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomAttributeCheck {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   //View in maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.findElement(By.cssSelector("input#adder")).click();
		WebElement web = driver.findElement(By.cssSelector("div[id=box0]"));
		System.out.println(web.getDomProperty("outerHTML"));
		System.out.println("Id: "+web.getDomAttribute("id"));
		System.out.println("Class: "+web.getDomAttribute("class"));
		System.out.println("Style: "+web.getDomAttribute("style"));
		driver.close();
	}

}
