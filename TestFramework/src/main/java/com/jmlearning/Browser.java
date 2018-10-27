package com.jmlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	// Why is this not working...
	//System.setProperty("webdriver.chrome.driver", "C:/Users/Joseph/devTools/chromedriver.exe");
	static WebDriver driver = new ChromeDriver();
	
	public static void goTo(String url) {
		
		driver.get(url);
	}

	public static String title() {
		
		return driver.getTitle();
	}

	public static void close() {
		
		driver.close();
		
	}

}
