package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC37 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		//Click on HomeTab button
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebElement HomeTab= driver.findElement(By.xpath("//a[@title='Home Tab']"));
				HomeTab.click();
				
				//click date link
				WebElement dateLink= driver.findElement(By.xpath("//span[@class='pageDescription']/a"));
				dateLink.click();
				//time link 6am
				WebElement timeLink= driver.findElement(By.xpath("//div[@id='p:f:j_id25:j_id61:0:j_id64']/a"));
				timeLink.click();
				
				Thread.sleep(2000);
				Robot rc =new Robot();
				rc.keyPress(KeyEvent.VK_ESCAPE);
				rc.keyRelease(KeyEvent.VK_ESCAPE);
				
				//click Combo link
				WebElement comboLink= driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']"));
				comboLink.click();
				//move to window pop up
				ArrayList<String> windowsTabs = new ArrayList(driver.getWindowHandles());
				driver.switchTo().window(windowsTabs.get(1));
				//click on other link
				driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
				
				//move back to default window
				driver.switchTo().window(windowsTabs.get(0));
				//end time field
				WebElement EndDropdown=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
				EndDropdown.click();
				//click 7am
				driver.findElement(By.xpath("//div[@id='timePickerItem_14']")).click();
				//reoccurance
				driver.findElement(By.id("IsRecurrence")).click();
				//select weekly radio button
				driver.findElement(By.id("rectypeftw")).click();
				//sELECT END DATE
				driver.findElement(By.id("RecurrenceEndDateOnly")).sendKeys("8/30/2020");
				rc.keyPress(KeyEvent.VK_ESCAPE);
				rc.keyRelease(KeyEvent.VK_ESCAPE);
				//click save
				driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td[2]/input[1]")).click();
				//click month view
				driver.findElement(By.xpath("Month View")).click();

	}

}
