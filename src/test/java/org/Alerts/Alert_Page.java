package org.Alerts;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alert_Page extends BaseClass {
	public Alert_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[1]")
	private WebElement simpleAlert;
	@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[2]")
	private WebElement confirmAlert;
	@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[3]")
	private WebElement sweetAlert;
	@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[4]")
	private WebElement dismiss;
	@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[5]")
	private WebElement sweetModal;
	@FindBy(xpath="/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div[1]/a")
	private WebElement xmark;
	@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[6]")
	private WebElement prompt;
	@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[7]")
	private WebElement sweetAlertConfirm;
	@FindBy(xpath="//*[@id=\\\"j_idt88:j_idt108\\\"]")
	private WebElement yes;
	@FindBy(xpath="(//span[@class='ui-button-text ui-c'])[8]")
	private WebElement minMax;
	@FindBy(xpath="//*[@id=\\\"j_idt88:j_idt112\\\"]/div[1]/a[2]")
	private WebElement max;
	
	
}
