package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC24 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement LeadsBtn= driver.findElement(By.xpath("//a[@title= 'Leads Tab']"));
		LeadsBtn.click();
		
		WebElement NewButton= driver.findElement(By.xpath("//input[@value=' New ']"));
		
		
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		NewButton.click();
		
		//Enter last name
		driver.findElement(By.id("name_lastlea2")).sendKeys("ABCD");
		
		//enter company name
		driver.findElement(By.id("lea3")).sendKeys("ABCD");
		// to close pop up
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		//Click save 
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td[2]/input[1]")).click();
		
	}

}
