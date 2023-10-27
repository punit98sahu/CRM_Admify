package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InvalidLeads extends LoginPage {
	@Test
	public void InValidLeads() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Start Invalid leads page");
		// click on side arrow to close the side menu nav bar
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/button")).click();

		// click on menu icon
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/header/div[1]/div[1]/button")).click();

		// click on Leads tab on side menu
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[2]/div")).click();
		Thread.sleep(2000);
		// click on Invalid Leads button on leads page
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div[1]/div/span[2]/button")).click();
		Thread.sleep(2000);
		// verifying the invalid leads count
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/div/nav/ol/li[3]/div/p"));
		System.out.println("invlaid leads count:" + ele.getText());

		// click on show all check box
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div[1]/span/input")).click();

		// click on search bar input box
		WebElement Search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div/div[1]/div/input"));
		Search.click();
		String name = "rajiv";
		Search.sendKeys(name);

		for (int i = 0; i <= name.length(); i++) {

			Search.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(1000);

		// click on filter and apply filter
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/div/div/div[2]/button")).click();

		// click on courses filter
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/div[1]/div[1]")).click();

		// click on respected course
		String courseName = "bca";
		int temp = 0;
		for (int i = 1; i < 10; i++) {

			String courseList = "/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div[" + i+ "]";
			WebElement ele1 = driver.findElement(By.xpath(courseList));
			String name1 = ele1.getText();
			System.out.println("course names:" + name1);
			if (name1.contains(courseName)) {
				System.out.println("true");
				temp = i;
				break;
			}
		}
		// click on the respected variable include or exclude button
		WebElement Course = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[" + temp
						+ "]/div/label[1]/span/input"));
		Course.click();

		// click on apply button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();
		System.out.println("Test Print");

		// click on clear all button
		//driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[1]")).click();
		Thread.sleep(2000);
		// click on filter to run the loop
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/div/div/div[2]/button")).click();
		Thread.sleep(2000);
		System.out.println("select filter button successfully");

		// Run the Filter Loop

		List<WebElement> Filterlength = driver.findElements(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div"));
		System.out.println(Filterlength.size());

		for (int i = 1; i < Filterlength.size(); i++) {
			// clicking on all the filters
			WebElement FilterLoop = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[" + i + "]/div[1]"));
			FilterLoop.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[" + i
					+ "]/div[2]/div/div/div/div/div[2]/div[1]/div/label[1]/span/input")).click();

		}
		System.out.println("successfully come out from loop");
		// Date filter can NOT be locate as the calendar is NOT intractable in future
		// component change add the script here.

		// Copy and Paste filter icons as the locators are NOT accurate and other are
		// NOT interactable
		// so unable to automate them in future if component change add the script here.

		// click on apply button
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();
		Thread.sleep(1000);
		// click on clear all button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[1]")).click();
		System.out.println("click on clear button successfully");

		//click anywhere on the screen
		driver.findElement(By.xpath("/html/body/div[3]/div[1]")).click();

		// Test the pagination bar click on pagination bar select page dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div")).click();

		// Run loop to select page size
		List<WebElement> Pagination = driver.findElements(By.xpath("/html/body/div[3]/div[3]/ul/li"));
		System.out.println(Pagination.size());

		for (int i = 1; i <= Pagination.size(); i++) {
			WebElement ele1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[" + i + "]"));
			System.out.println("Pagination" + ele1.getText());
			Thread.sleep(1000);
			ele1.click();
			// click on pagination bar select page dropdown
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div")).click();

		}
		//click anywhere on the screen
		driver.findElement(By.xpath("/html/body/div[3]/div[1]")).click();
		
		Thread.sleep(1000);
		// click on pagination next button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		// click on pagination previous button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/button[1]")).click();
		
	
	}
	
	@Test (priority=2)
	public void EditInvalidLeads() throws InterruptedException {
		//click on webElement to edit the invalid lead data
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]")).click();
		Thread.sleep(2000);
		
		//click on close button of the edit leads dialog box
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
		
		//click on update button
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
	
		//click on check box to refresh lead
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/span/input")).click();
		Thread.sleep(1000);
		//click on Refresh button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div/span/button")).click();
		
		//click on leads bread Crumb
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/nav/ol/li[1]/h6")).click();
		
		//click on column button tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[1]/button[1]")).click();
		
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[1]/button[2]")).click();
		
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
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[1]/button[3]")).click();
		
		//Click on the Export drodown in the column tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[1]/button[4]")).click();
		Thread.sleep(2000);
		//select the value from export dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]")).click();
		System.out.println("-----successfull-------");
	}	
	
}
