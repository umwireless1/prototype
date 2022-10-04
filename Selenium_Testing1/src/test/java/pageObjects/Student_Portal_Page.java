package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Student_Portal_Page {
	
	public WebDriver driver;
	
	public Student_Portal_Page(WebDriver _driver)
	{
		driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	
	@FindBy(xpath = "//span[text()=' Class Schedule ']")
	@CacheLookup
	WebElement PortalPageElement;
	
	
	
	public boolean VerifyStudentPortalPageDisplay()
	{
		
		try
		    {
			return PortalPageElement.isDisplayed();
			}
		catch(Exception e)
		{
			return false;
		}
		
		
		
		
	}
	
	

}
