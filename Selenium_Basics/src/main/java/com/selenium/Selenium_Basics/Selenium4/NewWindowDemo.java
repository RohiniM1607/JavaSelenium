package com.selenium.Selenium_Basics.Selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

class NewWindowDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		//System.out.println();
		driver.switchTo().newWindow(WindowType.TAB);   //Opening the new tab
		//driver.switchTo().newWindow(WindowType.WINDOW);   //Opening the new window
		driver.navigate().to("https://www.rediff.com/");
		System.out.println("New page - Duck");
	}

}
