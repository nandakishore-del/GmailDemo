package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basic.BasicLunch;
import gmailhome.HomePage;
public class HomepageTest extends BasicLunch{
	HomePage homepage;
	public  HomepageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage= new HomePage();
	}
	@Test
	public void gmailclickTest() {
		
		homepage.gmaillink();
		String gmailurl= driver.getCurrentUrl();
		String gmailtitle =driver.getTitle();
		System.out.println(gmailurl);
		System.out.println(gmailtitle);
		//Assert.assertEquals("gmailurl","https://www.google.com/intl/en-GB/gmail/about/#");
		Assert.assertEquals(gmailtitle, "Gmail - Email from Google");
	}
	@Test
	
	public void createaccountTest() {
		initialization();
		homepage.gmaillink();
		homepage.gmailaccount();
	}
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
}
