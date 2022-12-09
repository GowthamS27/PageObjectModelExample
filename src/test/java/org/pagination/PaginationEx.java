package org.pagination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationEx {
	static String nextClassName;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		
		List<String> namesList = new ArrayList<String>();
		List<WebElement> listOfNames;
		WebElement nextButton;
		int sizeOfPagination = driver.findElements(By.xpath("//*[@id='dtBasicExample_paginate']//a")).size();
		System.out.println(sizeOfPagination);
		if (sizeOfPagination > 0) {
			do {
				listOfNames = driver.findElements(By.xpath("//td[@class='sorting_1']"));
				for (WebElement name : listOfNames) {
					namesList.add(name.getText());
				}
				nextButton = driver.findElement(By.id("dtBasicExample_next"));
				nextClassName = nextButton.getAttribute("class");
				if (!nextClassName.contains("disabled")) {
					nextButton.click();
				} else {
					break;
				}
			} while (true);
		} else {
			System.out.println("No Pagination in this page");
		}

		for (String allNames : namesList) {
			System.out.println(allNames);
		}
	}
}
