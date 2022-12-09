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
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"j_idt87:country\"]/div[3]"));
		drop.click();
		WebElement country = driver.findElement(By.xpath("//*[@data-label='India']"));
		country.click();
		WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:city\"]/div[3]"));
		drop2.click();
		WebElement city = driver.findElement(By.id("j_idt87:city_2"));
		city.click();
		WebElement drop3 = driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete']/button"));
		drop3.click();
		WebElement courses = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul"));
		Select multi = new Select(courses);
		multi.selectByIndex(1);
		
	}
}
