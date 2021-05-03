package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 


public class Browserfactry {
  
	
	static WebDriver driver;
	
	public static WebDriver startBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://techfios.com/billing/?ng=admin/");
		return driver;
		
	}
}
