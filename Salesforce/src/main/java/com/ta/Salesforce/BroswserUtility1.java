package com.ta.Salesforce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BroswserUtility1 {

	public static WebDriver driver=null;
	//to launch a browser
	public static void launchBrowser( String browserName) {
		switch(browserName){
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;		
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
			default:
			break;
		}
	}
	
	//to launch a salesforce application and log in
	public static void launchSalesforce() {
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rkaur@tekarch.com");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("Login")).click();
	}
	//Explicit function 
	public static void waitExplicitFunc(WebElement ele, int time) {
		WebDriverWait wait= new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public static void WaitExplicitfunc(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	//explicit function for list of web elements
	public static void WaitExplicitfunc(List<WebElement> ele) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}
	//Select Class function
	public static void selectFunc(WebElement e, String Visibletext) {
		Select select = new Select(e);
		select.selectByVisibleText(Visibletext);
	}
}