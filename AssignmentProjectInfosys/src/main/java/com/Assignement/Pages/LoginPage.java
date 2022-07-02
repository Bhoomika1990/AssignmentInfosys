package com.Assignement.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment.GenericLibrary.BaseTest;

public class LoginPage {

	@FindBy(id = "email_create")
	private WebElement emailTextEle;

	@FindBy(id = "SubmitCreate")
	private WebElement createAccountBtnEle;

	@FindBy(id = "email")
	private WebElement emailEle;

	@FindBy(id = "passwd")
	private WebElement passwordEle;

	@FindBy(id = "SubmitLogin")
	private WebElement loginSubmitBtn;

	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement emailText() {
		return this.emailTextEle;
	}

	public WebElement createAccountBtn() {
		return this.createAccountBtnEle;
	}

	public void createAccount(String emailID) {

		this.emailTextEle.sendKeys(emailID);
		this.createAccountBtnEle.submit();
	}

	public void loginWithValidCredential(String email, String password) {
		this.emailEle.sendKeys(email);
		this.passwordEle.sendKeys(password);
		this.loginSubmitBtn.click();
	}

}
