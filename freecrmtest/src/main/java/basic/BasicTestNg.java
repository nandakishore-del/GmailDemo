package basic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNg {

	@Test
	public void function1() {
		System.out.println("function1");
	}
	@Test
	public void function2() {
		System.out.println("function2");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTestt");
	}
}
