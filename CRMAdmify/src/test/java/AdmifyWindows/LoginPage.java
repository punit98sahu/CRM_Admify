package AdmifyWindows;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import Baseclass.Browser_configration;
import Utilitiy.WaitUtility;

public class LoginPage extends Browser_configration{
	
  @BeforeTest
  
  public static void Login() {
	  
	  WaitUtility wait=new WaitUtility(driver);
	  wait.pageLoadWait(2);
	  //enter value into email input box
	  driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div[2]/div[2]/div[1]/div/input")).sendKeys("admin@gmail.com");
	  //enter password into password input box
	  driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/input")).sendKeys("123456");
	  //click on Login button
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div[2]/button")).click();
 
  }
	  
}