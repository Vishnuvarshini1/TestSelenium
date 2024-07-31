package org.newprjct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\test\\gitCode\\Resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.leafground.com/waits.xhtml");
	//find the element
	WebElement clickMe = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
	clickMe.click();
	//find the im here element
	WebElement imHere = driver.findElement(By.xpath("//span[text()='I am here']"));
	imHere.click();
	System.out.println("Succefully clicked");
}
}
