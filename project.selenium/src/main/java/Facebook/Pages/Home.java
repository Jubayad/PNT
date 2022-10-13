package Facebook.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
WebDriver driver;

@FindBy(name = "email")WebElement FieldEmail;
@FindBy(name = "pass")WebElement Psswrd;
@FindBy(name = "login")WebElement loginbt;
public Home(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

public void FieldToEmail(String name) {
	FieldEmail.sendKeys(name);
}

public void PsswrdToField(String pssword) {
	PsswrdToField(pssword);
}

public void loginbtclick() {
	loginbt.click();
}

}
