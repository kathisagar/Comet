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
		
		
		 System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cap.setCapability("requirewindowfocus", true);
		WebDriver driver=new InternetExplorerDriver(cap);
		
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		WebElement menu=driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a/div"));
				
	
		//to right click on object
		Actions builder = new Actions(driver); 
		builder.contextClick(menu).build().perform();
		
		//to move to particular object and control stays on object
		
		Actions builder1=new Actions(driver);
		builder1.moveToElement(menu).build().perform();
		
			
		WebDriverWait option=new WebDriverWait(driver,20);
		option.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[(@title='Browse All Recruiters')]")));

	WebElement menuopt=driver.findElement(By.xpath("//a[(@title='Browse All Recruiters')]"));
	menuopt.click();
		
 } 
	
  

  @Test
  
  public void testng() throws InterruptedException{
	  print();
	  
  }
  
}