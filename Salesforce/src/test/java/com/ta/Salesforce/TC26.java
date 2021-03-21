package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC26 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click on Contacts Tab
		WebElement ContactsBtn= driver.findElement(By.xpath("//a[@title= 'Contacts Tab']"));
		//WaitExplicitfunc(ContactsBtn);
		ContactsBtn.click();
		
		Thread.sleep(4000);
		//Close pop up
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(4000);
		
		//Click onCreate New View Button
		WebElement NewViewBtn= driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		NewViewBtn.click();	
		//waitExplicitFunc(NewViewBtn,20);
		
		//enter view name
		driver.findElement(By.id("fname")).sendKeys("contact view");
		//Save
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td[2]/input[1]")).click();
	

	}

}
