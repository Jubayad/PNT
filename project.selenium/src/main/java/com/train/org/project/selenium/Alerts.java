package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omega\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(6000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("ls");
		driver.switchTo().alert().dismiss();
		
		

	}
}
