package com.ta.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword4A {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("forgot_password_link")).click();
		driver.findElement(By.id("un")).sendKeys("rkaur@tekarch.com");
		driver.findElement(By.id("continue")).click();

	}

}
