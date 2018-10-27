package com.jmlearning;

//import java.net.MalformedURLException;
//import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverDemo {

	public static void main(String[] args) throws Exception  {
		
		// Use Firefox
		//System.setProperty("webdriver.gecko.driver", "C:/Users/Joseph/devTools/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		// Use Chrome
		System.setProperty("webdriver.chrome.driver", "C:/Users/Joseph/devTools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Selenium Server
		//WebDriver driver = new RemoteWebDriver(new URL("http://localhose:4444/wd/hub"), DesiredCapabilities.chrome());
		
		// Open up a page
		driver.get("http://www.google.com");
		
		// Inspect element and use something unique
		WebElement searchField = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));
		
		// Type something into search field and enter
		searchField.sendKeys("selenium");
		searchField.submit();
		
		// Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
		
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
		WebElement pictureLink = driver.findElements(By.cssSelector("#\\31 kNJvnyWka1zxM\\3a")).get(0);
		pictureLink.click();

		
	}

}
