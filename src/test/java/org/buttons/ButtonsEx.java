package org.buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonsEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		//Click and Confirm title.
		WebElement button = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
		button.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		//Confirm if the button is disabled.
		WebElement button2 = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean enabled = button2.isEnabled();
		System.out.println(enabled);
		//Find the position of the Submit button
		WebElement button3 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		Point location = button3.getLocation();
		System.out.println(location);
		//Find the Save button color
		WebElement button4 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
		String color = button4.getCssValue("background-color");
		String hex = Color.fromString(color).asHex();
		System.out.println(color);
		System.out.println(hex);
		//Find the height and width of this button
		WebElement button5 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]"));
		Dimension size = button5.getSize();
		System.out.println(size);
		//Mouse over and confirm the color changed
		WebElement button6 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		Actions toElement = act.moveToElement(button6);
		System.out.println("done");
		
}
}
