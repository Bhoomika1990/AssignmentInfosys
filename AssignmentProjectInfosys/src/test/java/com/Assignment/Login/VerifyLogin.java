package com.Assignment.Login;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Assignement.Pages.HomePage;
import com.Assignment.GenericLibrary.BaseTest;
import com.Assignment.GenericLibrary.FileGenericLibrary;
import com.Assignment.GenericLibrary.WebDriverCommonLibrary;

@Listeners(com.Assignment.GenericLibrary.Listeners.class)
public class VerifyLogin extends BaseTest {

	@Test
	public void loginPageVerification() throws FileNotFoundException, IOException {

		// Click Signin on the Home page
		HomePage hpObj = new HomePage();
		hpObj.clickSignInbutton();

		WebDriverCommonLibrary driverLib = new WebDriverCommonLibrary();
		String actualTitle = driverLib.getTitleOfThePage();

		// Reading data from properties file
		FileGenericLibrary fileObj = new FileGenericLibrary();
		String expectedTitle = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "loginTitle");

		// Verify the login
		driverLib.verifyPageTitle(actualTitle, expectedTitle, "Login Page ");

	}
}
