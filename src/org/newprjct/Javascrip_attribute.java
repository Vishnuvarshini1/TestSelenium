package org.newprjct;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascrip_attribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\test\\gitCode\\Resource\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	WebElement passWord = driver.findElement(By.id("pass"));
	//get the attribute using javascriptexecutor
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Object attribute = js.executeScript("return arguments[0].getAttribute('data-testid')",passWord);
	System.out.println(attribute.toString());
	//get title
	Object title = js.executeScript("return document.title");
	System.out.println(title);
	//get url
	Object url = js.executeScript("return document.URL");
	System.out.println(url);
}
}
