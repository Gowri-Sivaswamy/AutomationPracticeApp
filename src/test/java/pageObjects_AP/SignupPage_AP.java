package pageObjects_AP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage_AP extends BasePage_AP {

	public SignupPage_AP(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
	WebElement newUserSignup_txt;

	public boolean isNewUserSignupVisible() {
		return newUserSignup_txt.isDisplayed();
	}

}
