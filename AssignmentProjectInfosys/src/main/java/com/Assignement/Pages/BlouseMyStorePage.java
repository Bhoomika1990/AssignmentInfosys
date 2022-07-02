package com.Assignement.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment.GenericLibrary.BaseTest;

public class BlouseMyStorePage {

	@FindBy(xpath = "//a[@data-id-product = '2']/span[text() ='Add to cart']")
	private WebElement addCartItem;

	@FindBy(xpath = "//span[contains(text() , 'Proceed to checkout')]")
	private WebElement proceedToCheckOutBtn;
	
	@FindBy(xpath ="//span[@class = 'cat-name']")
	private WebElement blowsesLbl;
	
	public BlouseMyStorePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getBlowseslbl()
	{
		return this.blowsesLbl;
	}
	public WebElement addToCartBtn() {
		return this.addCartItem;

	}
	
	public void addTocart()
	{
		this.addCartItem.click();
	}
	
	public void proceedtocheckOut()
	{
		this.proceedToCheckOutBtn.click();
	}

}
