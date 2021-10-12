package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
	PageFactory.initElements(driver,this);
	
	}
	@FindBy(id="radiobutton_0")
	private WebElement select;
	
	@FindBy(name="continue")
	private WebElement continueBtn;
	
	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getNameText() {
		return nameText;
	}

	public WebElement getLastText() {
		return lastText;
	}

	public WebElement getAddressText() {
		return addressText;
	}

	public WebElement getCardNoText() {
		return cardNoText;
	}

	public WebElement getCardTypeText() {
		return cardTypeText;
	}

	public WebElement getSelectMth() {
		return selectMth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBtn() {
		return btn;
	}
	@FindBy(id="first_name")
	private WebElement nameText;
	
	@FindBy(name="last_name")
	private WebElement lastText;
	
	@FindBy(name="address")
	private WebElement addressText;
	
	@FindBy(name="cc_num")
	private WebElement cardNoText;
	
	@FindBy(id="cc_type")
	private WebElement cardTypeText;
	
	@FindBy(name="cc_exp_month")
	private WebElement selectMth;
	
	@FindBy(id="cc_exp_year")
	private WebElement selectYear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvvNo;
	
	@FindBy(name="book_now")
	private WebElement btn;

	
	}
	
	


