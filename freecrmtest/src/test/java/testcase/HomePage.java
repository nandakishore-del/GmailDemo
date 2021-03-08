package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basic.BasicLunch;

public class HomePage extends BasicLunch{
public  HomePage() {
	super();
}
@BeforeMethod
public void setUp() {
	initialization();
}
@Test
public void gmail() {
	driver.findElement(By.linkText("Gmail")).click();
}
@AfterMethod
public void tearDown() {
	driver.quit();
}

}
