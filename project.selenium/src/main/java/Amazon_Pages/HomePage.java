package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
@FindBy(linkText = "Kindle Books") WebElement kb;
@FindBy(xpath = "//*[@aria-label ='Amazon']'")WebElement Ilogo;
@FindBy(id = "twotabsearchbox") WebElement searchfield;
@FindBy(id = "nav-search-submit-button") WebElement searching;



public void KindleBooksClick() {
	kb.click();

}

public void SearchFieldKeys() {
	searchfield.sendKeys("Computer");
}

public void SearchToClick() {
	searching.click();
}

public void LogoToClick() {
	kb.click();
}
public HomePage(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
}
