package com.train.org.project.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class EdgeBrowserSetup {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
	Ibrowsers("Chrome");
	String titles = driver.findElement(By.xpath("//*[contains(text(), 'Connect with friends')]")).getText();
	System.out.println(titles);
	Screenshots();
	Thread.sleep(6000);
	Screenshots();
	}
	
	public static void Ibrowsers(String NameOfBrowser) {
		if (NameOfBrowser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omega\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get ("https://www.facebook.com");
			driver.manage().window().maximize();
		}
		else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Omega\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com)");
			driver.manage().window().maximize();
		}
	}
		public static void Screenshots() throws IOException {
				Date ob = new Date();
				System.out.println(ob);
			String files = ob.toString().replace(" ", "_").replace(":","_");
			System.out.println(files);
			File HomeStPage =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(HomeStPage, new File("C:\\Users\\Omega\\eclipse-workspace\\project.selenium\\Pictures\\"+files+"Home.jpg"));
			
		}
	}

