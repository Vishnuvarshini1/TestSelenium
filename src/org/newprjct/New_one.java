package org.newprjct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_one {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\vishnu\\test\\July\\Resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//To Maximize the window
	driver.manage().window().maximize();
	//url using get method
	driver.get("https://www.flipkart.com/");
	//load url using navigate method
	driver.navigate().to("https://www.amazon.in/");
	//wait Thread is used to wait the mechanic for specific time period
	Thread.sleep(2000);
	driver.navigate().to("https://www.flipkart.com/");
	// wait
	Thread.sleep(2000);
	//navigate backward
	driver.navigate().back();
	//navigate forward
	driver.navigate().forward();
	//wait
	Thread.sleep(3000);
	//refresh the page
	driver.navigate().refresh();
	//to get current url
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	//to get title of page
	String title=driver.getTitle();
	System.out.println(title);
	//to close the current open tab
	driver.close();
	//to close all open tab in brower
	driver.quit();
}
}
