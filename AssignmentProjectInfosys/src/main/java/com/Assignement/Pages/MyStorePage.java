package com.Assignement.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment.GenericLibrary.BaseTest;

public class MyStorePage {

	@FindBy(xpath = "//a[text() = 'Women']")
	private WebElement womenTab;

	
	@FindBy(xpath = "//a[text() = 'Blouses']")
	private WebElement blousesEle;
	
	public MyStorePage() {

		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getWomenTab()
	{
		return this.womenTab;
	}
	
	public void selectBlouseOption()
	{
		this.blousesEle.click();
	}
}
