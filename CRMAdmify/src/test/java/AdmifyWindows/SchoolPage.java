package AdmifyWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SchoolPage extends LoginPage {
	 Actions act = new Actions(driver);
  @Test (priority = 1)
  public void AddSchool() throws InterruptedException {
	  Thread.sleep(2000);
	  //verify the school count
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div")).getText());
	  
	  //click on Add school button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[4]/div/button")).click();
	  
	  //verify the add school dialog box
	  WebElement schools = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
	  String ActualTitle = schools.getText();
	  String ExpectedTitle = "Add School";
	  
	  if(ActualTitle.equals(ExpectedTitle)) {
		  //click on Title input box
		  WebElement Title = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"));
		  Title.click();
		  Title.sendKeys("Manipal public school");
	  }
	  //click on contact person name input box
	  WebElement contactPerson = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input"));
	  contactPerson.click();
	  contactPerson.sendKeys("moreya");
	  
	  //click on contact no
	  WebElement contactNo = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/input"));
	  contactNo.click();
	  contactNo.sendKeys("9988556644");
	  
	  //click on Add button
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	  
	  //click on cross icon
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
	  
	  //click on search input box
	  WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
	  search.click();
	  String schoolTitle = "kv2";
	  search.sendKeys(schoolTitle);
	  
	  //click on Edit school icon
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div[6]/div")).click();
	  
  }
  
 @Test(priority = 2)
 public void EditSchool() throws InterruptedException {
	 Thread.sleep(2000);
	 
	 //verify dialog box
	 WebElement EditSchoolTitle = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
	 String ActualTitle = EditSchoolTitle.getText();
	 String ExpectedTitle = "Edit School";
	 if(ActualTitle.equals(ExpectedTitle)) {
		 WebElement Title = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"));
		 Title.click();
		 act.moveToElement(Title).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		 Title.sendKeys("KV2");
	 }
	 //click on contact person name input box
	 WebElement contactPerson = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input"));
	 contactPerson.click();
	 act.moveToElement(contactPerson).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	 contactPerson.sendKeys("rajendra");
	 
	 //click on contact no input box
	 WebElement contactNo = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/input"));
	 contactNo.click();
	 act.moveToElement(contactNo).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	 contactNo.sendKeys("1234567890");
	 
	 //click on update button
	 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	 
	 //click on cross icon
	 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
	 
	 //click on status button
	 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div[7]/span/span[1]/input")).click();
	 
	 
 }
 
 	
  
}
