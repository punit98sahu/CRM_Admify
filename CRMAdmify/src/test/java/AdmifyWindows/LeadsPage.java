package AdmifyWindows;

//import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LeadsPage extends LoginPage {
//public class LeadsPage extends Dashboard {

	@Test(priority = 1)
	public void AddLeads() throws InterruptedException {
		// driver.manage().window().maximize();
		System.out.println("Start leads page");
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

		// click on Add Leads FAB
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement AddLead = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[4]/div[1]/div[1]/div/div/button"));
		act.moveToElement(AddLead).click().perform();
		act.click().build().perform();

		// click on add Lead icon
		driver.findElement(By.xpath("//*[@id=\"SpeedDialbasicexample-actions\"]/button[1]")).click();

	}

	@Test(priority = 2)
	public void AddLeadForm() throws InterruptedException {
		// click on name input box
		WebElement NameInput = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[1]/div/div/input"));
		NameInput.click();
		NameInput.sendKeys("punit sahu");

		// click on gender drop down
		driver.findElement(By.xpath("//*[@id=\"demo-simple-select\"]")).click();

		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul"));

		for (WebElement element : list) {
			System.out.println(element.getText());

			// element.getAccessibleName();
			if (element.getText().equals(String.valueOf(1)));
			element.click();

			System.out.println("Found");
		}
		// click on email
		WebElement email = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[4]/div/div/input"));
		email.click();
		email.sendKeys("punit98ps@eulogik.com");

		// click on contact number 1 input box
		WebElement contact1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[5]/div/div/input"));
		contact1.click();
		contact1.sendKeys("9988776655");

		// click on contact number 2 input box
		WebElement contact2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[6]/div/div/input"));
		contact2.click();
		contact2.sendKeys("8899776655");

		// click on whatsapp number input box
		WebElement whatsapp = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[7]/div/div/input"));
		whatsapp.click();
		whatsapp.sendKeys("9988776655");

		// click on class drop down
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[8]/div/div/div")).click();

		List<WebElement> classes = driver.findElements(By.xpath("/html/body/div[4]/div[3]"));

		for (WebElement element : classes) {
			System.out.println(element.getText());

			// element.getAccessibleName();
			if (element.getText().equals(String.valueOf(4)));
			element.click();

			System.out.println("classs selected");
		}
		// click on country dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[9]/div/div/div")).click();
		// Select country from dropdown
		List<WebElement> country = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : country) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(2)));
			element.click();
			System.out.println("country selected");

		}

		// click on state dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[10]/div/div/div")).click();
		// selecting state from dropdown
		List<WebElement> state = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : state) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(3)));
			element.click();
			System.out.println("state selected");
		}

		// click on city input box
		WebElement city = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[11]/div/div/input"));
		city.click();
		city.sendKeys("bhopal");

		// click on Referrer dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[12]/div/div/div")).click();
		// selecting value from dropdown
		List<WebElement> State = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : State) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(3)));
			element.click();
			System.out.println("Referrer selected");
		}
		// click on Address input box
		WebElement address = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[13]/div/div/input"));
		address.click();
		address.sendKeys("Eulogik zone 2 mp nagar bhopal");

		// click on course dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[14]/div/div/div")).click();
		// click on course dropdown
		List<WebElement> course = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : course) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(3)));
			element.click();
			System.out.println("Course selected");
		}

		// click on previous class marks%
		WebElement previousMarks = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[15]/div/div/input"));
		previousMarks.click();
		previousMarks.sendKeys("98.00");

		// click on zipcode input box
		WebElement zipcode = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[16]/div/div/input"));
		zipcode.click();
		zipcode.sendKeys("223344");

		// click on Board dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[17]/div/div/div")).click();
		// select value from dropdown
		List<WebElement> board = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : board) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(4)));
			element.click();
			System.out.println("board selected");
		}

		// click on medium dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[18]/div/div/div")).click();
		// click on medium dropdown
		List<WebElement> medium = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : medium) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(4)));
			element.click();
			System.out.println("medium selected");
		}

		// click on stream dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[19]/div/div/div")).click();
		// click on stream dropdown
		List<WebElement> stream = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : stream) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(4)));
			element.click();
			System.out.println("stream selected");
		}

		// click on school dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[20]/div/div/div")).click();
		// click on school dropdown
		List<WebElement> school = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : school) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(3)));
			element.click();
			System.out.println("School selected");
		}

		// click on source dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[21]/div/div/div")).click();
		// click on source dropdown
		List<WebElement> source = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : source) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(4)));
			element.click();
			System.out.println("stream selected");
		}

		// click on Session dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[22]/div/div/div")).click();
		// click on Session drodown
		List<WebElement> Session = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : Session) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(3)));
			element.click();
			System.out.println("session selected");
		}

		// click on father name input box
		WebElement fatherName = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[23]/div/div/input"));
		fatherName.click();
		fatherName.sendKeys("Father");

		// click on fathers occupation
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[24]/div/div/div")).click();
		// click on fathers occupation dropdown
		List<WebElement> FatherOccupation = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : FatherOccupation) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(3)));
			element.click();
			System.out.println("farther occupation selected");
		}
		// click on Mothers name
		WebElement mothername = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[25]/div/div/input"));
		mothername.click();
		mothername.sendKeys("Mother");

		// click on mothers occupation dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[26]/div/div/div")).click();
		// click on Mothers occupation dropdown
		List<WebElement> motherOccupation = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		for (WebElement element : motherOccupation) {
			System.out.println(element.getText());
			if (element.getText().equals(String.valueOf(4)));
			element.click();
			System.out.println("mothers occupation selected");
		}

		// click on parents contact no
		WebElement ParentContact = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[27]/div/div/input"));
		ParentContact.click();
		ParentContact.sendKeys("4455678998");

		// click on groups dropdown
		driver.findElement(By.xpath("//*[@id=\"demo-multiple-checkbox\"]")).click();
		// click on groups dropdown
		List<WebElement> group_list = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul"));
		group_list.size();

		String groupName = "free open group just to test the add leads to this group";
		int temp = 0;
		for (int i = 1; i < 5; i++) {

			// System.out.println("call"+ i);
			String group = "/html/body/div[4]/div[3]/ul/li[" + i + "]/div/span";
			WebElement ele1 = driver.findElement(By.xpath(group));
			// ele1.getText();
			String str = ele1.getText();
			System.out.println("got group:" + str);
			if (str.contains(groupName)) {
				System.out.println("true");
				temp = i;
				break;
			}
		}

		String group = "/html/body/div[4]/div[3]/ul/li[" + temp + "]/span[1]/input";
		WebElement ele1 = driver.findElement(By.xpath(group));
		ele1.click();

		Actions act = new Actions(driver);
		act.moveByOffset(50, 50);
		act.click().perform();

		// click on cross icon
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();

		// click on Add button
//		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]")).click();

		// click on add lead FAB icon
		Thread.sleep(2000);
		Actions act1 = new Actions(driver);
		WebElement AddLead1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[4]/div[1]/div[1]/div/div/button"));
		act1.moveToElement(AddLead1).click().perform();
		act1.click().build().perform();

		// click on add bulk leads button
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/main/div/div/div[4]/div/div/div/div/div/button[2]")).click();

		// click on upload button
		driver.findElement(By.cssSelector("body > div.MuiDialog-root.MuiModal-root.css-74waha > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > "
						+ "div > div.MuiDialogContent-root.MuiDialogContent-dividers.css-1r09u4m > div > div.MuiGrid2-root.MuiGrid2-direction-xs-row.MuiGrid2-grid-xs-12.css-ipi2ni >"
						+ " div.MuiFormControl-root.MuiFormControl-fullWidth.MuiTextField-root.css-feqhe6 > div > div > svg")).click();
		Thread.sleep(10000);

		// click on download csv button
//		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/p")).click();

		// click on Add button of add bulk leads
//		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();

		// click on Close button of add bulk leads
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();

		// click on search input box
		WebElement searchInputBox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div[1]/div/div[1]/div/input"));
		searchInputBox.click();
		String name = "rajiv";
		searchInputBox.sendKeys(name);

		for (int i = 0; i <= name.length(); i++) {

			searchInputBox.sendKeys(Keys.BACK_SPACE);
		}

		Actions click = new Actions(driver);
		click.moveByOffset(50, 50);
		click.click().perform();

	}

	@Test(priority = 3)
	public void Filter() throws InterruptedException {
		// applying filter
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/div[1]/div/div[2]/button")).click();

		// click on courses filter
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/div[1]/div[1]")).click();

		// click on respected course
		String courseName = "bca";
		int temp = 0;
		for (int i = 1; i < 10; i++) {

			String courseList = "/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div[" + i+ "]";
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
		WebElement Course = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[" + temp
						+ "]/div/label[1]/span/input"));
		Course.click();
		Thread.sleep(2000);

		// click on apply button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();
		System.out.println("Test Print");

		// To check the text on filter button
		WebElement FilterText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/div[1]/div/div[3]/button"));
		System.out.println(FilterText.getText());

		// click on clear all button
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[1]")).click();

		// click on filter to run the loop
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/div[1]/div/div[3]/button")).click();
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
		// click on apply button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();

	}

	@Test(priority = 4)
	public void AddGroup() throws InterruptedException {
		System.out.println("lead ading to group");
		
		// click on Add to group button After adding filter
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div[1]/div/div[2]/div[1]/button")).click();
		// click on Add to existing group dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[2]/div/div/div")).click();
		// selecting the existing group
		List<WebElement> ExistingGroup = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul/li"));
		System.out.println(ExistingGroup.size());

		String GroupName = "free open group just to test the add leads to this group";
		int temp1 = 0;
		for (int i = 1; i <= ExistingGroup.size(); i++) {
			System.out.print(i);
			String group1 = "/html/body/div[4]/div[3]/ul/li[" + i + "]";
			WebElement ele1 = driver.findElement(By.xpath(group1));

			String str = ele1.getText();
			System.out.println("got group:" + str);
			if (str.contains(GroupName)) {
				System.out.println("true");
				temp1 = i;
				break;
			}
		}
		// click on respected group
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[" + temp1 + "]")).click();
		Thread.sleep(2000);

		// click on Save button to add the leads into the group
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();

		// click on Add to group button After adding filter
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div[1]/div/div[2]/div[1]/button")).click();
//		System.out.println("click on add to group button successfully");
//		
//		//enter group name input box
//		WebElement EnterName = driver.findElement(By.xpath("//input[@id=':rep:']"));
//		EnterName.click();
//		EnterName.sendKeys("msg for upgrade plan discount for the existing student");

		// click on save button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
		System.out.println("clicked on save button");
		// click on close button
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();

		// click on create task to add the filtered lead into task
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div[1]/div/div[2]/div[2]/button")).click();

		// Add leads into task click on Title input box
		WebElement TaskTitle = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input"));
		TaskTitle.click();
		TaskTitle.sendKeys("leads with upgraded plans");

		// click on Description input box
		WebElement DescriptionInput = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/input"));
		DescriptionInput.click();
		DescriptionInput.sendKeys("This is the description of the task");

		// click on select Demo dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[4]/div/div/div")).click();
		// select the value from demo dropdown
		List<WebElement> DemoDropdown = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul/li"));
		System.out.println(DemoDropdown.size());

		for (int i = 1; i <= DemoDropdown.size(); i++) {
			System.out.println(i);
			String allDemo = "/html/body/div[4]/div[3]/ul/li[" + i + "]";
			WebElement demo = driver.findElement(By.xpath(allDemo));
			if (demo.getText().contains("Course demo")) {
				driver.findElement(By.xpath(allDemo)).click();
				System.out.println("get in the loop successfully");
				break;
			}
		}

		// click on select course dropdown
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[5]/div/div/div")).click();
		// selecting value from course dropdown
		List<WebElement> course = driver.findElements(By.xpath("/html/body/div[4]/div[3]/ul/li"));
		System.out.println(course.size());
		for (int i = 1; i <= course.size(); i++) {
			String ListCourse = "/html/body/div[4]/div[3]/ul/li[" + i + "]";
			WebElement ClickCourse = driver.findElement(By.xpath(ListCourse));
			if (ClickCourse.getText().contains("heooo")) {
				driver.findElement(By.xpath(ListCourse)).click();
				System.out.println("course selected successfully");
				break;
			}
		}
		// click on Add button
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
		// click on close button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
		Thread.sleep(2000);

		// click on pagination bar select page dropdown
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div")).click();
		// Run loop to select page size
		
		List<WebElement> Pagination = driver.findElements(By.xpath("/html/body/div[3]/div[3]/ul/li"));
		System.out.println(Pagination.size());
//		for(WebElement ele:Pagination) {
//			Iterator <WebElement> r = Pagination.iterator();
//			Thread.sleep(2000);
//			ele.click();
//			Thread.sleep(2000);
//			//click on pagination bar select page dropdown
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div")).click();
//			r.next();
//		    }	

		for (int i = 1; i <= Pagination.size(); i++) {
			WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[" + i + "]"));
			System.out.println("Pagination" + ele.getText());
			Thread.sleep(2000);
			ele.click();
			// click on pagination bar select page dropdown
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div")).click();

		}
		
		//click anywhere on the screen
		driver.findElement(By.xpath("/html/body/div[3]/div[1]")).click();
		
		//click on Filter button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[1]/div[1]/div/div[3]/button")).click();
		//click on clear button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[1]")).click();
		
		//click anywhere on the screen
		driver.findElement(By.xpath("/html/body/div[3]/div[1]")).click();
		
		Thread.sleep(2000);
		// click on pagination next button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		// click on pagination previous button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/button[1]")).click();

	}
}