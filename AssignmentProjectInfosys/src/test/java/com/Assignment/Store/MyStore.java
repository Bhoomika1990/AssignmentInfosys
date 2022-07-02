package com.Assignment.Store;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Assignement.Pages.BlouseMyStorePage;
import com.Assignement.Pages.MyStorePage;
import com.Assignement.Pages.OrderMyStorePage;
import com.Assignment.GenericLibrary.BaseTest;
import com.Assignment.GenericLibrary.FileGenericLibrary;
import com.Assignment.GenericLibrary.WebDriverCommonLibrary;
import com.Assignment.Login.VerifySignIn;

@Listeners(com.Assignment.GenericLibrary.Listeners.class)
public class MyStore extends BaseTest {

	@Test
	public void addProductToTheCart() throws Throwable, Throwable {

		VerifySignIn signObj = new VerifySignIn();
		signObj.verifySignInOfValidUser();
		
		WebDriverCommonLibrary obj = new WebDriverCommonLibrary();

		//Thread.sleep(3000);
		MyStorePage storeObj = new MyStorePage();
		obj.MouseHover(storeObj.getWomenTab());
		
		storeObj.selectBlouseOption();
		
		//Verifying
		WebDriverCommonLibrary driverLib = new WebDriverCommonLibrary();
		String actualTitle = driverLib.getTitleOfThePage();

		// Reading data from properties file
		FileGenericLibrary fileObj = new FileGenericLibrary();
		String expectedTitle = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "BlouseStoreTitle");

		// Verify the login
		driverLib.verifyPageTitle(actualTitle, expectedTitle, "Blouse Store Page ");
		
		
		BlouseMyStorePage bPage = new BlouseMyStorePage();
		
		driverLib.scrollByAxes(700);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		WebElement scanEle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-id-product = '2']/span[text() ='Add to cart']")));
		
		
		Actions action =new Actions(driver);
		action.moveToElement(scanEle).click().build().perform();
		
		bPage.proceedtocheckOut();
		
		String actualTitleOrder = driverLib.getTitleOfThePage();
		String expectedTitleOrder = fileObj.readDataFromPropertyFile(PROPERTIES_FILE_PATH, "OrderStoretitle");

		// Verify the login
		driverLib.verifyPageTitle(actualTitleOrder, expectedTitleOrder, "Order Store Page ");
		
		OrderMyStorePage orderPage = new OrderMyStorePage();
		orderPage.proceedtocheckOut();
		
		orderPage.processAddBth();
		
		orderPage.selectTermsOfServices();
		
		orderPage.proccessCarrierBtnClick();
		

	}

}
