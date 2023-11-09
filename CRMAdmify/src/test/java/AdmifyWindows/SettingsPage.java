package AdmifyWindows;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SettingsPage extends LoginPage {
  @Test
  public void settingProfile() throws InterruptedException {
	  Thread.sleep(2000);
	  //click on settings tab in side menu
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[14]/div/div[2]")).click();
	  
	  //get the Login profile credentials
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[1]/div/div[1]/div[2]")).getText());
	  
	  //click on edit icon button to edit the profile 
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[1]/div/div[2]/div")).click();
	  
	  //get the list of the fields
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[1]")).getText());
	  
	  
	  
  }
}
