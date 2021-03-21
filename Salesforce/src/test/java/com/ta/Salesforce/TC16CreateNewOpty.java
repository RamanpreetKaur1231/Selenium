package com.ta.Salesforce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC16CreateNewOpty extends BroswserUtility1{

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
		
		
		//Click on New Button
		WebElement NewButton= driver.findElement(By.xpath("//input[@value=' New ']"));
		WaitExplicitfunc(NewButton);
		NewButton.click();
		
		//Enter Oppory name
		WebElement NameTextbox= driver.findElement(By.id("opp3"));
		WaitExplicitfunc(NameTextbox);
		NameTextbox.sendKeys("Opportunity2");
		
		//Enter Account Name
		
		WebElement AccountName= driver.findElement(By.id("opp4"));
		WaitExplicitfunc(AccountName);
		AccountName.sendKeys("raman");
		
		//Close Date
		WebElement ClickDate= driver.findElement(By.id("opp9"));
		WaitExplicitfunc(ClickDate);
		ClickDate.click();
		WebElement SelectDate= driver.findElement(By.xpath("//a[@class='calToday']"));
		WaitExplicitfunc(SelectDate);
		SelectDate.click();
		
		//Stage Dropdown , using selectClass function
		WebElement StageDropDown=driver.findElement(By.id("opp11"));
		selectFunc(StageDropDown, "Qualification") ;
		
		//Probability 
		WebElement Probability= driver.findElement(By.id("opp12"));
		WaitExplicitfunc(Probability);
		Probability.sendKeys(".3");
		
		//LeadSource Dropdown, using selectClass function
		WebElement LeadSourceDropDown=driver.findElement(By.id("opp6"));
		selectFunc(LeadSourceDropDown, "Web") ;
		
		//Primary Campaign Source and click on save button.
		//save button
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td[2]/input[1]")).click();
		
	}

}
