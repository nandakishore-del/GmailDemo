package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLunch {
	public static WebDriver driver;
	public  BasicLunch() {
		
	}
	
		public static void initialization() {
			System.setProperty("webdriver.chrome.driver", "C:\\driver3\\chromedriver.exe");
			 driver=new ChromeDriver();	
			 driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.google.com");
		}
	}



