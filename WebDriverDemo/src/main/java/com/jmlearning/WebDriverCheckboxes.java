package com.jmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Joseph/devTools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Joseph/eclipse-workspace/WebDriverDemo/src/main/webapp/CheckboxTest.html");
		
		WebElement checkbox = driver.findElement(By.id("pastaCheckbox"));
		checkbox.click();
		
		// Twice to uncheck
		//checkbox.click();

	}

}
