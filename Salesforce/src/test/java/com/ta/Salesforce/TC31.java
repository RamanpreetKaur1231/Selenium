package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC31 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click on Contacts Tab
		WebElement ContactsBtn= driver.findElement(By.xpath("//a[@title= 'Contacts Tab']"));
		//WaitExplicitfunc(ContactsBtn);
		ContactsBtn.click();

		WebElement NewViewBtn= driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		waitExplicitFunc(NewViewBtn,20);
		
		//Close pop up
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
	
		
		//Click onCreate New View Button
		NewViewBtn.click();	
		
		
		//enter View name
		driver.findElement(By.id("fname")).sendKeys("ABCD");
		//enter UniqueView name
		driver.findElement(By.id("devname")).clear();
		driver.findElement(By.id("devname")).sendKeys("EFGH");
		//Cancel
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td[2]/input[2]")).click();
		


	}

}
