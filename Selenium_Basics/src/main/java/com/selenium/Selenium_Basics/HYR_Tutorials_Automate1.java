package com.selenium.Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYR_Tutorials_Automate1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   //View in maximize
		driver.get("https://www.hyrtutorials.com/");   //Open the page
		driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//div[@class='container']/input[1]")).sendKeys("Rohini");
		driver.findElement(By.xpath("//div[@class='container']/input[2]")).sendKeys("M");
		driver.findElement(By.xpath("//div[@class='container']/input[3]")).sendKeys("rohinim@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("rohinim");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("rohinim");
		driver.findElement(By.xpath("//div[@class='buttons']/button[1]")).click();
		
		driver.close();
	}

}
