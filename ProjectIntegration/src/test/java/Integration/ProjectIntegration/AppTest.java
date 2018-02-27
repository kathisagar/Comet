package Integration.ProjectIntegration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

 
public class AppTest {

	public static void  print() throws InterruptedException{
		
/*		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability("requireWindowFocus", true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		
		driver.get("http://apsrt3981.uhc.com:8080/prweb/PRServlet");
		driver.findElement(By.id("txtUserID")).sendKeys("cometwfa");
		driver.findElement(By.id("txtPassword")).sendKeys("rules");
		driver.findElement(By.className("loginButton")).click();
		driver.manage().window().maximize();
	
		driver.close();*/
		
		
		System.out.println("Testing with Jenkins");
		
 } 
	
  

  @Test
  
  public void testng() throws InterruptedException{
	  print();
	  
  }
  
}