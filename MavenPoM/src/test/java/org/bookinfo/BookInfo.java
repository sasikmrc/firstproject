package org.bookinfo;

import org.libgobal.LibGlobalCommon;
import org.pom.AddactinPomBookConfirm;
import org.pom.AddactinPomBookHotel;
import org.pom.AddactinPomCancelBook;
import org.pom.AddactinPomHotelSearch;
import org.pom.AddactinPomLogin;
import org.pom.AddactinPomSelectHotel;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BookInfo extends LibGlobalCommon{
@Parameters({"userName", "password"})
@Test

private void test1(String userName, String password) {
	getDriver();
	loadUrl("https://adactinhotelapp.com/");
	maximize();
	
	AddactinPomLogin hotel = new AddactinPomLogin ();
	hotel.login(userName, password);
	}

// Search Hotel

@Parameters({"location", "hotel", "type", "roomNo"})
@Test
private void test2(String location, String hotel, String type, String roomNo) {
	AddactinPomHotelSearch hotelSearch = new AddactinPomHotelSearch();
	hotelSearch.searchHotel(location, hotel, type, roomNo);
}
//Select Hotel

@Parameters
@Test
private void test3() {
	AddactinPomSelectHotel selectHotel = new AddactinPomSelectHotel ();
	selectHotel.selecthotel();

}

//Book Hotel
@Parameters({"firstName", "lastName", "address", "ccNum", "cctype", "expMonth", "expYear", "cvv"})
@Test
private void test4(String firstName, String lastName, String address, String ccNum, String cctype, String expMonth, String expYear, String cvv) {
	AddactinPomBookHotel bookHotel = new AddactinPomBookHotel();
	bookHotel.bookHotel(firstName, lastName, address, ccNum, cctype, expMonth, expYear, cvv);

}

		// Confirm Page

@Parameters
@Test
private void test5() {
AddactinPomBookConfirm bookConfirm = new AddactinPomBookConfirm();
bookConfirm.bookconfirmation();
}

//Cancel Booking
@Parameters
@Test
private void test6() {
	AddactinPomCancelBook cancelBook = new AddactinPomCancelBook();
	cancelBook.cancelBook();

}

		
	}
	

	


