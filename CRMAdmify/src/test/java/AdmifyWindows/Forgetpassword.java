package AdmifyWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Baseclass.Browser_configration;

public class Forgetpassword extends Browser_configration {
	
  @Test
  public void ForgotPasswordLink() throws InterruptedException {
	//click on forgot password link
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div[2]/div[3]/div/span")).click();
	  //click on email id input box
	  WebElement email=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/input"));
	  email.click();
	  email.sendKeys("admin@gmail.com");
	  //click on Next button
	  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button")).click();
	  //click input box to enter OTP
	  Thread.sleep(2000);
	  WebElement otp = driver.findElement(By.cssSelector("body > div.MuiDialog-root.MuiModal-root.css-1lxzhke > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div.MuiDialogContent-root.flex.flex-col.gap-4.css-1ty026z > div > div > div.MuiFormControl-root.MuiTextField-root.MuiOtpInput-TextField.MuiOtpInput-TextField-1.w-10.bg-none.css-1phe0ka"));
	  Actions action =new Actions(driver);
	  action.moveToElement(otp).click().perform();
	  System.out.println("successfull click on input box");
	
//	  Thread.sleep(5000);
//	  WebElement next=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button"));
//	  //wait until next button enable.
//	  utility.fluentWait(10, next, 5);
//	  next.click();
//	  
//	  Thread.sleep(5000);
//	  //click on next button after entering otp
//	  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button")).click();
	 
	  
	  Thread.sleep(20000);
   	  //click on new password input box
	  WebElement NewPassword=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[1]/div/input"));
	  NewPassword.click();
	  NewPassword.sendKeys("123456");
			 
	 //click on confirm password input box
	  WebElement ConfirmPassword = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div/input"));
	  ConfirmPassword.click();
	  ConfirmPassword.sendKeys("123456");
			 
	  //click on confirm password button
	  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button")).click();
			
	  
	  
  }
}
