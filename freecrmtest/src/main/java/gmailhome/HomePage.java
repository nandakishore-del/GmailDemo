package gmailhome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basic.BasicLunch;

public class HomePage extends BasicLunch{
@FindBy(linkText="Gmail")
WebElement gmail;
@FindBy(xpath="/html/body/div[2]/div[1]/div[4]/ul[1]/li[3]/a")
WebElement createaccount;
public HomePage() {
	PageFactory.initElements(driver, this);
}
public void gmaillink() {
	gmail.click();
	
}
public void gmailaccount() {
	createaccount.click();
}
}
