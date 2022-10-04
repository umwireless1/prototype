package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	
	public WebDriver driver;
	
	public Homepage(WebDriver _driver)
	{
		driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	
	
	
	@FindBy(xpath = "//a[@href='courses.php']")
	@CacheLookup
	WebElement courseslink;
	
	
	@FindBy(id = "exampleDropdownFormPassword1")
	@CacheLookup
	WebElement pass;
	
	
	@FindBy(xpath = "//b[text()='Login']")
	@CacheLookup
	WebElement loginButton;
	
	
	@FindBy(xpath = "//button[text()='Sign in']")
	@CacheLookup
	WebElement signin;
	
	
	
	
	
	
	
	
	
	
	
      public void clickcourseslink() {
		
		
    	  courseslink.click();
		
	}
	
	
	
	
	
	
	

}
