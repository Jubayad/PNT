package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Utilities {
	public WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	  public void Ibrowsers(String NameOfBrowser) {
		String jk = System.getProperty("user.dir");
		System.out.println(jk);
			if (NameOfBrowser.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", jk+ "\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.get ("https://www.amazon.com");
				driver.manage().window().maximize();
			}
			else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", jk + "\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.get("https://www.amazon.com)");
				driver.manage().window().maximize();
			}
  }

  @AfterClass
	  public void afterClass() throws IOException{
			Screenshots();
		}
			public void Screenshots() throws IOException {
					Date ob = new Date();
					System.out.println(ob);
				String files = ob.toString().replace(" ", "_").replace(":","_");
				System.out.println(files);
				File HomeStPage =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(HomeStPage, new File("C:\\Users\\Omega\\eclipse-workspace\\project.selenium\\Pictures\\"+files+"Home.jpg"));
				
			}
}