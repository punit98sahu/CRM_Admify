package AdmifyWindows;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LeadsPage extends LoginPage {

	@Test
	public void AddLeads() throws InterruptedException {
		// driver.manage().window().maximize();
		// Clicking on Leads tab in menu
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[2]")).click();

//	  //get the number of column in the table.
//	  
//	  Actions act = new Actions(driver);
//	  WebElement horizontal_scroll = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]"));
//	  //act.clickAndHold(horizontal_scroll).moveByOffset(300, 0).release().perform();
//	  Thread.sleep(4000);
//	  act.keyDown(Keys.SHIFT).moveByOffset(400, 0).release().perform();
//	  
//	  Thread.sleep(2000);
//	  WebElement columns =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[1]/div"));
//	  String Allcolumns = columns.getText();
//	  System.out.println(Allcolumns);

		//click on Add Leads FAB
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement AddLead = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[4]/div[1]/div[1]/div/div/button"));
		act.moveToElement(AddLead).click().perform();
	    act.click().build().perform();

	    //click on add Lead icon
		driver.findElement(By.xpath("//*[@id=\"SpeedDialbasicexample-actions\"]/button[1]")).click();
		
	}
	
	@Test (priority = 2)
	public void AddLeadForm() {
		//click on name input box
		WebElement NameInput = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[1]/div/div/input"));
		NameInput.click();
		NameInput.sendKeys("punit sahu");
		
		//click on gender drop down
		driver.findElement(By.xpath("//*[@id=\"demo-simple-select\"]")).click();
		
		List <WebElement> list =driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul")); 
		
		for (WebElement element : list) {
			System.out.println(element.getText());
			
			//element.getAccessibleName();
			if(element.getText().equals(String.valueOf(1)));
			element.click();
			
			System.out.println("Found");	
		}
		// click on email
		WebElement email= driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[4]/div/div/input"));
		email.click();
		email.sendKeys("punit98ps@eulogik.com");
		
		//click on contact number 1 input box
		WebElement contact1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[5]/div/div/input"));
		contact1.click();
		contact1.sendKeys("9988776655");
		
		//click on contact number 2 input box
		WebElement contact2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[6]/div/div/input"));
		contact2.click();
		contact2.sendKeys("8899776655");
		
		//click on whatsapp number input box
		WebElement whatsapp = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[7]/div/div/input"));
		whatsapp.click();
		whatsapp.sendKeys("9988776655");
		
		//click on class drop down
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[8]/div/div/div")).click();
		
		List <WebElement> classes =driver.findElements(By.xpath("/html/body/div[4]/div[3]"));
		
		
		}
	}
	

