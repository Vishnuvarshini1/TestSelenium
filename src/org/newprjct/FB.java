package org.newprjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\test\\July\\Resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	//WebElement userName=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
	WebElement userName = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
	Thread.sleep(2000);
	userName.sendKeys("varshini");
}
}
//WebElement userName = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
//pass input to the user
//userName.sendKeys("Kumar");
