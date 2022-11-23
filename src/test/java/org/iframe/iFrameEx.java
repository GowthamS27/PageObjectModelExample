package org.iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		WebElement browserIcon = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a"));
		browserIcon.click();
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"menuform:m_frame\"]/a"));
		frame.click();
		driver.switchTo().frame(0);
		WebElement clickframe1 = driver.findElement(By.id("click"));
		clickframe1.click();
		String text = driver.findElement(By.id("click")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement nestedFrame = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		nestedFrame.click();
		String text1 = driver.findElement(By.xpath("//*[@id=\"Click\"]")).getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
		int count = frameCount.size();
		System.out.println("Total Number of Frames is :"+count);
	}
}
