package com.selenium.Selenium_Basics.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
        WebElement DragtoElement=driver.findElement(By.xpath("//p[normalize-space()='Drag to target']"));
        Actions action=new Actions(driver);
        WebElement DroptargetElement=driver.findElement(By.xpath(" //p[@class='ui-widget-header']"));
        Thread.sleep(2000);
        action.dragAndDrop(DragtoElement, DroptargetElement).perform();
        System.out.println(driver.findElement(By.xpath("//p[@class='ui-widget-header']")).getText());
	}

}
