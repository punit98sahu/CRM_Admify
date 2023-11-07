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
			  selectGender.size();
			  for(int i=1; i<= selectGender.size(); i++) {
				  
			  }

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
		  
		  
		  
		  
		  
	  
  }
}
