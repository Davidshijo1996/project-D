package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	WebElement From = driver.findElement(By.id("src"));
	From.sendKeys("chennai");
	WebElement To = driver.findElement(By.id("dest"));
	To.sendKeys("nagerkovil");
	WebElement date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
	date.sendKeys("05/10/2022");
	
	
}
}
	
	
			

