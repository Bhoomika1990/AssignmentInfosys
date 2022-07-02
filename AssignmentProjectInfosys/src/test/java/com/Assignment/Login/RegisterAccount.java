package com.Assignment.Login;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Assignement.Pages.CreateAccountPage;
import com.Assignement.Pages.MyAccountsPage;
import com.Assignment.GenericLibrary.BaseTest;
import com.Assignment.GenericLibrary.FileGenericLibrary;
import com.Assignment.GenericLibrary.WebDriverCommonLibrary;

@Listeners(com.Assignment.GenericLibrary.Listeners.class)
public class RegisterAccount extends BaseTest {

	@Test
	public void AccountRegistration() throws Throwable, Throwable {
		CreateAccount cAccObj = new CreateAccount();
		cAccObj.createAccount();

		CreateAccountPage cAccPage = new CreateAccountPage();
		cAccPage.register("b", "n", "bnbnbn", "b", "n", "bn", "Banglore" , "14" ,"21" ,"234567890" ,"abc");
		
		
		WebDriverCommonLibrary driverLib = new WebDriverCommonLibrary();
		String actualTitle = driverLib.getTitleOfThePage();

		// Reading data from properties file
		FileGenericLibrary fileObj = new FileGenericLibrary();
		String expectedTitle = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "AccountsTitle");

		// Verify the login
		driverLib.verifyPageTitle(actualTitle, expectedTitle, "Accounts Page ");
		
		MyAccountsPage myAcctPage = new MyAccountsPage();
		WebElement ele = myAcctPage.getAccHolderNameLabel();
		
		Assert.assertEquals(ele.getText(), "b n");
		Reporter.log("Verified Surename  " + "Displayed correctly: Pass", true);
		
		myAcctPage.signOut();
	}

}
