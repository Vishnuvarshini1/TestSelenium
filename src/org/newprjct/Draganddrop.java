package org.newprjct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\test\\gitCode\\Resource\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.shopclues.com/wholesale.html");
	Actions action=new Actions(driver);
	
	WebElement mobiles=driver.findElement(By.xpath("//label[text()='Mobiles & Tablets']"));
	action.moveToElement(mobiles).build().perform();
	action.click(mobiles).build().perform();
	WebElement price=driver.findElement(By.xpath("//label[@for='2501 - 5000']"));
	action.moveToElement(price).build().perform();
	action.click().build().perform();
	
	
	
	
}
}
