package TestNG;


import java.io.IOException;
import java.util.Date;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Amazon_Pages.HomePage;
import Amazon_Pages.StopOver;
import Common.Utilities;
import dev.failsafe.internal.util.Assert;

public class Book extends Utilities{
	
	@Test(priority = 1)
	public void f() {
		HomePage home= new HomePage(driver);
		home.KindleBooksClick();
		String ur = driver.getCurrentUrl();
		System.out.println(ur);
		System.out.println("This is before the assert");
		SoftAssert sk = new SoftAssert();
		sk.assertEquals(ur, "https://www.amazon.com/kindle-dbs/storefront?storeType=browse&node=154606011");
		
		System.out.println("This is after assert");
		Amazon_Pages.Books books = new Amazon_Pages.Books(driver);
		//books.stopover();
		//StopOver stopover = new StopOver(driver);
		//stopover.ReadListenClick();
		sk.assertAll();
		int linked = driver.findElement(By.tagName("a")).size();
		System.out.println("Total number of links =" + linked);
		int homelinked = driver.findElement(By.linkText("Amazon Home88"))size();
		System.out.println("Amazon home count= " + homelinked);
		if (homelinked ==1 ) {
			driver.findElement(By.linkText("Amazon Home")).size();
		}
		else{
			System.out.println("Element is not displaying");
		}
			sk.assertAll();
	}
	@Test(priority = 2, dependsOnMethods = "f")
	public void SearchFieldVerification() {
		HomePage home= new HomePage(driver);
		home.LogoToClick();
		home.SearchFieldKeys();
		home.SearchToClick();
	}
}
