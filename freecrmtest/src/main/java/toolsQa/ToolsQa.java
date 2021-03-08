package toolsQa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ToolsQa {
WebDriver driver;
//String browser= "ffox";
@BeforeTest
@Parameters("browser")
public void setup(String browser)
{
	if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\driver3\\chromedriver.exe");
			driver=new ChromeDriver();
	}
	else if(browser.equals("ffox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
}
@Test
public void fillup()
{
	driver.findElement(By.id("firstName")).sendKeys("balram");
	driver.findElement(By.id("lastName")).sendKeys("bera");
	driver.findElement(By.id("userEmail")).sendKeys("bera@gmail.com");
	driver.findElement(By.className("custom-control-label")).click();
	driver.findElement(By.id("userNumber")).sendKeys("7903634306");
	driver.findElement(By.id("dateOfBirthInput")).clear();
	//driver.findElement(By.id("dateOfBirthInput")).sendKeys("18 Nov 2020");

	//driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[5]")).click();
	
	
	}
}