package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	//public static Properties prop;
	
	 public static void initialization(){
	String browserName= "browser";
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\driver3\\chromedriver.exe");
		 driver=new ChromeDriver();	
	}
	else if(browserName.equals("FF")){
		System.setProperty("webdriver.chrome.driver", "C:\\driver1\\firefox.exe");
		 driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.com");
	 }
}
