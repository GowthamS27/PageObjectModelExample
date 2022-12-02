package org.checkbox;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Box_Page extends BaseClass{
	public Check_Box_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")
	public static WebElement basic;
	@FindBy(xpath="//*[@id='j_idt87:j_idt91']")
	public static WebElement notification ;
	@FindBy(xpath="//*[@id='j_idt87:msg_container']|//span[@class='ui-growl-title']")
	public static WebElement ajax ;
	@FindBy(xpath="//table[@id='j_idt87:basic']//following::div")
	public static WebElement choose ;
	@FindBy(xpath="//*[@id='j_idt87:ajaxTriState']")
	public static WebElement triState;
	@FindBy(xpath="//*[@id='j_idt87:id_container']|//span[@class='ui-growl-title']")
	public static WebElement state;
}
