package AdmifyWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SettingsPage extends LoginPage {
	@Test
	public void settingProfile() throws InterruptedException {
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		// click on settings tab in side menu
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/ul/li[14]/div/div[2]")).click();
		Thread.sleep(1000);
		// get the Login profile credentials
		System.out.println(driver
				.findElement(
						By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[1]/div/div[1]/div[2]"))
				.getText());
		Thread.sleep(1000);
		// click on edit icon button to edit the profile
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[1]/div/div[2]/div"))
				.click();
		Thread.sleep(1000);

		// verify the heading of the edit profile dialog box
		WebElement EditProfile = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
		String ActualTitle = EditProfile.getText();
		String ExpectedTitle = "Edit Profile";
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("title verify successfully");
		}
		// edit the Name
		WebElement EditName = driver
				.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div/div/input"));
		EditName.click();
		act.moveToElement(EditName).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		EditName.sendKeys("Junior Admin");

		// edit the Email id
		WebElement EditEmail = driver
				.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div/input"));
		EditEmail.click();
		act.moveToElement(EditEmail).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		EditEmail.sendKeys("Junior Admin");

		// edit the moble no
		WebElement EditMobile = driver
				.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[3]/div/div/input"));
		EditMobile.click();
		act.moveToElement(EditMobile).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		EditMobile.sendKeys("7477000442");

		// click on update button
//	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();

		// click on close icon
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();

		// get the list of the fields
		List<WebElement> fieldsList = driver
				.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div"));
		fieldsList.size();
		for (WebElement ele : fieldsList) {
			System.out.println(ele.getText());
		}

		// click on Add icon to add the sub fields into the respected fields
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div"))
				.click();
		
		// verify course dialog box title
		WebElement FieldTextVerify = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2"));
		String actualTitle = FieldTextVerify.getText();
		String expectedTitle = "course";
		
		if (actualTitle.equals(expectedTitle)) {
			// Add title to add subField
			WebElement addTitle = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/input"));
			addTitle.click();
			String subField = "masscommunication";
			addTitle.sendKeys(subField);
		}
		
		// click on Add button
//	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();

		// click on cross icon
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();
		Thread.sleep(2000);
		
		//click on course list to edit 
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div")).click();
		
		// get the list of the total subFields added
		List<WebElement> SubFieldsTotal = driver.findElements(By.xpath(
				"/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div"));
		System.out.println(SubFieldsTotal.size());

		for (int i = 1; i <= SubFieldsTotal.size(); i++) {
			WebElement subfield = driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div["
							+ i + "]"));
			subfield.getText();
			Thread.sleep(1000);
			if (subfield.getText().equals("bca")) {
				driver.findElement(By.xpath(
						"//html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div["+ i + "]/div/div"))
				.click();
				
			}
		}
		System.out.println("-------yes------");
		// Clear the title input box
		WebElement Title = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/input"));
		Title.click();
		act.moveToElement(Title).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Title.sendKeys("bca");

		// click on update button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();

		// click on cross icon
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/h2/button")).click();

		// click on status button
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div/div/main/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div/div[4]/div/span/span[1]/input"))
				.click();

	}
}
