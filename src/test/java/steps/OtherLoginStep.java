package steps;

import javax.swing.BorderFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import page.LoginPage;
import util.Browserfactry;



public class OtherLoginStep {
    WebDriver driver; 
    LoginPage loginPage; 
    
    @Before 
	 public void beforeRun() {
		 driver = Browserfactry.startBrowser();
		 loginPage = PageFactory.initElements(driver, LoginPage.class);
	 }
	 
    
    
    
    
    
	 @After
	 public void tearDown() {
		 driver.close();
		 driver.quit();
	 }
}
