package com.ta.Salesforce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC11CreateNewView extends BroswserUtility1{

	public static void main(String[] args) throws Exception {
		
		launchBrowser("Chrome");
		launchSalesforce();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement AccountsBtn= driver.findElement(By.xpath("//a[@title= 'Accounts Tab']"));
		AccountsBtn.click();
		
		WebElement newViewButton=	driver.findElement(By.xpath("//a[contains(text(), 'Create New View')]"));
		WaitExplicitfunc(newViewButton);
		
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		//Click on Create new View Link
		driver.findElement(By.xpath("//a[contains(text(), 'Create New View')]")).click();
		//provide view name and unique view name and save
		driver.findElement(By.id("fname")).sendKeys("NewView1");
		driver.findElement(By.id("devname")).sendKeys("NewView1");
		WebElement SaveBtn=driver.findElement(By.xpath("//input[@class='btn primary']"));
		SaveBtn.click();
		
		
		
		

	}

}
