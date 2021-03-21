package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC22 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement LeadsBtn= driver.findElement(By.xpath("//a[@title= 'Leads Tab']"));
		LeadsBtn.click();
		
		//dropdown
		WebElement leadsDropdown=driver.findElement(By.id("fcf"));
		
		
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		selectFunc(leadsDropdown, "My Unread Leads");
		
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		//logout
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		//login again
		driver.findElement(By.id("username")).sendKeys("rkaur@tekarch.com");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("Login")).click();

		//click leads tab again:
		WebElement LeadsBtn1= driver.findElement(By.xpath("//a[@title= 'Leads Tab']"));
		LeadsBtn1.click();
		//click on Go
		driver.findElement(By.xpath("//input[@value=' Go! ']")).click();
	}

}
