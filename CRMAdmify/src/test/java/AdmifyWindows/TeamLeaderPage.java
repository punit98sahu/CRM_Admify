package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TeamLeaderPage extends LoginPage{
  @Test
  public void TeamLeaderFields() throws InterruptedException {
	  Thread.sleep(2000);
	  //click on TeamLeadre Tab in side menu
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[10]/div")).click();
	  
	  //get the Total TeamLeader count
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div")).getText());
	  
	  //click on search input box
	  WebElement search =driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
	  search.click();
	  Thread.sleep(2000);
	  String TeamleaderName = "punit";
	  search.sendKeys(TeamleaderName);
	  search.clear();	// clear the enterd search text
	  
	  // click on show all button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[1]/span/input")).click();
	  
  }
	  @Test (priority= 2)
	  public void AddTeamLeader() throws InterruptedException {
		  Thread.sleep(2000);
		  //click on Add TeameLeader FAB button
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[4]/div/button")).click();
		  
		  //Verify the Add Teamleader dialog box title
		  WebElement DialogTitle = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
		  System.out.println(DialogTitle.getText());
		  String actualTitle = DialogTitle.getText();
		  String expectedTitle = "Add Team Leader";
		  
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
			  List <WebElement> selectGender = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
			  selectGender.forEach(element -> System.out.println("Text: " + element.getText()));
			  
			  System.out.println("--------------------------------------------");
//			  for(WebElement Gender : selectGender) {
//				  String ListGender =  Gender.getText();
//				  if(ListGender.contains("Male")) {
//					  Gender.click();
//				  }
//			  }  
			  for(int i=1; i<=selectGender.size(); i++) {
				  String List = "/html/body/div[4]/div[3]/ul["+i+"]";
				  WebElement GenderList = driver.findElement(By.xpath(List));  
				  if(GenderList.getText().contains("Male")) {
					  GenderList.click();
				  }
			  }
			  
			  System.out.println("--------------------------------------------");
			  //click on password input box
			  WebElement password =driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[6]/div/div/input"));
			  password.click();
			  password.sendKeys("123456");
			  
			  //click on upload photo icon
			  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[7]/div/div/div")).click();
			  Thread.sleep(5000);
		  
		  }
		  
		  //click on Add button
//		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
		  //click on close icon button
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
		 
		  //click on the filtered leads
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]")).click();
		  
		  //Refresh window
		  driver.navigate().refresh();

  }
	  @Test(priority = 3)
	  public void TeamLeaderTasks() throws InterruptedException {
		  Thread.sleep(4000);
		  //verify the Total tasks count for respected teamleader
		  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li[3]/div")).getText());
		  
		  //get the total list count of the tasks
		  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div")).getSize());
		  
		  //search the task
		  WebElement Search =driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
		  Search.click();
		  Search.sendKeys("Task");
		  Thread.sleep(4000);
		  
		  //click on the filtered task
		  List <WebElement> FilteredTask = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div"));
		  for(WebElement SearchTask : FilteredTask) {
			  System.out.println(SearchTask.getText());
			  
			  for(int i=1; i<= FilteredTask.size(); i++) {
				  String ele = "/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div["+i+"]/div[1]/div";
				  				
			  if(SearchTask.getText().equals("Task 2")) {
				  driver.findElement(By.xpath(ele)).click();
			  }
		  }
		  }
//		  for(int i=1; i<=FilteredTask.size(); i++) {
//		  String ele = "/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div["+i+"]/div[1]/div";
//		  if(FilteredTask.contains("Task")) {
//		  driver.findElement(By.xpath(ele)).click();
//		  
//		  
//		  }
//		  
//	  }
	  
  
	  
	  
	  }
}
