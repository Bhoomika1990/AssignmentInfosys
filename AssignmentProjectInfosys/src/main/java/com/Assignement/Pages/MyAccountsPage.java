package com.Assignement.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment.GenericLibrary.BaseTest;

public class MyAccountsPage {
	
	@FindBy(xpath = "//a[@class = 'account']/span")
	private WebElement accNameEle;

	@FindBy(xpath = "//div/a[contains(text() , 'Sign out')]")
	private WebElement signOut;
	
	public MyAccountsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getAccHolderNameLabel() {
		return this.accNameEle;
	}
	
	public WebElement getsignOutBtn()
	{
		return this.signOut;
	}
	
	public void signOut()
	{
		
		this.signOut.click();
	}

}
