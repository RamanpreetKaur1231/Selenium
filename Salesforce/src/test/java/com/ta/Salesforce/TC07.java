package com.ta.Salesforce;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//Select "My settings" option from user menu for <username> drop down
public class TC07 extends BroswserUtility1{

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchSalesforce();
		driver.findElement(By.id("userNavLabel")).click();
		List<WebElement> dropdownOptions = driver.findElements(By.id("userNav-menuItems"));
		for(int count=0; count<dropdownOptions.size(); count++) {
			System.out.println(dropdownOptions.get(count).getText());
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement MySettingBtn =driver.findElement(By.xpath("//a[contains(text(), 'My Settings')]"));
		waitExplicitFunc(MySettingBtn, 5);
		MySettingBtn.click();
		
	
	WebElement personalLink= driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
	waitExplicitFunc(personalLink, 5);
		 personalLink.click();
		
		 WebElement loginHistoryLink= driver.findElement(By.id("LoginHistory_font"));
		 waitExplicitFunc(loginHistoryLink, 5);
		 loginHistoryLink.click();
		 
		 WebElement downloadHistoryLink= driver.findElement(By.xpath("//a[contains(text(), 'Download login history for last six months')]"));
		 waitExplicitFunc(downloadHistoryLink, 5);
		 downloadHistoryLink.click();
		 
		 WebElement DispalyLayoutLink= driver.findElement(By.id("DisplayAndLayout_font"));
		 waitExplicitFunc(DispalyLayoutLink, 5);
		 DispalyLayoutLink.click();
		 
		 
		 WebElement CustomizeTabsLink= driver.findElement(By.id("CustomizeTabs_font"));
		 waitExplicitFunc(CustomizeTabsLink, 5);
		 CustomizeTabsLink.click();
		 
		 //add salesforce chatter option from dropdown:
		 Select select =new Select(driver.findElement(By.xpath("//select[@name='p4']")));
		 select.selectByVisibleText("Salesforce Chatter");
		 
		 //Select Reports tab from Available Tabs list. Click on >(Add) button. 
		 Select select1 =new Select(driver.findElement(By.id("duel_select_0")));
		 select1.selectByVisibleText("Reports");
		 driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
		 
		 //Click on Email link
		 driver.findElement(By.id("EmailSetup_font")).click();
		 driver.findElement(By.id("EmailSettings_font")).click(); 
		 //Provide <EmailName> in Email Name field, <EmailAddress> in Email Address field, 
		 //Select automatic BCC radio button and click on save button
		 driver.findElement(By.id("sender_name")).clear();
		 driver.findElement(By.id("sender_name")).sendKeys("Ramanpreet Kaur");
		 driver.findElement(By.id("sender_email")).clear();
		 driver.findElement(By.id("sender_email")).sendKeys("ramanpreetk1231@gmail.com"); 
		
		 WebElement autoBcc	= driver.findElement(By.id("auto_bcc1")) ;
		 boolean BccSelected=autoBcc.isSelected();
		 if(BccSelected==false) {
			 autoBcc.click();
		 }
		 else System.out.println("This option is already selected.");
		 driver.findElement(By.xpath("//input[@value=' Save ']")).click(); 
		 
		 //Click on Calendar and ReminderLink, activity reminder link
		 driver.findElement(By.id("CalendarAndReminders_font")).click() ;
		 driver.findElement(By.id("Reminders_font")).click() ; 
		 driver.findElement(By.id("testbtn")).click() ;  
		 
		 
		 
	}

}
