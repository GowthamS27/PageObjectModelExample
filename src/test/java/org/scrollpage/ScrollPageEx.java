package org.scrollpage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPageEx {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		//Scroll to some position
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		//Scroll down
		executor.executeScript("window.scroll(0,450)", "");
		Thread. sleep(3000) ;
		//scroll up
		executor.executeScript("“window.scroll(0,-450)", "");
		//Go to the bottom of the page
		//bottom of page
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread .sleep(3000);
		//top of page
		executor.executeScript("window.scroll(0,0)", "");
		Robot robot= new Robot();
		//page down
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread. sleep(3000) ;
		//page up
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}
}
