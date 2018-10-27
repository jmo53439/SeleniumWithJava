package com.jmlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Joseph/devTools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Joseph/eclipse-workspace/WebDriverDemo/src/main/webapp/TableTest.html");
		
		// Working with nested tables
		//WebElement outerTable = driver.findElement(By.tagName("table"));
		//WebElement innerTable = outerTable.findElement(By.tagName("table"));
		//WebElement row = innerTable.findElements(By.tagName("td")).get(1);
		
		//System.out.println(row.getText());
		
		// Using xpath
		WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
		System.out.println(row.getText());

	}

}
