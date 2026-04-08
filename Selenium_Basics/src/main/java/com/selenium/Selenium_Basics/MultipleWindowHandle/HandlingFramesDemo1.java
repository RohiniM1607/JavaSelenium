package com.selenium.Selenium_Basics.MultipleWindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		WebElement iframeElement = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);
		String Frame1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by locator: "+Frame1);
		driver.switchTo().defaultContent();
		String mainPage = driver.findElement(By.xpath("//*[@id='framesWrapper']/h1")).getText();
		System.out.println("Back to Main page: "+ mainPage);
		
		driver.switchTo().frame(1);
		String Frame2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by Index: "+Frame2);
		driver.quit();
	}

}
