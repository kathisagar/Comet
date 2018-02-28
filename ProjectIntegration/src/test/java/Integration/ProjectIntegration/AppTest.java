package Integration.ProjectIntegration;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

 
public class AppTest {

	public static void  print() throws InterruptedException, MalformedURLException{
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();              
		capabilities.setCapability("platform", "Windows 7");               
		capabilities.setCapability("version", "45"); 
		capabilities.setCapability("idleTimeout", 180);  
		capabilities.setCapability("requireWindowFocus", true);

		WebDriver driver = new RemoteWebDriver(
		new URL("http://"+System.getenv("SAUCE_USERNAME")+":"+System.getenv("SAUCE_ACCESS_KEY")+"@ondemand.saucelabs.com:80/wd/hub"),
		capabilities);
		
		driver.get("http://apsrt3981.uhc.com:8080/prweb/PRServlet");
		driver.findElement(By.id("txtUserID")).sendKeys("cometwfa");
		driver.findElement(By.id("txtPassword")).sendKeys("rules");
		driver.findElement(By.className("loginButton")).click();
		driver.manage().window().maximize();
	
		driver.close();
		driver.quit();
		
		
		System.out.println("Testing with Jenkins");
		
 } 
	
  

  @Test
  
  public void testng() throws InterruptedException, MalformedURLException{
	  print();
	  
  }
  
}