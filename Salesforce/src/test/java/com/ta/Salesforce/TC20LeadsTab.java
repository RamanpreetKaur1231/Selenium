package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC20LeadsTab extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		
		WebElement LeadsBtn= driver.findElement(By.xpath("//a[@title= 'Leads Tab']"));
		LeadsBtn.click();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Thread.sleep(1000);
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
	}

}
