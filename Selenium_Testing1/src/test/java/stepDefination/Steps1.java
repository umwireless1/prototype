package stepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.*;
import pageObjects.Batch;
import pageObjects.Homepage;
import pageObjects.Homepageoptions;
import pageObjects.Student_Portal_Page;
import pageObjects.classes;
import pageObjects.login_page;

public class Steps1 {
	
	public WebDriver driver;
	public login_page login;
	public Student_Portal_Page SP;
	public Homepage hp;
	public Homepageoptions hpo;
	public classes cl;
	public Batch sb;
	
	
	
	
	@Given("navigate to the application")
	public void navigate_to_the_application() {
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\faith\\Selemium\\Selenium_Testing1\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://techfios.com");
		driver.manage().window().maximize();
		
		
		
	    
	}
	
	
	@Then("enter username and password")
	public void enter_username_and_password() throws InterruptedException, IOException {
		Thread.sleep(4000);
		login = new login_page(driver);
		
		login.ClickLoginButton();
		Thread.sleep(4000);
		
		login.EnterUsernamePassword();
		Thread.sleep(4000);
		login.ClickSignInButton();
		
	 
		   
		}
	
	@Then("click on courses")
	public void click_on_courses() {
	hp = new Homepage(driver);
	hp.clickcourseslink();	
	
	
}
	
	@Then("click on view classes")
	public void click_on_view_classes() {
	hpo = new Homepageoptions(driver);
	hpo.clickviewclasseslink();
	}
	
	@Then("click on content")
	public void click_on_content() {
	cl = new classes (driver);
    cl.clickcontentlink();
		
   }
	   
	@Then("click on submit")
	public void click_on_submit() {
	sb = new Batch(driver);
	sb.clicksubmitlink();
		
		
		
	}

	
	
	

	
	@Then("close the browser")
	public void close_the_browser() {
		
		driver.close();
		driver.quit();
		
		
		
	}
	
	
	
	
	
	
	}
