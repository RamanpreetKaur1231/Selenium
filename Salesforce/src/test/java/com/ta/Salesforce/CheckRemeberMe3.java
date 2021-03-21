package com.ta.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckRemeberMe3 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rkaur@tekarch.com");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@name='rememberUn']")).click();
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("idcard-identity")).getText());
		
		
	}

}
