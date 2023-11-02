package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Documents extends LoginPage {
  @Test
  public void CreateDocument() throws InterruptedException {
	  Thread.sleep(2000);
	  //click on the document tab
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[5]/div/div[2]/span")).click();
	  Thread.sleep(1000);
	  //verify the total document count
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li")).getText());
	  Thread.sleep(1000);
	  //click on add document button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[3]/div[3]/div/button")).click();	  
	  System.out.println("click on add document button");
	  //click on Title input box in Add Document dialog box
	  WebElement Title = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"));
	  Title.click();
	  Title.sendKeys("Car pick Document");
	  //click on upload icon to upload the document
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/div")).click();
	  Thread.sleep(10000);
	  //click on cross icon button
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
	  //click on add button
//	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	  
	  //To get the text of the document created successfully.
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]")).getText());	  
	  System.out.println("-------------------successffull---------------------");
	  //click on Action button to enable the added document
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[7]/div/span/span[1]")).click();
	  //click on show all action button to see all the added document
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[1]/span/input")).click();
	  
	  //click on the search input box
	  WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
	  search.click();
	  String SearchName = "car";
	  search.sendKeys(SearchName);
	  Thread.sleep(2000);
	  
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
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div/input")).sendKeys("Role");
		
		//click on the filtered column to enable or disable
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/label/span[1]/span[1]/input")).click();
		
		//click on Filters in the column tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/button[2]")).click();
		
		//click on Title drodown in the column tab
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div/select")).click();
		
		//Select the value from the name dropdown column tab
		List <WebElement> TitleList = driver.findElements(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div/select/option"));
		System.out.println(TitleList.size());
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div/select/option[5]")).click();
		
		//select the value from the contains dropdown column tab
		List <WebElement> ContainLists = driver.findElements(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[4]/div/select/option"));
		System.out.println(ContainLists.size());
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[4]/div/select/option[2]")).click();
		
		//enter the text in the search input field in column tab
		WebElement Text = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[5]/div/div/input"));
		Text.click();
		Text.sendKeys("admin");
		
		//click on cross icon after filter data
		WebElement DoubleClick = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[1]/button"));
		Actions a = new Actions(driver);
		a.doubleClick(DoubleClick).build().perform();
		System.out.println("Double click successfully");

		//Click on the density drodown in column tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/button[2]")).click();
		
		//Click on the Export drodown in the column tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/button[4]")).click();
		Thread.sleep(2000);
		//select the value from export dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]")).click();
		
		for(int i=1; i<=SearchName.length(); i++) {
			search.sendKeys(Keys.BACK_SPACE);
		}

  }
}
