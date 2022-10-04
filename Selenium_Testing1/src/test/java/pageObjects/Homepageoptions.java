package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class Homepageoptions {
	
	
	public WebDriver driver;
	
	public Homepageoptions(WebDriver _driver)
	{
		driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	
	@FindBy(xpath = "//a[@href=\"class_list.php?course_id=34\"]")
	@CacheLookup
	WebElement viewclasses;
	
		
	
	@FindBy(id = "exampleDropdownFormPassword1")
	@CacheLookup
	WebElement pass;
	
	
	@FindBy(xpath = "//b[text()='Login']")
	@CacheLookup
	WebElement loginButton;
	
	
	@FindBy(xpath = "//button[text()='Sign in']")
	@CacheLookup
	WebElement signin;
	
	
	
	
	
	
	
	
	
	
	
      public void clickviewclasseslink() {
		
		  viewclasses.click();
    	  
      }
      
      
      
      
      
      
}
		
	
	
	
		



		



