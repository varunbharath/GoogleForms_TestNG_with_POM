package alpha_driver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class Basic_setup {
	String url="https://www.mycontactform.com/samples.php";
	public RemoteWebDriver driver=null;
	
	
  
  @BeforeClass
  public void beforeClass() {
	Actions act=new Actions(driver);
	  
	driver.manage().window().maximize();
	driver.navigate().to(url);
	
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
