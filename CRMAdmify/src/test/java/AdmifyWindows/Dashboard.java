package AdmifyWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dashboard extends LoginPage {
	 @Test (priority = 1)
	  public void DashBoard() throws InterruptedException {
	      Thread.sleep(2000);
	      
	      //Active Referrer on Dashboard      
	      WebElement ele=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/div/div[1]/div[1]"));
	      String referrer = ele.getText();
	      System.out.println("Referrer: "+referrer);
	      
	      //Total Referrer count on dashboard      
	      WebElement TotalReferrer = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/div/div[2]/div[1]/p[2]"));
	      String DashboardReferrer = TotalReferrer.getText();
	      System.out.println("Dashboard total referrer count:" + DashboardReferrer);
	      
	      //checking total referrer on Referrer window.      
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[3]/div/div[2]")).click();
	      Thread.sleep(4000);
	      WebElement referrerCount = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div"));
	      String ReferrerOnReferrer = referrerCount.getText();
	      System.out.println(ReferrerOnReferrer);
	      
//	      Thread.sleep(2000);
//	      //total active referrer
//	      List <WebElement> referrer1 = driver.findElements(By.className("MuiButtonBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary Mui-checked "
//	      		+ "PrivateSwitchBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary Mui-checked Mui-checked css-1nr2wod"));
//	      System.out.println("this is total active referrer count:" + referrer1);
	      
	  
	      //To trim the Referrer count to verify count.
	      Thread.sleep(4000);
	      String str= ReferrerOnReferrer.substring(11, 13);
	      
	      System.out.println("Referrer page total Referrer count:" + str);
	      
	      if(DashboardReferrer.equals(str)) {
	          System.out.println("Total Referrer count is verified");
	      }
	      else {
	          System.out.println("Total Referrer count is invalid");
	      }
	  }
	  @Test (priority = 2)
	  public void DashboardLeadsCount() throws InterruptedException{	

	      //click on Dashboard tab      
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[1]/div")).click();
	      Thread.sleep(2000);
	      
	      //Active TL count on Dashboard     
	      WebElement Active_TL = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/div/div[1]/div[2]"));
		  String ActTL = Active_TL.getText();
	      System.out.println("Teamleader: " + ActTL);
		  
		  //Total teamleader count on Dashboard	  
		  WebElement Total_TL = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/div/div[2]/div[2]/p[2]"));
		  String DashTL = Total_TL.getText();
		  System.out.println("Dashboard total Teamleader count:" + DashTL);
		  
		  //Total Teamleader on Teamleader window
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[10]/div")).click();
		  Thread.sleep(2000);
		  WebElement TeamLeader = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div"));
		  String CountTL = TeamLeader.getText();
		  System.out.println(CountTL);
		  
		  //To trim the teamleader count to verify count.
		  String str1=CountTL.substring(14, 16);
		  System.out.println("Teamleader page total Teamleader count:" + str1);
		  
		  if(DashTL.equals(str1)) {
			  System.out.println("Total TeamLeader count is verified");
		  }
		  else {
			  System.out.println("Total TeamLeader count is invalid");
		  }
		  
	}  
		  
	  @Test (priority=3) 
	  public void counsellor() throws InterruptedException {
		  
	      //click on Dashboard tab      
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[1]/div")).click();
	      Thread.sleep(2000);
	      
	      //Active counsellor count on Dashboard
	      WebElement ActCounsellor = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/div/div[1]/div[3]"));
	      String ActCaller = ActCounsellor.getText();
	      System.out.println("Counsellor:" + ActCaller);
	      
	      //Total Counsellor count on Dashboard
	      WebElement TotalCounsellor = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[1]/div/div[2]/div[3]/p[2]"));
	      String TotalCaller = TotalCounsellor.getText();
	      System.out.println("Dashboard total Counsellor count :" + TotalCaller);
	      
	      //Total Counsellor on Counsellor window
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[11]/div")).click();
	      Thread.sleep(2000);
	      WebElement Counsellors = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div"));
	      String CountCaller = Counsellors.getText();
	      System.out.println(CountCaller);
	      
	      //to trim the counsellor count to verify
	      String str2 = CountCaller.substring(13, 15);
	      System.out.println("Counsellor page Counsellor count:" + str2);
	      
	      if(TotalCaller.equals(str2)) {
	    	  System.out.println("Total counsellor count is verified");
	      }
	      else {
	    	  System.out.println("Total counsellor count is invalid");
	      }
	      
	  }
	  
	  @Test (priority = 4) 
	  public void Task() throws InterruptedException {
		  //click on Dashboard tab      
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[1]/div")).click();
	      Thread.sleep(2000);
	      
	      //Total Task count verification
	      WebElement TotalTask = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[2]/div/div[2]/div/p[2]"));
		  String DashboardTask = TotalTask.getText();
		  System.out.println("Total task on dashboard :" + DashboardTask);
		  
		  //go to tasks Tab/window
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[8]/div")).click();
		  Thread.sleep(6000);
		  
		  //Check the total task count
		  WebElement TotalTaskCount = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/nav/ol/li/div/p"));
		  String Tasks = TotalTaskCount.getText();
		  
		  String str3 = Tasks.substring(1, 3);
		  System.out.println("Total task on Task window :" +str3);
		
		  if(DashboardTask.equals(str3)) {
			  System.out.println("Total task verified successfully");
		  }
		  else {
			  System.out.println("Total task verification fail");
		  }
		  
	  }
	  
	  @Test (priority = 5)  
	  public void Leads() throws InterruptedException {
		  //click on Dashboard tab      
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[1]/div")).click();
	      Thread.sleep(2000);
	      
	      //Total leads on Dashboard
	      WebElement TotalLeads = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[3]/div/div[2]/div/p[2]"));
	      String DashboardLeads = TotalLeads.getText();
	      System.out.println("Total leads on dashboard:" + DashboardLeads);
	      
	      //click on Leads
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[2]/div")).click();
	      Thread.sleep(3000);
	      
	      //Total leads count on Leads
	      WebElement Leads = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/div[1]/nav/ol/li/div/p"));
	      String LeadsCount = Leads.getText();
	      
	      String str5 = LeadsCount.substring(1, 6);
	      System.out.println("Total leads on Leads window:" + str5);
	      
	      if(DashboardLeads.equals(str5)) {
	    	  System.out.println("Total leads verified successfully");
	      }
	      else {
	    	  System.out.println("Total leads verification failed");
	      }
	  }
		  
	  @Test (priority = 6)
	  public void FunctionalGrid() throws InterruptedException {
		  //click on Dashboard tab      
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[1]/div")).click();
	      Thread.sleep(2000);
	      
	      //to verify all the data
	      WebElement DuplicateCount = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[4]/div/div[1]/div[2]/p"));
	      String DuplicateLeads = DuplicateCount.getText();
	      System.out.println("Dashboard Duplicates leads count:" + DuplicateLeads);
	      
	      WebElement InvalidCount = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[4]/div/div[2]/div[2]"));
	      String InvalidLeads = InvalidCount.getText();
	      System.out.println("Dashboard Invalid leads count:" + InvalidLeads);
	      
	      WebElement RequestedDock = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[4]/div/div[3]/div[2]"));
	      String ReqDockCount = RequestedDock.getText();
	      System.out.println("Dashboard Requested Document count:" + ReqDockCount);
	      
	      //click on duplicates
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[4]/div/div[1]/div[2]/p")).click();
	      //click on dashboard
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[1]/div")).click();
	      //click on invalid leads
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[4]/div/div[2]")).click();
	      //click on dashboard
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[1]/div")).click();
	      //Click on Document Requested
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div[4]/div/div[3]")).click();
	      //click on dashboard
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[1]/div")).click();
	      //click on Monthly wise
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"simple-tab-0\"]")).click();
		  //click on analytics day wise chart
		  driver.findElement(By.xpath("//*[@id=\"simple-tab-1\"]")).click();
		  
		  //verifying date filter
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/main/div/div/div[3]/div[1]/div[2]/div[1]/div/input")).click();
	
	  }  
}