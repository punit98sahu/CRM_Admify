package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demos extends LoginPage{
  @Test
  public void CreateDemo() throws InterruptedException {
	  Thread.sleep(1000);
	  //click on Demo in the menu tab
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[7]/div/div[2]")).click();
	  //Get the Total Demo count
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div")).getText());
	  //Click on the Add Demo button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[3]/div/button")).click();
	  Thread.sleep(1000);
	  //Click in Title input box
	  WebElement Title = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"));
	  Title.click();
	  String SendValue = "Demo for bca students, compulsory attend it";
	  Title.sendKeys(SendValue);
	  
	  //click in the description input box
	  WebElement Description = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/textarea[1]"));
	  Description.click();
	  String SendDescription = "Hi we are the APT Family wellcomes you to join our organization and we will help you to acchieve it";
	  Description.sendKeys(SendDescription);
	  
	  //click in the Enter Demo url
	  WebElement BaseUrl = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/input"));
	  BaseUrl.click();
	  String SendBaseUrl = "http://192.168.1.38:1100/super-admin/";
	  BaseUrl.sendKeys(SendBaseUrl);
	  
	  //click on Add button
//	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	  
	  //click on close icon
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
	  
	  //click on search input box
	  WebElement Search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
	  Search.click();
	  String SearchValue= "eulogik";
	  Search.sendKeys(SearchValue);
	  Thread.sleep(4000);
	  
	  //click on show all button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[1]/span/input")).click();
	  //Click on the Edit action button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[7]/div/button")).click();
	  Thread.sleep(1000);
	  //click on update button 
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	  Thread.sleep(1000);
	  //Click on filtered demo
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]")).click();
	  Thread.sleep(1000);
	  //verify the demo detail window with the Task count the demo include in
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li[3]/div")).getText());
	  Thread.sleep(1000);
	  //click on Demo detail search input
	  WebElement DemoDetailSearch = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
	  DemoDetailSearch.click();
	  String DemoSearch = "eulogik";
	  DemoDetailSearch.sendKeys(DemoSearch);
	  Thread.sleep(4000);
	  DemoDetailSearch.clear();
	  Thread.sleep(1000);
	  
	  //click on the Demo breadcrumb 
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li[1]/h6")).click();
	  Thread.sleep(1000);
   	  //Click on top demo
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]")).click();
	  Thread.sleep(1000);
	  //Click on the tasks inside the Demo
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div")).click();
	  Thread.sleep(1000);
	  //click on Demo in the menu tab again to redirect to the respected page
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[7]/div/div[2]")).click();
	  Thread.sleep(1000);
	  
	//click on column button tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/button[1]")).click();
		
		//click on hide all button
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/button[1]")).click();
		System.out.println("click on hide all button successfully");
		//click on show all button
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/button[2]")).click();
		System.out.println("click on show all button successfully");
		//Find all the list of the column 
		List <WebElement> ColumnList = driver.findElements(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div"));
		ColumnList.forEach(element-> System.out.println("Text:"+ element.getText()));
		
		//click on search field in the column tab
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div/input")).sendKeys("ACTION");
		
		//click on the filtered column to enable or disable
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/label/span[1]/span[1]/input")).click();
		
		//click on Filters in the column tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/button[2]")).click();
		
		//click on Name drodown in the column tab
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div/select")).click();
		
		//Select the value from the name dropdown column tab
		List <WebElement> NameList = driver.findElements(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div/select/option"));
		System.out.println(NameList.size());
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div/select/option[9]")).click();  //error
		
		//select the value from the contains dropdown column tab
		List <WebElement> ContainLists = driver.findElements(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[4]/div/select/option"));
		System.out.println(ContainLists.size());
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[4]/div/select/option[2]")).click();
		
		//enter the text in the search input field in column tab
		WebElement Text = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[5]/div/div/input"));
		Text.click();
		Text.sendKeys("hindi");
		
		//click on cross icon after filter data
		WebElement DoubleClick = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[1]/button"));
		Actions a = new Actions(driver);
		a.doubleClick(DoubleClick).build().perform();
		System.out.println("Double click successfully");

		

  	}
	  
	  
}

