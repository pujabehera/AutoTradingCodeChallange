package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	public static Properties prop;
	//init webDriver
	public static WebDriver driver;
	public static WebDriverWait waitDriver;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 70;
	
	private SeleniumDriver() {
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"geckodriver.exe");
    	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get(prop.getProperty("url"));
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		
	}
	
	
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	public static void tearDown() {
		if(driver !=null) {
			driver.close();
			//driver.quit();
		}
		seleniumDriver = null;
	}
	public static void waitForPageToLoad()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
