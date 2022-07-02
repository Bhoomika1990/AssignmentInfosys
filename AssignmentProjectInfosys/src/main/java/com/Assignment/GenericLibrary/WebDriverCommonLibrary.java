package com.Assignment.GenericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverCommonLibrary {

	public String getTitleOfThePage() {
		return BaseTest.driver.getTitle();
	}

	public void verifyPageTitle(String actualTitle, String expectedTitle, String pageName) {
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log(pageName + "Displayed : Pass", true);
	}

	public void verifyElementDisplayed(WebElement ele, String elementName) {
		if (ele.isDisplayed()) {
			Assert.assertTrue(true);
			Reporter.log(elementName + " Displayed- PASS", true);
		} else {
			Reporter.log(elementName + " Not Displayed- PASS", true);
			Assert.assertFalse(false);
		}
	}

	public void HandlingDropDown(WebElement ele, int indexValue) {
		Select selObj = new Select(ele);
		selObj.selectByIndex(indexValue);
	}

	public void HandlingDropDown(WebElement ele, String visibleString) {
		Select selObj = new Select(ele);
		selObj.selectByVisibleText(visibleString);
	}

	public void HandlingDropDown(String value, WebElement ele) {
		Select selObj = new Select(ele);
		selObj.selectByValue(value);
	}

	public void scrollTillWebElement(WebElement ele) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) BaseTest.driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true)", ele);

	}
	
	public void scrollByAxes(int axes) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) BaseTest.driver;
		jsExecutor.executeScript("window.scrollBy(0,"+ axes +")");

	}

	public void checkForIsSelected(WebElement ele, String str) {
		if (ele.isSelected()) {
			Reporter.log(str + "is already selected", true);
		} else {
			Reporter.log(str + "is selecting now", true);
			ele.click();
		}
	}

	public void MouseHover(WebElement actionEle) {

		Actions actObj = new Actions(BaseTest.driver);
		actObj.moveToElement(actionEle).perform();
	}

}
