package org.dragndrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDropEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		WebElement browserIcon = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a"));
		browserIcon.click();
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"menuform:m_drag\"]/a"));
		drag.click();
		WebElement holdNDrag = driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(holdNDrag, 500, 0).perform();
		WebElement dragCol = driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt95']"));
		act.dragAndDropBy(dragCol, 500, 0).perform();
		WebElement resizeImgx = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/div[1]"));
		act.clickAndHold(resizeImgx).moveByOffset(50, 0).perform();
		WebElement resizeImgy = driver.findElement(By.xpath("//*[contains(text(),'resizable-s')]"));
		act.clickAndHold(resizeImgy).moveByOffset(0, 100).perform();
		driver.close();
	}
}
