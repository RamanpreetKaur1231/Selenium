package com.ta.Salesforce;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC08 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchSalesforce();
		
		driver.findElement(By.id("userNavLabel")).click();
		
		List<WebElement> dropdownOptions = driver.findElements(By.id("userNav-menuItems"));
		
		for(int count=0; count<dropdownOptions.size(); count++) {
			System.out.println(dropdownOptions.get(count).getText());
		}
		
		WebElement DeveloperConsoleBtn =driver.findElement(By.xpath("//a[contains(text(), 'Developer Console')]"));
		waitExplicitFunc(DeveloperConsoleBtn, 5);
		DeveloperConsoleBtn.click();

		ArrayList<String> webWindows=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(webWindows.get(1));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
	}

}
