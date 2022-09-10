package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("davidshijo4@gmail.com");
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("asghjhjgt");
	WebElement loginbutton = driver.findElement(By.name("login"));
	loginbutton.click();
	
}
}