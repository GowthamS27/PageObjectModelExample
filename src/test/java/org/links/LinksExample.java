package org.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		//Take me to dashboard
		WebElement dashBoard = driver.findElement(By.partialLinkText("Dashboard"));
		dashBoard.click();
		driver.navigate().back();
		//Find my destination
		WebElement destination = driver.findElement(By.partialLinkText("URL"));
		String url = destination.getAttribute("href");
		System.out.println(url);
		//Am I broken link?
		WebElement brokenLink = driver.findElement(By.partialLinkText("Broken?"));
		brokenLink.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("Link is Broken");
		}
		driver.navigate().back();
		//Duplicate Link
		//dashBoard.click();       //find it//
		//Thread.sleep(5000);
		//Count Links
		WebElement link = driver.findElement(By.partialLinkText("page"));
		link.click();
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		int size = totallinks.size();
		System.out.println(size);
		driver.navigate().back();
		//Count Layout Links
		WebElement layoutlinks = driver.findElement(By.partialLinkText("layout"));
		layoutlinks.click();
		List<WebElement> layouts = driver.findElements(By.xpath("//*[@class=\"ui-dataview-row ui-g\"]/child::div"));
		//here used single / for child to get exact child of the parent when using // shows all child
		int layoutNo = layouts.size();
		System.out.println(layoutNo);
}
}
