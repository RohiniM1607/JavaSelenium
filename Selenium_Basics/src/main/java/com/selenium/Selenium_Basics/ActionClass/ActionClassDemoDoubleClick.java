package com.selenium.Selenium_Basics.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemoDoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement doubleClickOption = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClickOption).perform();
	}

}
