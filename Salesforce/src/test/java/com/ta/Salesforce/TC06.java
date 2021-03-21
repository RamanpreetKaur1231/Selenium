package com.ta.Salesforce;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//Select "My Profile" option from user menu for <username> drop down
public class TC06 extends BroswserUtility1 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		launchBrowser("Chrome");
		launchSalesforce();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement userdropdown= driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		
		waitExplicitFunc(userdropdown, 10);
		userdropdown.click();
		driver.findElement(By.xpath("//a[@title='My Profile']")).click();
		Thread.sleep(3000);
		/*	
		WebElement EditLink=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']/img"));
		waitExplicitFunc(EditLink, 10);
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']/img")).click();
		
		//move to iframe:
		driver.switchTo().frame("contactInfoContentId");
		
		//Click on About tab and enter <Lastname> and click on save all button
		driver.findElement(By.xpath("//a[contains(text(), 'About')]")).click();
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Kaur");
		driver.findElement(By.xpath("//input[@value='Save All']")).click();	
		
		//Click on Post link  
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
		
		//Switch to iframe
		WebElement Postiframe= driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(Postiframe);
		
		//Enter the <text> to post in the post text area
		WebElement PostTextInFrame= driver.findElement(By.xpath("//body[@class='chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders placeholder']"));
		WaitExplicitfunc(PostTextInFrame);
		PostTextInFrame.sendKeys("Hello Guys, How are you all.");
		//switch to default window area
		driver.switchTo().defaultContent();
		//Click on share Button
		driver.findElement(By.id("//input[@id='publishersharebutton']")).click();
		*/
		
	/*	//Click on the  file link and click on "upload a file from computer" button.	
		WebElement FileLink=driver.findElement(By.xpath("//span[@class='publisherattachtext '][contains(text(), 'File')]"));
		FileLink.click();
		WebElement UploadFileLink =driver.findElement(By.id("chatterUploadFileAction"));
		UploadFileLink.click();
		
		//Click on choose file button and select a file to be uploaded and click open button.
		WebElement ChooseFileLink =driver.findElement(By.xpath("//input[@id='chatterFile']"));
		WaitExplicitfunc(ChooseFileLink);
		ChooseFileLink.click();
		// more coding to add file
	*/	
		//Hover the mouse on myprofilephoto image and Add photo link appears. 
		//Click on the link to upload a photo. Click on Choose file button and select the image to upload. Crop the photo to fit the image.
		Actions ac=new Actions(driver);
		WebElement moveToPic=driver.findElement(By.xpath("//img[@class='chatter-photo']"));
		ac.moveToElement(moveToPic).build().perform();
		driver.findElement(By.id("uploadLink")).click();
		//Move to frame and click on choose file link
		WebElement switchToIframe= driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		driver.switchTo().frame("switchToIframe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")).sendKeys("C:\\Users\\Ramanpreet\\Pictures\\QA");
	/*	//path: C:\Users\Ramanpreet\Pictures\QA
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_C);        // C
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_COLON);    // : (colon)
		r.keyRelease(KeyEvent.VK_COLON);
		r.keyPress(KeyEvent.VK_SLASH);    // / (slash)
		r.keyRelease(KeyEvent.VK_SLASH);
		r.keyPress(KeyEvent.VK_U);        // U
		r.keyRelease(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_S);        // s
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_E);        // e
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_R);        // r
		r.keyRelease(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_S);        // s
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_SLASH);    // / (slash)
		r.keyRelease(KeyEvent.VK_SLASH);
		r.keyPress(KeyEvent.VK_R);        // r
		r.keyRelease(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_A);        // a
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_M);        // m
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_A);        // a
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);        // n
		r.keyRelease(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_P);        // p
		r.keyRelease(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_R);        // r
		r.keyRelease(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_E);        // e
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_E);        // e
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_T);        // t
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_SLASH);    // / (slash)
		r.keyRelease(KeyEvent.VK_SLASH);
		r.keyPress(KeyEvent.VK_P);        // p
		r.keyRelease(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_I);        // I
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_C);        // C
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_T);        // t
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_U);        // U
		r.keyRelease(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_R);        // r
		r.keyRelease(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_E);        // e
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_S);        // s
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_SLASH);    // / (slash)
		r.keyRelease(KeyEvent.VK_SLASH);
		r.keyPress(KeyEvent.VK_Q);        // Q
		r.keyRelease(KeyEvent.VK_Q);
		r.keyPress(KeyEvent.VK_A);        // A
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_ENTER);    // confirm by pressing Enter in the end
		r.keyRelease(KeyEvent.VK_ENTER);
		*/
		Thread.sleep(3000);
		driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn")).click();
		
		
		
		
		
		
		
	}

}
