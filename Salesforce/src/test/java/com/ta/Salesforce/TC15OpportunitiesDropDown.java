package com.ta.Salesforce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC15OpportunitiesDropDown extends BroswserUtility1 {

	public static void main(String[] args) throws Exception {
		launchBrowser("Chrome");
		launchSalesforce();
		//Click on Oppor. button
		WebElement OpportunitiesBtn= driver.findElement(By.xpath("//a[@title= 'Opportunities Tab']"));
		WaitExplicitfunc(OpportunitiesBtn);
		OpportunitiesBtn.click();
		
		// to remove the pop up
		Thread.sleep(2000);
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		//Oppor DropDown
		WebElement Opport_Drpdwn= driver.findElement(By.id("fcf"));
		WaitExplicitfunc(Opport_Drpdwn);
		Select select=new Select(Opport_Drpdwn);
		List<WebElement> allOptions = select.getOptions();
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}
		
	}

}
