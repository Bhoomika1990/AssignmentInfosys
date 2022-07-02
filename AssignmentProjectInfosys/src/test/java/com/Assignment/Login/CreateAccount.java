package com.Assignment.Login;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Assignement.Pages.CreateAccountPage;
import com.Assignement.Pages.LoginPage;
import com.Assignment.GenericLibrary.BaseTest;
import com.Assignment.GenericLibrary.WebDriverCommonLibrary;

@Listeners(com.Assignment.GenericLibrary.Listeners.class)
public class CreateAccount extends BaseTest {

	@Test
	public void createAccount() throws Throwable, IOException {
		
		VerifyLogin vlObj = new VerifyLogin();
		vlObj.loginPageVerification();
		
		LoginPage lpObj = new LoginPage();
		lpObj.createAccount("bn13@gmail.com");
		
		CreateAccountPage caPageObj = new CreateAccountPage();
		WebElement authLabel = caPageObj.getAuthenticationLabel();
		
		WebDriverCommonLibrary driverLib = new WebDriverCommonLibrary();
		driverLib.verifyElementDisplayed(authLabel, "Authentication Label");
		
		

	}

}
