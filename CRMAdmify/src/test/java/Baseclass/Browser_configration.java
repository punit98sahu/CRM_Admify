package Baseclass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_configration {
	public static WebDriver driver;
	public static Properties prop =new Properties();
	public static FileReader frbrowser;
	
	  @BeforeSuite
	  public void beforeMethod() throws IOException {
		
		if(driver==null) {
			frbrowser=new FileReader(System.getProperty("user.dir")+"/src/test/resources/Config.Properties/Browser.prop");
			prop.load(frbrowser);
		}
	//to initialize the chrome 
	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://139.59.34.177:4200/");
	}
	else{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("http://139.59.34.177:4200/");
	}
	}
	  @AfterSuite
	  public void afterMethod() {
	  }

}
