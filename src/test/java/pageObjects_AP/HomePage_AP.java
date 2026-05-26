package pageObjects_AP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_AP extends BasePage_AP {

	public HomePage_AP(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath = "//a[text()=' Home']")
	WebElement isHomePageVisible;
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
	WebElement login_Signup_Link;

	// By click_testcases_Link= By.xpath("");
	public void click_login_Signup() {
		login_Signup_Link.click();
	}
	
	public boolean verifyingHomePageVisible() {
		return isHomePageVisible.isDisplayed();
		
	}
}
