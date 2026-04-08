package com.selenium.Selenium_Basics.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableRowDataPrint {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohini@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rohini1607");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);
		List<WebElement> headings = driver.findElements(
                By.xpath("//table[@class='contactTable']/tr[2]//td"));

        for (WebElement heading : headings) {
            System.out.println(heading.getText());
        }
		driver.close();
	}

}
