package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.ExcelUtilities;

public class login_page {
	
	
	
		
		public WebDriver driver;
		
		public login_page(WebDriver _driver)
		{
			driver = _driver;
			PageFactory.initElements(_driver, this);
		}
		
		
		@FindBy(id = "exampleDropdownFormEmail1")
		@CacheLookup
		WebElement email;
		
		
		@FindBy(id = "exampleDropdownFormPassword1")
		@CacheLookup
		WebElement pass;
		
		
		@FindBy(xpath = "//b[text()='Login']")
		@CacheLookup
		WebElement loginButton;
		
		
		@FindBy(xpath = "//button[text()='Sign in']")
		@CacheLookup
		WebElement signin;
		
		
		
		
		
		
		
		
		
		
		
          public void ClickLoginButton() {
			
			
        	  loginButton.click();
			
		}
		
		
		
          public void EnterUsernamePassword() throws IOException{
  			
        	  String excelPath = "./Data/credentials.xlsx";
      		  String sheetName = "Sheet1";
      		  ExcelUtilities excel = new ExcelUtilities(excelPath, sheetName);
      		  String username = excel.getCellData(1, 0);
      		  String password = excel.getCellData(1, 1);
        	  email.clear();
        	  email.sendKeys(username);
  			  pass.clear();
        	  pass.sendKeys(password);
  		}
          
          
          public void ClickSignInButton() {
  			
  			
        	  signin.click();
  			
  		}
          
  		
		
		
		
		
		
	
	
	
	
	
	
	
	

}
