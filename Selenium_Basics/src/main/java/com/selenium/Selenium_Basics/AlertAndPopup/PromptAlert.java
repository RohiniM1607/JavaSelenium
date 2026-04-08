package com.selenium.Selenium_Basics.AlertAndPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement input = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']"));
		input.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		//alert.dismiss();
		alert.sendKeys("Hello");
		//Thread.sleep(1000);
		alert.accept();
	}

}
