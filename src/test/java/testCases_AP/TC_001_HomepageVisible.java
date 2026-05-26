package testCases_AP;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects_AP.HomePage_AP;
import pageObjects_AP.SignupPage_AP;
import testCaseBase_AP.TestcaseBase_AP;

public class TC_001_HomepageVisible extends TestcaseBase_AP {

	@Test
	public void homepageVisible() {

		logger.info("***** Starting TC_001_AccountRegistrationt****** ");
		logger.debug("This is a debug log message");

		HomePage_AP hp = new HomePage_AP(driver);

		
		boolean isHomePageVisible = hp.verifyingHomePageVisible();
		Assert.assertTrue(isHomePageVisible);
		logger.info("Test Passed ...");
		
		
		//logger.info("Clicked on login signup.....");
		// hp.click_login_Signup();
		// SignupPage_AP sp = new SignupPage_AP(driver);
		// boolean isNewUserSignupVisible = sp.isNewUserSignupVisible();

		// Assert.assertTrue(isHomePageVisible);

	}

}
