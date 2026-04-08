package com.selenium.Selenium_Basics.MultipleWindowHandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Count of Window: "+allWindowHandles.size());
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> newAllWindowHandles = driver.getWindowHandles();
		System.out.println("New count of window: "+newAllWindowHandles.size());
		
		String ParentHandle = driver.getWindowHandle();
		System.out.println("Parent window: "+ParentHandle);
		
		Iterator<String> iterator = newAllWindowHandles.iterator();
		String mainWindow = iterator.next();
		String childWindow = iterator.next();
		System.out.println("Parent Window: "+mainWindow);
		System.out.println("Child Window: "+childWindow);
		
		driver.switchTo().window(childWindow);
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println("Child Title: "+text.getText());
		
		driver.close();
		
		driver.switchTo().window(ParentHandle);
		System.out.println("Parent Title: "+driver.getTitle());
		
		driver.quit();
	}

}
