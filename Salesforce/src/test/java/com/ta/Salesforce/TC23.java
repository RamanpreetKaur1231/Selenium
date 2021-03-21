package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC23 extends BroswserUtility1 {

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
		
		selectFunc(leadsDropdown, "Today's Leads");
		
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);

	}

}
