package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaffPage extends LoginPage {
  @Test
  public void AddStaff() throws InterruptedException {
	  
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
	  
	  
  }

