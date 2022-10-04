package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class classes {
		
		
		public WebDriver driver;
		
		public classes(WebDriver _driver)
		{
			driver = _driver;
			PageFactory.initElements(_driver, this);
		}
		
		
		@FindBy(xpath = "//a[@href=\"select_batch.php?class_id=15&course_id=34\"]")
		@CacheLookup
		WebElement content;
		

		
		
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
		
		
		
		
		
		
		
		
		
		
		
	      public void clickcontentlink() {
			
			
	    	  content.click();
			
		}
	
	
	
	
	
	
	
	
	
	
	

}
