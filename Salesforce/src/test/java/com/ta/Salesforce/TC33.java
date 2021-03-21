package com.ta.Salesforce;

import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC33 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement HomeTab= driver.findElement(By.xpath("//a[@title= 'Home Tab']"));
		
		Thread.sleep(2000);
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		HomeTab.click();
		
		java.util.List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		boolean linkpresent= false;
		
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		for(WebElement nameLink: allLinks) {
			if(nameLink.getText().equals("Ramanpreet Kaur")) {
				linkpresent=true;
			}
		}
			if(linkpresent==true)	
			System.out.println("Name Link is Present");
		
			
		//Click on name link
		driver.findElement(By.xpath("//h1[@class='currentStatusUserName']/a")).click();
		
		
		
		
	}

}
