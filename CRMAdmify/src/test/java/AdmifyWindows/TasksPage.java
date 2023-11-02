package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TasksPage extends LoginPage {
  @Test (priority =1)
  public void AddTask() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  //click on Task tab in menu
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[8]/div")).click();
	  Thread.sleep(2000);
	  //Verify the Total Tasks
	  System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div")).getText());
	  
	  //click on add task button
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[4]/div/button")).click();
	  
	  //Add New Task dialog box fields
	  //click on Title input box
	  WebElement TitleInput = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"));
	  TitleInput.click();
	  TitleInput.sendKeys("Eulogik Test task-1 for dress distribution");
	  
	  //click on description input box
	  WebElement DescriptionInput = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/textarea[1]"));
	  DescriptionInput.click();
	  DescriptionInput.sendKeys("The wearing of clothing is exclusively a human characteristic and is a feature of most human societies. There has always been some "
	  		+ "disagreement among scientists on when humans began wearing clothes, but studies involving the evolution of body lice suggest it started sometime around"
	  		+ " 170,000 years ago. Anthropologists believe that animal skins and vegetation were adapted into coverings as protection from cold, heat, and rain,"
	  		+ " especially as humans migrated to new climates.");
	  
	  //click on filter icon to filter the leads adding new task
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div[2]/div/div")).click();
	  Thread.sleep(1000);
	  //Filter side menu applying filter
	  // click on courses filter
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div[2]/div[1]/div[1]/div[1]")).click();

			// click on respected course
			String courseName = "bca";
			int temp = 0;
			for (int i = 1; i < 10; i++) {
									 
				String courseList = "/html/body/div[4]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div[" + i+ "]";
				WebElement ele = driver.findElement(By.xpath(courseList));
				String name = ele.getText();
				System.out.println("course names:" + name);
				if (name.contains(courseName)) {
					System.out.println("true");
					temp = i;
					break;
				}
			}
			// click on the respected variable include or exclude button
			WebElement Course = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[" + temp
							+ "]/div/label[1]/span/input"));
			Course.click();
			Thread.sleep(2000);
			
			//click on apply button
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/button[2]")).click();
	  
	  //click on Demo dropdown
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[5]/div/div/div")).click();
	  
	  //selecting value from the demo dropdown
	  List <WebElement> DemoList = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul/li"));
	  System.out.println(DemoList.size());
	  
		String demoName = "eulogik team demo";
		for (int i = 1; i <= DemoList.size(); i++) {
		
			String Demo = "/html/body/div[4]/div[3]/ul/li[" + i + "]";
			WebElement ele1 = driver.findElement(By.xpath(Demo));

			String str = ele1.getText();
			System.out.println("got demo:" + str);
			if (str.contains(demoName)) {
				driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li["+i+"]")).click();
				System.out.println("true");
				break;
			}
		}
	  
		//click on course dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[6]/div/div/div")).click();
		//select course form dropdown 
		List <WebElement> CourseList = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul/li"));
		System.out.println(CourseList.size());
	  
		String SelectCourse = "bca";
		for(int i=1; i <=CourseList.size(); i++) {
			String list = "/html/body/div[4]/div[3]/ul/li["+i+"]";
			WebElement ele = driver.findElement(By.xpath(list));
			String Listele = ele.getText();
			
			if(Listele.contains(SelectCourse)) {
				driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li["+i+"]")).click();
				System.out.println("true");
				break;
			}
			
		}
		
		//click on add button
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
		
		//click on close button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
		
  }
		@Test (priority =2)
		public void TasksFunctionality () throws InterruptedException {
			
		//click on search filter 
			WebElement SearchBar = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div/div[1]/div/input"));
			SearchBar.click();
			String EnterText = "eulogik";
			SearchBar.sendKeys(EnterText);
		Thread.sleep(5000);
		for(int i=0; i<=EnterText.length(); i++) {
			SearchBar.sendKeys(Keys.BACK_SPACE);
		}
		
		//click on show all button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[1]/span/input")).click();
		
		//click on Analysis tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div/div/div/button[2]")).click();
		
		//verify the analysis tab
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[3]")).getText());
		
		//click on view more button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[3]/div/div/p")).click();
		Thread.sleep(5000);
		//click on statistic tab
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div/div/div/button[1]")).click();
		
		//click on pagination bar
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[3]/div/div[3]/div[2]/div/div[2]/div")).click();
		
		List <WebElement> pagination = driver.findElements(By.xpath("/html/body/div[3]/div[3]/ul/li"));
		pagination.size();
		
		for(int i=1; i<= pagination.size(); i++) {
			WebElement page = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li["+i+"]"));
			page.click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[3]/div/div[3]/div[2]/div/div[2]/div")).click();
		}
		
		
  }
}
