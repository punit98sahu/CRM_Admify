package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CounsellorPage extends LoginPage {
  @Test (priority=1)
  public void AddCounselors() throws InterruptedException {
	  Thread.sleep(2000);
	  //click on counselors tab from side menu
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[11]/div")).click();
	  //get the counselors count
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div")).getText());
	  
	  //click on Add counsellor FAB button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[3]/div/button")).click();
	  
	  //verify Add counselor dialog box
	  WebElement DialogTitle = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
	  System.out.println(DialogTitle.getText());
	  String actualTitle = DialogTitle.getText();
	  String expectedTitle = "Add Counsellor";
	  
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
		  
//
//			for (WebElement element : selectGender) {
//				// element.getAccessibleName();
//				if (element.getText().equals(String.valueOf(1)));
//				Thread.sleep(1000);
//				element.click();
//				System.out.println("Found");
//				
//			}
			
//		  for(int i=1; i<=selectGender.size(); i++) {
//			  System.out.println("--------------------------------------------");
//			  String text = "/html/body/div[4]/div[3]/ul/li["+i+"]";
//			  System.out.println(text);
//			  Thread.sleep(1000);
//			  WebElement genderList = driver.findElement(By.xpath(text));
//			  System.out.println("click one");
//			  if(genderList.getText().equals("Male")) {
//				  driver.findElement(By.xpath(text)).click();  
//			  }
//		  }
		  
		  System.out.println("successfully comes out");
		  
		  //click on Team Leader dropdown
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[5]/div/div/div")).click();
		  
		  //select the name of Teamleader from dropdown
		  List <WebElement> TeamLeader = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul/li"));
		  System.out.println( TeamLeader.size());
		  
		  for(int i=1; i<= TeamLeader.size(); i++) {
			  WebElement ele = driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li["+i+"]"));
			  ele.getText();
			  if(ele.getText().equals("Ashish jaiswal")) {
			
				  driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li["+i+"]")).click();
			  }
		  }
		  
//		  for(WebElement Leader : TeamLeader) {
//			  System.out.println(Leader.getText());
//			  
//			  for(int i=1; i<=10; i++) {
//			  String LeaderList = "/html/body/div[4]/div[3]/ul/li["+i+"]";
//			  
//			  if(Leader.getText().contains("Leader Shivani")) {
//			  driver.findElement(By.xpath(LeaderList)).click();
//			  			break;
//			  	}
//			  }
//		  }
		  
		  //click on password input box
		  WebElement password =driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[6]/div/div/input"));
		  password.click();
		  password.sendKeys("123456");
		  
		  //click on upload photo icon
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[7]/div/div/div")).click();
		  Thread.sleep(5000);
		  
		  //click on Add button
//		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
		  //click on close icon button
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();  
		  
	  }
	  
  }
	  
  @Test(priority = 2)
  public void CounselorUpdate() throws InterruptedException {
	  Thread.sleep(2000);
	  //click on Search input box
	  WebElement Search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
	  Search.click();
	  String ByName = "punit sahu";
	  Search.sendKeys(ByName);
	  Thread.sleep(2000);
	  //click on Edit icon
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[6]/div")).click();
	  Thread.sleep(2000);
	  //verify the update counselor window
	  WebElement UpdateCounselorDialog = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
	  UpdateCounselorDialog.getText();
	  String ActualHeading = UpdateCounselorDialog.getText();
	  String ExpectedHeading = "Edit Counsellor";
	 
	  Actions act = new Actions(driver);
	  if(ActualHeading.equals(ExpectedHeading)) {
		  System.out.println("heading verify successfully");
		  //Edit Name of counselor
		  WebElement ReName = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"));
		  ReName.click();
		  act.moveToElement(ReName).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		  ReName.sendKeys("punit eulogik");
	  }
	  
	  //Edit Email of counselor
	  WebElement ReNameEmail = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input"));
	  ReNameEmail.click();
	  act.moveToElement(ReNameEmail).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	  ReNameEmail.sendKeys("punit.sahu@eulogik.com");
	  
	  //Edit Mobile Number of counselor
	  WebElement ReNameMobile = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/input"));
	  ReNameMobile.click();
	  act.moveToElement(ReNameMobile).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	  ReNameMobile.sendKeys("8602589577");
	  
	  //click on Update button
//	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	  
	  //click on close icon
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
	  Thread.sleep(2000);
	  //click on enalble and disable Action button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]")).click();
	  
	  
  }
@Test(priority = 3)
public void CounselorDetail() throws InterruptedException {	 
	  Thread.sleep(2000);
	  //geting the totalTask under counselors
//	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li[3]/div")).getText());
	  
	  //click on search input box
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input")).sendKeys("mca");
	  Thread.sleep(2000);
	  //click on the respected task 
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]")).click();
	  Thread.sleep(2000);
	  
	}  
	  
@Test(priority = 4)
public void CounselorTaskDetail() {
	//get the leads count in the task detail window
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li[5]/div")).getText());
	
	//click on filter by status window
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[2]/div/div")).click();
	
	//select value from dropdown
	System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li")).getText());
	
	//click on assigned checkbox
	driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]/span[1]/input")).click();
		
	//click on anywhere on the screen
	driver.findElement(By.xpath("/html/body/div[3]/div[1]")).click();
	
	//search the leads by name
	WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
	search.click();
	search.sendKeys("punit");
	
	//verify the breadcrumb 
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li[3]/h6")).click();
	
	//verify the breadcrumb 
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li[1]/h6")).click();
					
	
	
	
}
	  
 }

