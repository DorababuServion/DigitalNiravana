package com.DigitalNiravan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitionClass {
	
	public static WebDriver driver;
	
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void maxwin() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();;
	}
	
	public static void geturl() {
		// TODO Auto-generated method stub
		driver.get("https://apps.dev.pg.alphastreet.io/");
	}

	public static void sendkeydata(WebElement e1, String data) {
		// TODO Auto-generated method stub
		e1.sendKeys(data);
	}
	
	public static void clickfun(WebElement e3) {
		// TODO Auto-generated method stub
		e3.click();
	}
	
	public static void staticwait() throws InterruptedException {
		// TODO Auto-generated method stub
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	public static void javaexcutor(WebElement e11) {
		// TODO Auto-generated method stub
		JavascriptExecutor ja = (JavascriptExecutor) driver;
		
		ja.executeScript("arguments[0].value='Avinash Mishra';", e11);

	}
	
	public static void javaexcutorclick(WebElement click) {
		// TODO Auto-generated method stub
		JavascriptExecutor ja = (JavascriptExecutor) driver;
		ja.executeScript("arguments[0].click();", click);
	}
	
	public static void closebrow() {
		// TODO Auto-generated method stub
		driver.quit();
	}
}
