package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\driver3\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/");
	WebElement element= driver.findElement(By.xpath("//img[@class=' preload-me']"));
	boolean logo= element.isDisplayed();
	System.out.println(logo);
	WebElement element1=driver.findElement(By.xpath("//*[@id='primary-menu']/li[6]/a/span/span"));
	boolean element2=element1.isDisplayed();
	System.out.println(element2);
	element1.click();
	
	
	
	WebElement element3=driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]"));
boolean element4=element3.isDisplayed();
System.out.println(element4);
element3.click();

WebElement element5=driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/div/div/div[2]/span/div"));
boolean element6=element5.isDisplayed();
System.out.println(element6);
element5.click();
}
}
