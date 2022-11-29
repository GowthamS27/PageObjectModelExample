package org.radiobuttons;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton_Page extends BaseClass{
	public RadioButton_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[contains(text(),'Chrome')]/../div")
	private WebElement favorite;
	@FindBy(xpath="//*[contains(text(),'Chennai')]/../div")
	private WebElement unSelectable;
	@FindBy(xpath="(//*[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]|//label[@for='j_idt87:console2:2']")
	private WebElement checkSelected;
	public WebElement getFavorite() {
		return favorite;
	}
	public void setFavorite(WebElement favorite) {
		this.favorite = favorite;
	}
	public WebElement getUnSelectable() {
		return unSelectable;
	}
	public void setUnSelectable(WebElement unSelectable) {
		this.unSelectable = unSelectable;
	}
	public WebElement getCheckSelected() {
		return checkSelected;
	}
	public void setCheckSelected(WebElement checkSelected) {
		this.checkSelected = checkSelected;
	}
	
}

