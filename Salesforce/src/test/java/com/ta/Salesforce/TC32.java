package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC32 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click on Contacts Tab
		WebElement ContactsBtn= driver.findElement(By.xpath("//a[@title= 'Contacts Tab']"));
		//WaitExplicitfunc(ContactsBtn);
		ContactsBtn.click();
		
		//Click on New Button
		WebElement NewBtn= driver.findElement(By.xpath("//input[@name='new']"));
		waitExplicitFunc(NewBtn,20);
		
		Thread.sleep(2000);
		//Close pop up
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		NewBtn.click();
		
		//Enter last name
		driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
		//Enter account number
		driver.findElement(By.id("con4")).sendKeys("Global Media");
		//Click on Save
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td[2]/input[2]")).click();

	}

}
