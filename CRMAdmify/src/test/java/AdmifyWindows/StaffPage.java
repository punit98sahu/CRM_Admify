package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class StaffPage extends LoginPage {
  @Test(priority = 1)
  public void AddStaff() throws InterruptedException {
	  
	  Thread.sleep(4000);
	  //click on counselors tab from side menu
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[12]/div")).click();
	  //get the counselors count
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div")).getText());
	  
	  //click on Add counsellor FAB button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[4]/div/button")).click();
	  
	  //verify Add counselor dialog box
	  WebElement DialogTitle = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
	  System.out.println(DialogTitle.getText());
	  String actualTitle = DialogTitle.getText();
	  String expectedTitle = "Add Staff";
	  
	  if(actualTitle.equals(expectedTitle)) {
		  System.out.println("dialog box title verify successfully");
		  
		  // click on name input box
		  WebElement Name = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"));
		  Name.click();
		  Name.sendKeys("Rajiv Ranjan");
		  
		  //click on Email id input box
		  WebElement email = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input"));
		  email.click();
		  email.sendKeys("rajiv.ranjan@eulogik.com");
		  
		  //click on mobile number input box
		  WebElement mobile = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/input"));
		  mobile.click();
		  mobile.sendKeys("8899556622");
		  
		  //click on gender dropdown
		  WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[4]/div/div/div"));
		  gender.click();
		  

		  //select value from dropdown
		  List <WebElement> selectGender = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul/li"));
//		  selectGender.forEach(element -> System.out.println("Text: " + element.getText()));
		  System.out.println(selectGender.size());
		  
//		  driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[1]")).click();

		  for(int i=1; i<= selectGender.size(); i++) {
			  WebElement ele = driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li["+i+"]"));
			  ele.getText();
			  if(ele.getText().equals("Female")) {
			
				  driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li["+i+"]")).click();
			  }
		  }
		  

		  System.out.println("successfully comes out");
		  
		  //click on Role dropdown
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[5]/div/div/div")).click();
		  
		  //select the name of Teamleader from dropdown
		  List <WebElement> Role = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul/li"));
		  System.out.println( Role.size());
		  
		  for(int i=1; i<= Role.size(); i++) {
			  WebElement ele = driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li["+i+"]"));
			  ele.getText();
			  if(ele.getText().equals("Admin")) {
			
				  driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li["+i+"]")).click();
			  }
		  }
		  
		  //click on password input box
		  WebElement password =driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[7]/div/div/input"));
		  password.click();
		  password.sendKeys("123456");
		  
		  //click on upload photo icon
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[8]/div/div/div")).click();
		  Thread.sleep(5000);
		  
		  //click on Add button
//		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
		  //click on close icon button
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click(); 
		  
	  }
  }
  
@Test(priority = 2)
public void StaffDetail() throws InterruptedException {
	Actions act = new Actions(driver);
	//click on search to filter the data by name
	WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
	search.click();
	String Name = "rajiv";
	search.sendKeys(Name);
	
	  Thread.sleep(2000);
	  //click on Edit icon
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[6]/div/button")).click();
	  Thread.sleep(2000);
	  //verify the update staff window
	  WebElement UpdateStaffDialog = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
	  UpdateStaffDialog.getText();
	  String ActualHeading = UpdateStaffDialog.getText();
	  String ExpectedHeading = "Update Staff";
	   
	  if(ActualHeading.equals(ExpectedHeading)) {
		  System.out.println("heading verify successfully");
		  //Edit Name of counselor
		  WebElement ReName = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"));
		  ReName.click();
		  act.moveToElement(ReName).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		  ReName.sendKeys("Rajiv Ranjan");
	  }
	  
	  //Edit Email of counselor
	  WebElement ReNameEmail = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input"));
	  ReNameEmail.click();
	  act.moveToElement(ReNameEmail).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	  ReNameEmail.sendKeys("rajiv.ranjan@eulogik.com");
	  
	  //Edit Mobile Number of counselor
	  WebElement ReNameMobile = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/input"));
	  ReNameMobile.click();
	  act.moveToElement(ReNameMobile).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	  ReNameMobile.sendKeys("8899556622");
	  
	  //click on Update button
//	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	  
	  //click on close icon
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
	  Thread.sleep(2000);
	  //click on enalble and disable Action button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]")).click();
	  
	  //clear the search text
	  act.moveToElement(search).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	}



}

