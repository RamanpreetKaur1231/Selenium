package com.ta.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword4B {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("123");
		driver.findElement(By.id("password")).sendKeys("22131");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.id("error")).getText());

	}

}
