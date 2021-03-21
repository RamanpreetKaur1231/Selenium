package com.ta.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToSalesForce2 {

	public static void main(String[] args) {
		//WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rkaur@tekarch.com");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("Login")).click();
		
		
		
	}

}
