package org.newprjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Starts_with {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\test\\July\\Resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ubereats.com/");
	Thread.sleep(2000);
	// To locate an element using starts -with xpath with attribute name
	WebElement location=driver.findElement(By.xpath("//input[starts-with(@id,'location')]"));
	Thread.sleep(2000);
	// to send input
	location.sendKeys("Chennai");
	//To wait system for specific period of time
	Thread.sleep(2000);
	// To locate an element using starts -with xpath with text
	WebElement search=driver.findElement(By.xpath("//button[starts-with(text(),'Search')]"));
	search.click();
}
}
