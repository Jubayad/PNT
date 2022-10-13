package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Wording {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omega\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com)");
		Thread.sleep(6000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
	String titles = driver.findElement(By.xpath("//*[contains(text(),'Connnect with friends')]")).getText();
	System.out.println(titles);
	
	}
}
