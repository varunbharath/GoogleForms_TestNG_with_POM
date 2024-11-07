//package alpha_task;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.logging.FileHandler;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.*;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import alpha_class.MY_contact_sendkey;
//import alpha_class.My_contact_Page_checkbox;
//import alpha_class.Mycontact_dropdown;
//import alpha_class.User_login_mycontact;
//import alpha_driver.Basic_setup;
//
//public class Execution_part  extends Basic_setup{
//	@BeforeTest
//	@Parameters("Browser")
//	public void browser_setup(String Browser) throws IOException {
//		switch(Browser) {
//case "Chrome":{
//
//	System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
//		driver=new ChromeDriver();
//	// take screenshot
//	 System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
//	File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshot, new File("C:\\Screenshotstroed\\amazon.PNG"));
//		
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	
//	js.executeScript("window.scrollBy(0,500)");
//	
//	File a= new File(("C:\\Screenshotstroed\\amazondown18.PNG"));
//FileUtils.copyFile(screenshot, a);
//	Reporter.log("testcase browser");
//break;
//       
//
////
////
////	  
//}
//	  
//  case "Edge":{
//	  System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\EdgeDriver\\edgedriver_win64 (1)\\msedgedriver.exe");
//  
//	  driver=new EdgeDriver();
//	break;
//	 
//  }}}
//	  
//  
//	
//	@Test
//	public void sendkey() throws IOException {
//		PageFactory.initElements(driver, MY_contact_sendkey.class);
//		MY_contact_sendkey.Subject.sendKeys("Testing");
//		MY_contact_sendkey.email_address.sendKeys("12345@gmail.com");
//		MY_contact_sendkey.textboxfield.sendKeys("value");
//		MY_contact_sendkey.textboxfield.sendKeys("just pass the value");
//		// take screenshot
//		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshot, new File("C:\\Screenshotstroed\\amazon.PNG"));
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		
//		js.executeScript("window.scrollBy(0,500)");
//		
//		File a= new File(("C:\\Screenshotstroed\\amazondown19.PNG"));
//		FileUtils.copyFile(screenshot, a);
//Reporter.log("Testcase for Sendkeys");
//	}
//	@Test
//	public void login1() throws IOException {
//		PageFactory.initElements(driver,User_login_mycontact.class);
//		User_login_mycontact.username.sendKeys("bharath");
//		User_login_mycontact.password.sendKeys("12345678");
//		User_login_mycontact.login.click();
//		// take screenshot
//		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(screenshot, new File("C:\\Screenshotstroed\\amazon.PNG"));
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		
//		js.executeScript("window.scrollBy(0,500)");
//		
//		File a= new File(("C:\\Screenshotstroed\\amazondown29.PNG"));
//		FileUtils.copyFile(screenshot, a);
//		
//		Reporter.log("Testcase for login");
//	}
//
//	@Test
//	void drop() throws IOException {
//		PageFactory.initElements(driver,Mycontact_dropdown.class);
//		//Mycontact_dropdown.usstate.click();
//		
//	new	Mycontact_dropdown().randomdop();
//	// take screenshot
//	File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(screenshot, new File("C:\\Screenshotstroed\\amazon.PNG"));
//	
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	
//	js.executeScript("window.scrollBy(0,500)");
//	
//	File a= new File(("C:\\Screenshotstroed\\amazondown27.PNG"));
//	FileUtils.copyFile(screenshot, a);
//	Reporter.log("testcase for drop");
//	}
//}
//----------------------------------------------------------------------------------------------------
package alpha_task;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import alpha_class.MY_contact_sendkey;
import alpha_class.My_contact_Page_checkbox;
import alpha_class.Mycontact_dropdown;
import alpha_class.User_login_mycontact;
import alpha_driver.Basic_setup;

public class Execution_part extends Basic_setup {

    // Utility method to capture screenshot
    public void captureScreenshot(String screenshotName) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Screenshotstored\\" + screenshotName + ".PNG"));
    }

    @BeforeTest
    @Parameters("Browser")
    public void browser_setup(String Browser) throws IOException {
        switch (Browser) {
            case "Chrome": {
                System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
                driver = new ChromeDriver();
                Reporter.log("Chrome browser launched");
                captureScreenshot("browser_setup_Chrome");
                break;
            }
            case "Edge": {
                System.setProperty("webdriver.edge.driver", "C:\\Qtree_Selenium\\EdgeDriver\\edgedriver_win64 (1)\\msedgedriver.exe");
                driver = new EdgeDriver();
                Reporter.log("Edge browser launched");
                captureScreenshot("browser_setup_Edge");
                break;
            }
            default:
                throw new IllegalArgumentException("Browser not supported");
        }
    }

    @Test
    public void sendkey() throws IOException {
        PageFactory.initElements(driver, MY_contact_sendkey.class);
        MY_contact_sendkey.Subject.sendKeys("Testing");
        captureScreenshot("sendkey_Subject");
        
        MY_contact_sendkey.email_address.sendKeys("12345@gmail.com");
        captureScreenshot("sendkey_Email");

        MY_contact_sendkey.textboxfield.sendKeys("value");
        captureScreenshot("sendkey_Textboxfield");

        MY_contact_sendkey.textboxfield.sendKeys("just pass the value");
        captureScreenshot("sendkey_Textboxfield2");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        captureScreenshot("sendkey_Scroll");

        Reporter.log("Testcase for Sendkeys");
    }

    @Test
    public void login1() throws IOException {
        PageFactory.initElements(driver, User_login_mycontact.class);
        User_login_mycontact.username.sendKeys("bharath");
        captureScreenshot("login_Username");

        User_login_mycontact.password.sendKeys("12345678");
        captureScreenshot("login_Password");

        User_login_mycontact.login.click();
        captureScreenshot("login_Click");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        captureScreenshot("login_Scroll");

        Reporter.log("Testcase for login");
    }

    @Test
    public void drop() throws IOException {
        PageFactory.initElements(driver, Mycontact_dropdown.class);
        new Mycontact_dropdown().randomdop();
        captureScreenshot("drop_Dropdown");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        captureScreenshot("drop_Scroll");

        Reporter.log("Testcase for drop");
    }
}
