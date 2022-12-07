package org.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@class='ui-selectonemenu']"));
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		WebElement country = driver.findElement(By.xpath("//*[@id='j_idt87:country_label']"));
		Select countrySelect = new Select(country);
		countrySelect.selectByVisibleText("India");
		WebElement city = driver.findElement(By.xpath("//*[@id='j_idt87:city_label']"));
		Select citySelect = new Select(city);
		citySelect.deselectByVisibleText("Chennai");
		WebElement courses = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/ul"));
		Select multi = new Select(courses);
		multi.selectByValue("Appium");
		
	}
}
