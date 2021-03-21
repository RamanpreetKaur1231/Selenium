package com.ta.Salesforce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC12EditView extends BroswserUtility1 {

	public static void main(String[] args) throws Exception {

		launchBrowser("Chrome");
		launchSalesforce();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement AccountsBtn= driver.findElement(By.xpath("//a[@title= 'Accounts Tab']"));
		WaitExplicitfunc(AccountsBtn);
		AccountsBtn.click();
		
		WebElement drpdownOption=driver.findElement(By.id("fcf"));
		WaitExplicitfunc(drpdownOption);
		
		Robot rc =new Robot();
		rc.keyPress(KeyEvent.VK_ESCAPE);
		rc.keyRelease(KeyEvent.VK_ESCAPE);
		
		Select select=new Select(drpdownOption);
		select.selectByVisibleText("NewView1");

		
		WebElement EditViewButton=	driver.findElement(By.xpath("//div/a[contains(text(), 'Edit')]"));
		WaitExplicitfunc(EditViewButton);
		EditViewButton.click();
		
		
		WebElement nameTextbox= driver.findElement(By.id("fname"));
		WaitExplicitfunc(nameTextbox);
		nameTextbox.clear();
		nameTextbox.sendKeys("Raman");
		
		//fieldDropDown
		WebElement fieldDropDown= driver.findElement(By.id("fcol1"));
		WaitExplicitfunc(fieldDropDown);
		selectFunc(fieldDropDown, "Account Name");
		
		//OperatorDropDown
		WebElement OperatorDropDown= driver.findElement(By.id("fop1"));
		WaitExplicitfunc(OperatorDropDown);
		selectFunc(OperatorDropDown, "contains");
		
		//ValueTextbox
		WebElement ValueTextbox= driver.findElement(By.id("fval1"));
		WaitExplicitfunc(ValueTextbox);
		ValueTextbox.sendKeys("a");
		
		
		WebElement saveButton=driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td[2]/input[1]"));
		WaitExplicitfunc(saveButton);
		saveButton.click();
		
	}
	public static void selectFunc(WebElement e, String Visibletext) {
	Select select = new Select(e);
	select.selectByVisibleText(Visibletext);
		
	}
			
	

}
