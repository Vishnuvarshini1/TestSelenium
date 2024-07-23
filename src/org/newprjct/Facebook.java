package org.newprjct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\test\\July\\Resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//WebElement element=driver.findElement(By.tagName("a"));
	//System.out.println(element.getText());
	List<WebElement> elements = driver.findElements(By.tagName("a"));
	System.out.println(elements.size());
	for(int i=0;i<elements.size();i++) {
		System.out.println(elements.get(i).getText());
	}
	
}
}
