package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	public void launchUrl(String url) {
		driver.get(url);
        driver.manage().window().maximize();
	}
	public String  gettext( WebElement element) {
		String word = element.getText();
		return word;
		
	}
}
