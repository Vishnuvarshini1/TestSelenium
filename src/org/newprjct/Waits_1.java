package org.newprjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\vishnu\\test\\gitCode\\Resource\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/waits.xhtml");
	//find the element
	WebElement clickMe = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
	clickMe.click();
	//find the im here element
	WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='I am here']"))).click();	
}
}
