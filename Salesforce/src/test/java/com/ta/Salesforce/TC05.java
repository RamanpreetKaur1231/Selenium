package com.ta.Salesforce;
//Select user menu for <username> drop down

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC05 extends BroswserUtility1 {

	public static void main(String[] args) {
	
		launchBrowser("Chrome");
		launchSalesforce();
		
		WebElement userdropdown= driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		
		waitExplicitFunc(userdropdown, 5);
		
		//Select select = new Select(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		
		 List<WebElement> DropDownContents = driver.findElements(By.id("userNav-menuItems"));
		 
	       for(int i =0; i<DropDownContents.size(); i++) {
	    	   System.out.println(DropDownContents.get(i).getText());
		
		//driver.quit();

	}
	}
}
