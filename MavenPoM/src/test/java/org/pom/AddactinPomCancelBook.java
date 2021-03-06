package org.pom;

import java.util.List;

import org.libgobal.LibGlobalCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddactinPomCancelBook extends LibGlobalCommon {
	public AddactinPomCancelBook() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> clickCancel;

	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement clickCancel1;
	
	public List<WebElement> getClickCancel() {
		return clickCancel;
	}

	public WebElement getClickCancel1() {
		return clickCancel1;
	}
	public void cancelBook() {
		// List<WebElement> cancel = getClickCancel();
		// int l = cancel.size();
		// WebElement element = cancel.get(l - 1);
		// click(element);

		click(getClickCancel().get(getClickCancel().size() - 1));
		click(getClickCancel1());
		alertAccept();

	}

}
