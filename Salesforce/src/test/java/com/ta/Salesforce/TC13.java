package com.ta.Salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC13 extends BroswserUtility1 {

	public static void main(String[] args) throws Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement AccountsBtn= driver.findElement(By.xpath("//a[@title= 'Accounts Tab']"));
		WaitExplicitfunc(AccountsBtn);
		AccountsBtn.click();
		
		WebElement  MergeAccounts=driver.findElement(By.xpath("//a[contains(text(), 'Merge Accounts')]"));
		WaitExplicitfunc(MergeAccounts);
		
		
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		MergeAccounts.click();
		//enter account name and click search
		driver.findElement(By.id("srch")).sendKeys("new");
		driver.findElement(By.xpath("//input[@value='Find Accounts']")).click();
		//Select first two accounts and click next
		driver.findElement(By.id("cid0")).click();
		driver.findElement(By.id("cid1")).click();
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']/input[1]")).click();
		//click merge button
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[2]")).click();
		driver.switchTo().alert().accept();
	
		
	}

}
