package testCases_AP;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects_AP.HomePage_AP;
import pageObjects_AP.SignupPage_AP;
import testCaseBase_AP.TestcaseBase_AP;

public class TC_002_VerifingNewUserSignup extends TestcaseBase_AP {
	
	@Test
	public void verifingNewUserSignUpPage() {
		HomePage_AP hp = new HomePage_AP(driver);
		hp.click_login_Signup();
		
		SignupPage_AP sp = new SignupPage_AP(driver);
		boolean status = sp.isNewUserSignupVisible();
		Assert.assertTrue(status);
		logger.info("Test Passed ...");
		
	}

}
