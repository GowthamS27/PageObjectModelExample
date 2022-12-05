package org.checkbox;

import java.time.Duration;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxEx extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		BaseClass baseclass = new BaseClass();
		baseclass.launchBrowser();
		baseclass.launchUrl("https://www.leafground.com/checkbox.xhtml");
		//Basic Checkbox
		Check_Box_Page cbpage = new Check_Box_Page();
		Check_Box_Page.basic.click();
		//Notification Ajax
		Check_Box_Page.notification.click();
		WebElement ajax = driver.findElement(By.xpath("//*[@id='j_idt87:msg_container']|//span[@class='ui-growl-title']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement checkednoti = wait.until(ExpectedConditions.visibilityOf(ajax));
		String alert = checkednoti.getText();
		System.out.println(alert);
		//Choose your favorite language(s)
		WebElement choose = driver.findElement(By.xpath("//table[@id='j_idt87:basic']//following::div"));
		choose.click();
		//Tri State Checkbox
		WebElement triState = driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']"));
		triState.click();
		WebElement state = driver.findElement(By.xpath("//*[@id='j_idt87:id_container']|//span[@class='ui-growl-title']"));
		WebElement index = wait.until(ExpectedConditions.visibilityOf(state));
		String value = index.getText();
		System.out.println(value);
		
		
	}
}
