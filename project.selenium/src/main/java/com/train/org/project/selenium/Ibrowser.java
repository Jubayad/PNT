package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ibrowser {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omega\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get ("https://www.facebook.com");
		//Thread.sleep(6000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		//driver.navigate().back();
		//Thread.sleep(6000);
		//driver.navigate().forward();
		
		driver.getWindowHandle();
		String windows = driver.getWindowHandle();
		System.out.println(windows);
		String kl = driver.getCurrentUrl();
		System.out.println(kl);
		String titlesk = driver.getTitle();
		System.out.println(titlesk);
		
WebElement Userfield =		driver.findElement(By.id("email")); //find element known as email
Userfield.sendKeys("peopletech"); //inputs "peopletech" into email element

WebElement PasswordField =		driver.findElement(By.id("pass")); //find element known as password
PasswordField.sendKeys("it"); 

//WebElement LogButton = driver.findElement(By.name("login"));
//LogButton.click();

//WebElement ForgotLink = driver.findElement(By.partialLinkText("Forgot Password?"));	
					  //driver.findElement(By.linkText("Forgot password"));
//ForgotLink.click();

WebElement CreateAnAccount = driver.findElement(By.partialLinkText("Create new account"));
CreateAnAccount.click();
Thread.sleep(6000);

WebElement Month = driver.findElement(By.name("birthday_month"));
Select ob = new Select(Month);
ob.selectByIndex(5);

WebElement kj = driver.findElement(By.name("birthday_day"));
Select bo = new Select(kj);
bo.selectByValue("6");
WebElement Toggles3 = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]"));
Toggles3.click();
WebElement Toggles2 = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
Toggles2.click();
WebElement Toggles = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]"));
Toggles.click();
WebElement Signbt = driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']"));
Signbt.click();



WebElement bdy = driver.findElement(By.name("birthday_year"));
Select bdys = new Select(bdy);
bdys.selectByValue("2018");

WebElement fn = driver.findElement(By.name("firstname"));
fn.sendKeys("Jose");

WebElement ln = driver.findElement(By.name("lastname"));
ln.sendKeys("Lopez");

WebElement em = driver.findElement(By.name("reg_email__"));
em.sendKeys("peopleintech@gmail.com");

WebElement pass = driver.findElement(By.name("reg_passwd__"));
pass.sendKeys("lmao");

WebElement sex = driver.findElement(By.name("sex"));
Select sexs = new Select(sex);
sexs.selectByValue("2");

Thread.sleep(6000);
WebElement rem = driver.findElement(By.name("reg_email_confirmation__"));
rem.sendKeys("peopleintech@gmail.com");

//driver.close();
		
		
	}
}
