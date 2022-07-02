package com.Assignement.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment.GenericLibrary.BaseTest;
import com.Assignment.GenericLibrary.WebDriverCommonLibrary;

public class CreateAccountPage {

	@FindBy(xpath = "//h1[text() = 'Authentication']")
	private WebElement authLblEle;

	@FindBy(id = "id_gender2")
	private WebElement mrsRadioBtnEle;

	@FindBy(id = "customer_firstname")
	private WebElement cusFirstNameEle;

	@FindBy(id = "customer_lastname")
	private WebElement cusLastNameEle;

	@FindBy(id = "passwd")
	private WebElement cusPasswordEle;

	@FindBy(id = "firstname")
	private WebElement firstNameEle;

	@FindBy(id = "lastname")
	private WebElement lastNameEle;

	@FindBy(id = "address1")
	private WebElement addressEle;

	@FindBy(id = "city")
	private WebElement cityEle;
	
	@FindBy(id="id_state")
	private WebElement stateEle;
	
	@FindBy(id="id_country")
	private WebElement countryEle;
	
	@FindBy(id="phone_mobile")
	private WebElement phoneNumber;
	
	@FindBy(id="alias")
	private WebElement aliasAddressEle;
	
	@FindBy(id="submitAccount")
	private WebElement registerBtn;
	
	@FindBy(id="postcode")
	private WebElement pincodeEle;

	public CreateAccountPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getAuthenticationLabel() {
		return this.authLblEle;
	}

	public WebElement getRadioBtn() {
		return this.mrsRadioBtnEle;
	}

	public WebElement getCutomerFirstName() {
		return this.cusFirstNameEle;
	}

	public WebElement getCustomerLastName() {
		return this.cusLastNameEle;
	}

	public WebElement getCusPassword() {
		return this.cusPasswordEle;
	}

	public WebElement getFirstName() {
		return this.firstNameEle;
	}

	public WebElement getLastName() {
		return this.lastNameEle;
	}

	public WebElement getAdrressEle() {
		return this.addressEle;
	}

	public WebElement getCity() {
		return this.cityEle;
	}
	
	public WebElement getState()
	{
		return this.stateEle;
	}
	
	public WebElement getCountry()
	{
		return this.countryEle;
	}
	
	public WebElement getNumber()
	{
		return this.phoneNumber;
	}
	
	public WebElement getAliasAdressEle()
	{
	 return this.aliasAddressEle;
	}
	
	public WebElement getPinCode()
	{
		return this.pincodeEle;
	}
	public void register(String cusFirstName , String cusLastName , String cusPassword, String firstName, String LastName
			, String Address , String City , String stateValue , String countryValue , String phonenumber, String aliasAddress)
	{
		this.mrsRadioBtnEle.click();
		this.cusFirstNameEle.sendKeys(cusFirstName);
		this.cusLastNameEle.sendKeys(cusLastName);
		this.cusPasswordEle.sendKeys(cusPassword);
		this.firstNameEle.sendKeys(firstName);
		this.lastNameEle.sendKeys(LastName);
		this.addressEle.sendKeys(Address);
		this.cityEle.sendKeys(City);
		
		WebDriverCommonLibrary webDriverLib = new WebDriverCommonLibrary();
		
		webDriverLib.HandlingDropDown(stateValue ,this.stateEle );
		this.pincodeEle.sendKeys("12345");
		webDriverLib.HandlingDropDown(countryValue, this.countryEle);
		
		this.phoneNumber.sendKeys(phonenumber);
		this.aliasAddressEle.clear();
		this.aliasAddressEle.sendKeys(aliasAddress);
		
		this.registerBtn.click();
	}

}
