package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC17TestOpportunityPipelineReport  extends BroswserUtility1{

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
		
		//Oppo Pipeline link
		WebElement OpportyPipeline= driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		WaitExplicitfunc(OpportyPipeline);
		OpportyPipeline.click();
		
		
		
	}

}
