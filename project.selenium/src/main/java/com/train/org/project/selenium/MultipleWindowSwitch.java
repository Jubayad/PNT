package com.train.org.project.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class MultipleWindowSwitch {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omega\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com)");
		Thread.sleep(6000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		//Thread.sleep(6000);
		
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebDriverWait oi = new WebDriverWait(driver, Duration.ofSeconds(8));
		oi.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Kindle Books")));
		WebElement Kindlesj = driver.findElement(By.linkText("Kindle Books"));
		Actions ob= new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		Kindlesj.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String> windosoi =  driver.getWindowHandles();
		Iterator<String> iterator = windosoi.iterator();
		String FirstWindowHandle = iterator.next();
		String SecondWindowHandle = iterator.next();
		driver.switchTo().window(SecondWindowHandle);
		System.out.println(FirstWindowHandle);
		System.out.println(SecondWindowHandle);
		Thread.sleep(6000);
		WebElement Stopover= driver.findElement(By.linkText("The Stopover"));
		Stopover.click();
	}
}
