package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC21leadsSelectView extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement LeadsBtn= driver.findElement(By.xpath("//a[@title= 'Leads Tab']"));
		LeadsBtn.click();
		
		//dropdown
		WebElement leadsDropdown=driver.findElement(By.id("fcf"));
		Select select= new Select(leadsDropdown);
		
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		leadsDropdown.click();
		
		//DropdownOptions
		List<WebElement> LeadOptions = select.getOptions();
		for(int i=0;i<LeadOptions.size(); i++) {
			System.out.println(LeadOptions.get(i).getText());
		}
		
	}

}
