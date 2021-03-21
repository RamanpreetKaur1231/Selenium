package com.ta.Salesforce;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC34 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		launchBrowser("Chrome");
		launchSalesforce();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement userdropdown= driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		
		waitExplicitFunc(userdropdown, 10);
		userdropdown.click();
		driver.findElement(By.xpath("//a[@title='My Profile']")).click();
		Thread.sleep(3000);
			
		WebElement EditLink=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']/img"));
		waitExplicitFunc(EditLink, 10);
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']/img")).click();
		
		//move to iframe:
		driver.switchTo().frame("contactInfoContentId");
		
		//Click on About tab and enter <Lastname> and click on save all button
		driver.findElement(By.xpath("//a[contains(text(), 'About')]")).click();
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@value='Save All']")).click();	

	}

}
