package com.selenium.Selenium_Basics.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableRowColumnCount {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println(rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/thead//th"));
		System.out.println(cols.size());
		
		driver.close();
	}

}
