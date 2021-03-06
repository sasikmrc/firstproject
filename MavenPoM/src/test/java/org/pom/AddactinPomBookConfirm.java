package org.pom;

import org.libgobal.LibGlobalCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddactinPomBookConfirm extends LibGlobalCommon {
	public AddactinPomBookConfirm() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	@FindBy(id="my_itinerary")
	private WebElement clickItinerary;

	
	public WebElement getOrderNo() {
		return orderNo;
	}



	public WebElement getClickItinerary() {
		return clickItinerary;
	}



		
public void bookconfirmation() {
	attributevalue(getOrderNo());
	
	click(getClickItinerary());

}
	
	
	
}
	
