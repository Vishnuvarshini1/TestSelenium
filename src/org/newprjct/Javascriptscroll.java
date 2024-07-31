package org.newprjct;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptscroll {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\test\\gitCode\\Resource\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.amazon.in/");
	//Scroll down using javascriptexecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		Thread.sleep(2000);
		//scroll up using javascriptexecutor
		js.executeScript("window.scrollBy(0,-1000)");
		WebElement scooter=driver.findElement(By.xpath("//span[text()='Electric scooters & two wheelers from stores nearby']"));
		js.executeScript("arguments[0].scrollIntoView(false)",scooter);
		Thread.sleep(2000);
		//scroll the window by using true
		js.executeScript("arguments[0].scrollIntoView(true)",scooter);
	
}
}
