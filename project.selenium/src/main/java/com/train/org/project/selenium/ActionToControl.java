package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionToControl {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Omega\\\\eclipse-workspace\\\\project.selenium\\\\Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(6000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement Signed = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions act = new Actions(driver);
		Thread.sleep(6000);
		act.moveToElement(Signed).build().perform();
		WebElement PrimeStMembership = driver.findElement(By.xpath("//*[text()='Prime Membership']"));
		Thread.sleep(6000);
		act.moveToElement(Signed).build().perform();
		
		
		
		
	}
	
	
}
