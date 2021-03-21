package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC14CreateAccountReport  extends BroswserUtility1 {

	public static void main(String[] args) throws Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		
		WebElement AccountsBtn= driver.findElement(By.xpath("//a[@title= 'Accounts Tab']"));
		WaitExplicitfunc(AccountsBtn);
		AccountsBtn.click();
		Thread.sleep(3000);
		WebElement  lastActivity30days=driver.findElement(By.xpath("//a[contains(text(), 'Accounts with last activity > 30 days')]"));
		WaitExplicitfunc(lastActivity30days);
		
		
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		lastActivity30days.click();
		
		WebElement datePicker= driver.findElement(By.id("ext-gen152"));
		WaitExplicitfunc(datePicker);
		datePicker.click();
		
		WebElement dateToday= driver.findElement(By.id("ext-gen277"));
		WaitExplicitfunc(dateToday);
		dateToday.click();
		
		//click save button
	
		WebElement SaveButton= driver.findElement(By.id("ext-gen49"));
		WaitExplicitfunc(SaveButton);
		SaveButton.click();
		
		//ReportName
		
		WebElement ReportNameTextbox= driver.findElement(By.id("saveReportDlg_reportNameField"));
		WaitExplicitfunc(ReportNameTextbox);
		ReportNameTextbox.sendKeys("demo Report");
		
		//SaveReportButton

		WebElement SaveReportButton= driver.findElement(By.id("ext-gen299"));
		WaitExplicitfunc(SaveReportButton);
		SaveReportButton.click();
		
		

	}

}
