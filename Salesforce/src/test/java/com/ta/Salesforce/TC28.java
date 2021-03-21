package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC28 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click on Contacts Tab
		WebElement ContactsBtn= driver.findElement(By.xpath("//a[@title= 'Contacts Tab']"));
		//WaitExplicitfunc(ContactsBtn);
		ContactsBtn.click();
		
		//Close pop up
		Thread.sleep(2000);
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		WebElement ViewDropdown = driver.findElement(By.id("fcf"));
		selectFunc(ViewDropdown, "My Contacts");
	}

}
