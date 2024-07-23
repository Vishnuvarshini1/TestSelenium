package org.newprjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conflict_xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\test\\July\\Resource\\chromedriver.exe");
	//to 
	WebDriver driver=new ChromeDriver();
	//To mazimize the window
	driver.manage().window().maximize();
	//To launch the browser
	driver.get("https://in.indeed.com/");
	//to wait system for specific period of time
	Thread.sleep(2000);
	//to locate element using conflict xpath
	WebElement jobs=driver.findElement(By.xpath("//input[@type='text'][1]"));
	jobs.sendKeys("Automation Tester");
	Thread.sleep(2000);
	//to locate an element using contains xpath with attribute name
	WebElement location=driver.findElement(By.xpath("//input[contains(@id,'text-input-where')]"));
	Thread.sleep(2000);
	location.sendKeys("Coimbatore");
	//to locate element using xpath
	WebElement findjobs=driver.findElement(By.xpath("//button[text()='Find jobs']"));
	findjobs.click();
}
}
