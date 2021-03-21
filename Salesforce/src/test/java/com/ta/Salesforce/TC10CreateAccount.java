package com.ta.Salesforce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC10CreateAccount extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement AccountsBtn= driver.findElement(By.xpath("//a[@title= 'Accounts Tab']"));
		AccountsBtn.click();
		
	WebElement newButton=	driver.findElement(By.xpath("//input[@value=' New ']"));
		WaitExplicitfunc(newButton);
		
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		WaitExplicitfunc(newButton);
		
		newButton.click();
		
		WebElement nameTextbox=	driver.findElement(By.xpath("//input[@id='acc2']"));
		WaitExplicitfunc(nameTextbox);
		nameTextbox.sendKeys("Samantha");
		
		WebElement Typedrpdwn=	driver.findElement(By.xpath("//select[@id='acc6']"));
		WaitExplicitfunc(Typedrpdwn);
		Select select= new Select(Typedrpdwn);
		select.selectByVisibleText("Technology Partner");
		
		
		WebElement Customerdrpdwn=	driver.findElement(By.xpath("//select[@id='00N3t00000C9SPv']"));
		WaitExplicitfunc(Customerdrpdwn);
		Select select1= new Select(Customerdrpdwn);
		
		select1.selectByVisibleText("High");
		
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		
	}

}
