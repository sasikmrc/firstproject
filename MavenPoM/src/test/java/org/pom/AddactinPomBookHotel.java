package org.pom;

import org.libgobal.LibGlobalCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddactinPomBookHotel extends LibGlobalCommon {
	public AddactinPomBookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement ccNum;
	
	@FindBy(id="cc_type")
	private WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement clickSubmit;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getClickSubmit() {
		return clickSubmit;
	}
		
	public void bookHotel(String firstName, String lastName, String address, String ccNum, String cctype, String expMonth, String expYear, String cvv) {
		text(getTxtFirstName(), firstName);
		text(getTxtLastName(), lastName);
		text(getTxtAddress(), address);
		text(getCcNum(), ccNum);
		dropDownVisibleText(getCcType(), cctype);
		dropDownVisibleText(getCcExpMonth(), expMonth);
		dropDownVisibleText(getCcExpYear(), expYear);
		text(getCvv(), cvv);
		click(getClickSubmit());
		
	}
	
	
}