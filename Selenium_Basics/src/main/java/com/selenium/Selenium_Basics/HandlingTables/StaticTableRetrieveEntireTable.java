package com.selenium.Selenium_Basics.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.data.Data;

public class StaticTableRetrieveEntireTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println(rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/thead//th"));
		System.out.println(cols.size());
		
		for(int r=1; r<=rows.size(); r++) {
			for(int c=1; c<=cols.size(); c++) {
				WebElement data;
				if(r==1) {
					data = driver.findElement(By.xpath("//table[@id='table1]//tr["+r+"]//th["+c+"]"));
				}
				else
					data=(WebElement) driver.findElements(By.xpath("//table[@id='table1']//tr[" +r +"]//td["+c+"]"));
			}
		}
	}

}
