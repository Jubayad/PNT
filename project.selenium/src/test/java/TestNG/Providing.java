package TestNG;

import org.testng.annotations.Test;

import Common.Utilities;
import Facebook.Pages.Home;

import org.testng.annotations.DataProvider;

public class Providing extends Utilities{
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  Home home = new Home(driver);
	  home.FieldToEmail(s);
	  home.PsswrdToField(s);
	  home.loginbtclick();
	  driver.navigate().back();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "tested", "pssword" },
      new Object[] { "tested22", "b8" },
    };
  }
}
