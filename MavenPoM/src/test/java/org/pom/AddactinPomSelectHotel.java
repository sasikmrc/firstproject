package org.pom;

import org.libgobal.LibGlobalCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddactinPomSelectHotel extends LibGlobalCommon {
	
	public AddactinPomSelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement clickHotel;
	
	@FindBy(id="continue")
	private WebElement clickContinue;
	
	public WebElement getClickHotel() {
		return clickHotel;
	}

	public WebElement getClickContinue() {
		return clickContinue;
	}


	public void selecthotel() {
		click(getClickHotel());
		click(getClickContinue());
		

	}
}
	
