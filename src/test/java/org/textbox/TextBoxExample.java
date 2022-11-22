package org.textbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		WebElement elementsIcon = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a"));
		elementsIcon.click();
		WebElement textBoxIcon = driver.findElement(By.xpath("//*[@id=\"menuform:m_input\"]/a"));
		textBoxIcon.click();
		WebElement typeYourName = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		typeYourName.sendKeys("Gowtham S");
		WebElement append = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		append.sendKeys("India");
		boolean verify = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(verify);
		WebElement clearMe = driver.findElement(By.id("j_idt88:j_idt95"));
		clearMe.clear();
		WebElement retriveText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		String text = retriveText.getAttribute("value");
		System.out.println(text);
		WebElement moveElement = driver.findElement(By.id("j_idt88:j_idt99"));
		moveElement.sendKeys("gowtham@gmail.com");
		moveElement.sendKeys(Keys.TAB);
		WebElement aboutYou = driver.findElement(By.id("j_idt88:j_idt101"));
		aboutYou.sendKeys("hi");
		WebElement error = driver.findElement(By.id("j_idt106:thisform:age"));
		error.sendKeys(Keys.ENTER);
		String errorMsg = driver.findElement(By.xpath("//*[@id=\"j_idt106:thisform:j_idt110_error-detail\"]")).getText();
		System.out.println("Error Messageis : "+errorMsg);
		WebElement confirm = driver.findElement(By.id("j_idt106:float-input"));
		confirm.click();
		Thread.sleep(1000);
		String className = driver.findElement(By.id("j_idt106:float-input")).getAttribute("class");
		if (className.contains("focus")) {
			System.out.println("Label changed");
		}
	    WebElement typeNchoose = driver.findElement(By.id("j_idt106:auto-complete_input"));
		typeNchoose.sendKeys("Gowtham");
		Thread.sleep(2000);
	    List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li"));
	    for (int i = 0; i < options.size(); i++) {
			if(options.get(i).getText().contains("Gowtham2")) {
				options.get(i).click();
			}
		}
		WebElement dob = driver.findElement(By.id("j_idt106:j_idt116_input"));
		dob.sendKeys("07/27/1995");
		driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt116_panel\"]/div/div[2]/table/tbody/tr[5]/td[5]/a")).click();
	    WebElement value = driver.findElement(By.id("j_idt106:j_idt118_input"));
		value.sendKeys("22");
		value.sendKeys(Keys.ARROW_DOWN);
		String text2 = value.getAttribute("aria-valuenow");
		if(text2.equals("21")) {
			System.out.println("Value Changed");
		}
		WebElement slider = driver.findElement(By.id("j_idt106:slider"));
		slider.sendKeys("52");
		Thread.sleep(2000);
		WebElement sliderValue = driver.findElement(By.xpath("//span[@style='left: 52%;']"));
		boolean displayed = sliderValue.isDisplayed();
			System.out.println(displayed);
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		String keyboard = driver.findElement(By.xpath("/html/body/div[4]")).getAttribute("style");
		if (keyboard.contains("block")) {
			System.out.println("Keyboard Displayed");
		}
	}
}
