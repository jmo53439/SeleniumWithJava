package com.jmlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRadioButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Joseph/devTools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Joseph/eclipse-workspace/WebDriverDemo/src/main/webapp/RadioButtonTest.html");
		
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		
		// Click a button
		radioButtons.get(1).click();
		
		// Which button was clicked...
		for(WebElement radioButton : radioButtons) {
			
			if(radioButton.isSelected()) {
				
				System.out.println(radioButton.getAttribute("value"));
			}
		}

	}

}
