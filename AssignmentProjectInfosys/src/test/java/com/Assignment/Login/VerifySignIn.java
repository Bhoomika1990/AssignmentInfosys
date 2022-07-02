package com.Assignment.Login;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Assignement.Pages.LoginPage;
import com.Assignment.GenericLibrary.BaseTest;
import com.Assignment.GenericLibrary.FileGenericLibrary;
import com.Assignment.GenericLibrary.WebDriverCommonLibrary;

@Listeners(com.Assignment.GenericLibrary.Listeners.class)
public class VerifySignIn extends BaseTest {

	@Test
	public void verifySignInOfValidUser() throws Throwable, IOException {
		
		VerifyLogin obj = new VerifyLogin();
		obj.loginPageVerification();

		LoginPage lpObj = new LoginPage();

		// Reading valid login credentials from property file
		FileGenericLibrary fileObj = new FileGenericLibrary();
		String userName = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "username");
		String password = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "password");
		lpObj.loginWithValidCredential(userName, password);
		
		Thread.sleep(3000);
		
		//Verify
		
		WebDriverCommonLibrary driverLib = new WebDriverCommonLibrary();
		String actualTitle = driverLib.getTitleOfThePage();

		// Reading data from properties file
		String expectedTitle = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "AccountsTitle");

		// Verify the login
		driverLib.verifyPageTitle(actualTitle, expectedTitle, "Accounts Page ");
		
	}
}
