package org.repository;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Repository extends Base {
	// all locators created as static return the webelement 
public static WebElement id(String idvalue) {
	return driver.findElement(By.id(idvalue));
}
public static WebElement name(String namevalue) {
	return driver.findElement(By.name(namevalue));
}
public static WebElement classname(String classvalue) {
	return driver.findElement(By.className(classvalue));
}
public static WebElement tagname(String tagvalue) {
	return driver.findElement(By.tagName(tagvalue));
}
public static WebElement linktext(String linkvalue) {
	return driver.findElement(By.linkText(linkvalue));
}
public static WebElement partiallink(String partiallinkvalue) {
	return driver.findElement(By.partialLinkText(partiallinkvalue));
}
public static WebElement cssSelector(String CssSelectorvalue) {
	return driver.findElement(By.cssSelector(CssSelectorvalue));
}
public static WebElement xpath(String xpathvalue) {
	return driver.findElement(By.xpath(xpathvalue));
}

}
