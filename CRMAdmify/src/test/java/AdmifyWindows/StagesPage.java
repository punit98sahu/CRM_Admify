package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class StagesPage extends LoginPage {
  @Test
  public void AddStages() throws InterruptedException {
	  Thread.sleep(2000);
	  //click on stages tab from side menu
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[9]/div")).click();
	  Thread.sleep(2000);
	  //get the Total stages Category count
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div")).getText());
	  
	  //get the total stage category count
	  WebElement CategoryCount  = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div"));
	  System.out.println(CategoryCount.getSize());
	  System.out.println(CategoryCount.getText());
	  
	  //click on Add stage Category FAB button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[3]/div/button")).click();
	  
	  //verify the Heading of open add stages dialog box
	  WebElement AddCategoryHeading = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
	  System.out.println(AddCategoryHeading.getText());
	  String dialog = AddCategoryHeading.getText();
	  String expectedTitle = "Add New Stage Category";
	  
	  if(dialog.equals(expectedTitle)) {
		  System.out.println("stage category heading verify successfully");
		  WebElement CategoryTitle =driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div/div/input"));
		  CategoryTitle.click();
		  CategoryTitle.sendKeys("Fresh Calls");
	  }
	  //click on Add button
//	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	  //click on Cross icon
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
	
	  //click on the Add new stage icon in the stage category
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[4]/div[1]/div[1]/div/div/div[2]")).click();
	  
	  //verify heading of the dialog box then perform action
	  WebElement AddStageHeading = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
	  System.out.println(AddStageHeading.getText());
	  String dialogHeading = AddStageHeading.getText();
	  String actualString = "Add New Stage";
	  
	  if(dialogHeading.equals(actualString)) {
		  System.out.println("Stage dialog heading verify successfully");
		  WebElement StageTitle = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"));
		  StageTitle.click();
		  StageTitle.sendKeys("Not Answered");
		  
		  //click on ultimate value
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/span[2]/input")).click();
		  //click on colors
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/span[2]/input")).click();
	  }
	  //click on Add button
//	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	  
	  //click on close icon
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
	  
	  //Activate or in activate the stage category status
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[4]/div[1]/div[1]/div/div/span/span[1]/input")).click();
	  
	  //click on edit the stage category Name
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[4]/div[1]/div[1]/div/div/div[1]")).click();
	  
	  //click in the edit title input box
	  WebElement updateCategoryTitle = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/input"));
	  updateCategoryTitle.click();	
	  //to get the length storing the value in the string
	  String PreviousText = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[4]/div[1]/div[1]/div/p")).getText();
	  System.out.println(updateCategoryTitle.getText());
	  
	  Thread.sleep(2000);
	  System.out.println(PreviousText.length());
	  
	  for(int i=0; i<= PreviousText.length(); i++) {
		  updateCategoryTitle.sendKeys(Keys.BACK_SPACE);
  
	  }
	  
	  updateCategoryTitle.sendKeys("Call Status");
	  
	  //clicking on update button
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	  
	  //clicking on cross icon
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
	  
	  //Search the stages by stage Name only 
	  WebElement stageSearch = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
	  stageSearch.click();
	  String entered ="Not";
	  stageSearch.sendKeys(entered);
	  
	  //click on the filtered category to get the stage
	  WebElement stages =driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[1]/div[1]"));
	  stages.click();
	  Thread.sleep(4000);
	  
	  //get the total count of the added stages under stage category
	  List <WebElement> stagesCount = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[4]/div[2]/div/div/div/div/div/div"));
	  System.out.println(stagesCount.size());
	  
	  for(WebElement ele:stagesCount) {
		  System.out.println(ele.getText());
	  }
	  //click on filtered stage to update the stage name
	  WebElement UpdateStage = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div"));
	  UpdateStage.click();
	  Thread.sleep(2000);
	  //click on title input box to edit the stage name
	  WebElement stageValue = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/input"));
	  Actions act= new Actions(driver);
	  act.moveToElement(stageValue).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	  stageValue.sendKeys("call Not attend");
	  Thread.sleep(2000);
	  
	  //click on update button
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	  //click on close icon
//	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
	  
	  //click on search input box to clear the entered text
	  WebElement searchInput = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
	  searchInput.click();
	  Thread.sleep(2000);
	  
	  for(int i=0; i<= entered.length(); i++) {
		  searchInput.sendKeys(Keys.BACK_SPACE);
		  
	  }
	  
  }
}
