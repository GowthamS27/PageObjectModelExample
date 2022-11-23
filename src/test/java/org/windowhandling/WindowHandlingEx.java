package org.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		WebElement browserIcon = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a"));
		browserIcon.click();
		WebElement windows = driver.findElement(By.xpath("//*[@id=\"menuform:m_window\"]/a"));
		windows.click();
		String currentWindow = driver.getWindowHandle();
		WebElement open = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]"));
		open.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String newwindow : windowHandles) {
			driver.switchTo().window(newwindow);
		}
		if (driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("New Window Opened");
			driver.close();
		}
		
		driver.switchTo().window(currentWindow);
		Thread.sleep(2000);
		WebElement openMulti = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button"));
		openMulti.click();
		int count = driver.getWindowHandles().size();
		System.out.println("No. of windows Opened: "+count);
		Set<String> newWindows = driver.getWindowHandles();
		for (String allWindows : newWindows) {
			if (!allWindows.equals(currentWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
				System.out.println("child windows closed");
			}
	}
}
}
