package com.Assignement.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment.GenericLibrary.BaseTest;
import com.Assignment.GenericLibrary.WebDriverCommonLibrary;

public class OrderMyStorePage {

	@FindBy(xpath = "//p[@class = 'cart_navigation clearfix']/a/span[text() = 'Proceed to checkout']")
	private WebElement proceedToCheckOutBtn;

	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement processAddressBtn;
	
	@FindBy(id="cgv")
	private WebElement termsOfService;
	
	@FindBy(name="processCarrier")
	private WebElement processCarrierBtn;
	
	public OrderMyStorePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void proceedtocheckOut() {
		this.proceedToCheckOutBtn.click();
	}

	public void processAddBth()
	{
		this.processAddressBtn.click();
	}

	public void selectTermsOfServices()
	{
		WebDriverCommonLibrary obj = new WebDriverCommonLibrary();
		obj.checkForIsSelected(this.termsOfService, "Terms of services");
		
	}
	
	public void proccessCarrierBtnClick()
	{
		this.processCarrierBtn.click();
	}
}
