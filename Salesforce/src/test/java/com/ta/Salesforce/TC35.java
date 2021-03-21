package com.ta.Salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC35 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		//Click on allTab button
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement AllTab= driver.findElement(By.xpath("//img[@title='All Tabs']"));
		AllTab.click();
		//Click customize tab:
		WebElement CustomiszeTab= driver.findElement(By.xpath("//input[@title='Customize My Tabs']"));
		CustomiszeTab.click();
		//select a option from selected Tabs
		WebElement SelectedTab= driver.findElement(By.xpath("//select[@name='duel_select_1']"));
		selectFunc(SelectedTab,"Cases");
		//Click on Remove
		driver.findElement(By.xpath("//img[@title='Remove']")).click();
		//CLICK SAVE
		driver.findElement(By.xpath("//input[@name='save']")).click();
		//Log out
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		//login again
		driver.findElement(By.id("username")).sendKeys("rkaur@tekarch.com");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("Login")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
