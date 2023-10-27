package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Groups extends LoginPage {
	@Test
	public void CreateGroups() throws InterruptedException {
		Thread.sleep(2000);
		// click on the group tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[4]/div")).click();
		Thread.sleep(2000);
		// get the total group count
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div"))
						.getText());
		// click on the add group button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[4]/div/button")).click();
		// enter the value in the title input box
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/input"))
				.sendKeys("Team eulogik employees");
		Thread.sleep(2000);
		// click on the close button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
		// click on the add button
//	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
		// get the total groups count and there name
		List<WebElement> GroupCount = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div"));
		System.out.println(GroupCount.size());
		for (WebElement ele : GroupCount) {
			System.out.println(ele.getText());
			System.out.println();
		}
		Thread.sleep(2000);
		// search the group by text
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"))
				.sendKeys("new g1");
		Thread.sleep(1000);
		// click on the filtered group to add more leads into group
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div/div/div")).click();
	}

	@Test(priority = 2)
	public void GroupDetailPage() throws InterruptedException {
		Thread.sleep(4000);
		// get the total leads in the group
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li[3]"))
						.getText());
		// click on add more leads button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/button")).click();
		// click on filter button on add more leads page
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[2]/button"))
				.click();
		//Get the filter count 
		List <WebElement> TotalFilters = driver.findElements(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div"));
		System.out.println(TotalFilters.size());
		
		//selecting value form the filter side nav bar
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]")).click();
		
		
		
		
		
		
		
		
	}
}
