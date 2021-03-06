package org.pom;

import org.libgobal.LibGlobalCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddactinPomHotelSearch extends LibGlobalCommon {
	
	public AddactinPomHotelSearch() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="location")
	private WebElement selectLocation;
	
	@FindBy(id="hotels")
	private WebElement selectHotel;
	
	@FindBy(id="room_type")
	private WebElement selectRoomType;
	
	@FindBy(id="room_nos")
	private WebElement selctRoomNo;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getSelctLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public WebElement getSelectRoomNo() {
		return selctRoomNo;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
public void searchHotel(String location, String hotel, String type, String roomNo ) {
	dropDownVisibleText(getSelctLocation(), location);
	dropDownVisibleText(getSelectHotel(), hotel);
	dropDownVisibleText(getSelectRoomType(), type);
	dropDownVisibleText(getSelectRoomNo(), roomNo);
	click(getBtnSubmit());

}

	}

