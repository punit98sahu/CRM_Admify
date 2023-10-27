package AdmifyWindows;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Referrers extends LoginPage {
	@Test
	public void AddReferrer() throws InterruptedException {
		Thread.sleep(2000);
		// click on Referrer tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[3]")).click();

		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div"))
				.getText());  	// verify the Referrer count

		// click on Add Referrer Floating action button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[4]/div/button")).click();

		// Add Referrer Dialog box
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2")).getText());
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"))
				.sendKeys("Eulogik"); // send value in input box
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input"))
				.sendKeys("Eulogik@eulogik.com"); // enter the value in the email input box
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/input"))
				.sendKeys("8602589555"); // sending the value into mobile number input box
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[4]/div/div/div")).click(); // click on
																											// gender
		// Run the loop to select gender from dropdown
		List<WebElement> gender = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul/li"));
		gender.forEach(element -> System.out.println("Text:" + element.getText()));

		for (WebElement ele : gender) {
			String genders = ele.getText();
			if (genders.contains("Male")) {
				System.out.println("This is Male");
				ele.click();
			}
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[6]/div/div/input")).sendKeys("123456"); // Click on password input box
																													 
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[7]/div/div/div")).click(); // click on upload profile pick
//		Thread.sleep(10000);																								
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click(); // click on cross icon to close 
		
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button"))
//				.click();  //click on add button 
		WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
		search.click();
		String SearchName = "1236547896";
		search.sendKeys(SearchName); // search the referrer by mobile no
		Thread.sleep(5000);
//		for(int i=0; i<=SearchName.length(); i++) {
//			search.sendKeys(Keys.BACK_SPACE);
//		}
		// click on the filtered Referrer
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div[2]/div[2]/div/div/div[1]"))
				.click();
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/nav/ol/li[3]/div"))
				.getText()); //get the Referrer leads count
		Thread.sleep(2000);
		WebElement ReferrerSearch = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div/div[1]/div/input"));
		ReferrerSearch.click(); //enter value in the search input box
		String ByName = "Raju";
		ReferrerSearch.sendKeys(ByName);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div/div[2]/button"))
				.click();  //click on filter button in Referrer detail page
		
		// Run the Filter Loop
		List<WebElement> Filterlength = driver.findElements(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div"));
		System.out.println(Filterlength.size());

		for (int i = 1; i < Filterlength.size(); i++) {
			// clicking on all the filters
			WebElement FilterLoop = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[" + i + "]/div[1]"));
			FilterLoop.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[" + i
					+ "]/div[2]/div/div/div/div/div[2]/div[1]/div/label[2]/span/input")).click();

		}
		System.out.println("successfully come out from loop");
		// click on apply button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div/div[2]/button"))
				.click();  //click on filter button in Referrer detail page
		Thread.sleep(2000);
		// click on clear all button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[1]")).click();
		System.out.println("click on clear button successfully");
		
		Actions act=new Actions(driver);  // to come out from the filter
		act.moveByOffset(50, 50);
		act.click().perform();
		
		for(int i =0; i<=ByName.length(); i++) {
			ReferrerSearch.sendKeys(Keys.BACK_SPACE);  // to clear the text in the search input box.
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div/div[3]/div/div"))
				.click(); //Filter by status dropdown
		List <WebElement> StatusDropDown = driver.findElements(By.xpath("/html/body/div[3]/div[3]/ul/li"));  
		System.out.println(StatusDropDown.size());  // running the loop to get selected the respected checkbox
		Thread.sleep(2000);
		for (int i = 1; i <= StatusDropDown.size(); i++) {
			String status = "/html/body/div[3]/div[3]/ul/li["+i+"]";
			WebElement ClickStatus = driver.findElement(By.xpath(status));
			System.out.println(ClickStatus.getText());
			if (ClickStatus.getText().contains("accepted")) {	
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li["+i+"]/span[1]/input")).click();
				System.out.println("Status selected successfully");
				break;
			}
		}
		driver.findElement(By.xpath("/html/body/div[3]/div[1]")).click(); //click anywhere on screen to make screen focused.
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/nav/ol/li[1]/h6"))
				.click();  //click on referrer breadCrumb
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
				driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div/input")).sendKeys("Email");
				
				//click on the filtered column to enable or disable
				driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/label/span[1]/span[1]/input")).click();
				
				//click on Filters in the column tab
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/button[2]")).click();
				
				//click on Name drodown in the column tab
				driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div/select")).click();
				
				//Select the value from the name dropdown column tab
				List <WebElement> NameList = driver.findElements(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div/select/option"));
				System.out.println(NameList.size());
				driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div/select/option[9]")).click();
				
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
		
				//Click on the density drodown in column tab
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/button[2]")).click();
				
				//Click on the Export drodown in the column tab
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/button[4]")).click();
				Thread.sleep(2000);
				//select the value from export dropdown
				driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]")).click();
				
		
	}
}
