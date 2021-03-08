package gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver;

	
			System.setProperty("webdriver.chrome.driver", "C:\\driver3\\chromedriver.exe");
			 driver=new ChromeDriver();	
			 driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'][@name='firstName']")).sendKeys("balaram");
	}

}
