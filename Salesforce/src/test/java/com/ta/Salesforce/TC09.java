package com.ta.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC09 extends BroswserUtility1{

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchSalesforce();
		
		driver.findElement(By.id("userNavLabel")).click();
		WebElement LogoutBtn =driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
		waitExplicitFunc(LogoutBtn, 5);
		LogoutBtn.click();
		
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().equals("https://login.salesforce.com/")) {
			System.out.println("salesforce login page is dispalyed");}
			else 
				System.out.println("salesforce login page is not dispalyed");
		
		
	}

}
