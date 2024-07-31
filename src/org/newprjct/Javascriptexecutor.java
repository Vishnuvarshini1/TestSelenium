package org.newprjct;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\test\\gitCode\\Resource\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	WebElement username=driver.findElement(By.id("email"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','vishnu')",username);
	Thread.sleep(2000);
	js.executeScript("arguments[0].setAttribute('Style','background :Yellow');",username);
	Thread.sleep(2000);
	//change the border size using javascriptexecutor
	js.executeScript("arguments[0].setAttribute('Style','border:5px solid green')",username);
	Thread.sleep(2000);
	//change the border size and background colour
	js.executeScript("arguments[0].setAttribute('Style','background:pink;border: 5px solid yellow')",username);

	
	
}
}
