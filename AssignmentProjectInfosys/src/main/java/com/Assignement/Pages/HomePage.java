package com.Assignement.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment.GenericLibrary.BaseTest;

public class HomePage {

	@FindBy(xpath = "//a[contains(text() , 'Sign in' )]")
	private WebElement signInEle;

	public HomePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getSignInBtn()
	{
		return this.signInEle;
	}
	
	public void clickSignInbutton()
	{
		this.signInEle.click();
	}
}
