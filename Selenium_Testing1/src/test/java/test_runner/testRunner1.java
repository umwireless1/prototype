package test_runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (
		   features =".//Feature/Testing1.feature",
		   glue="stepDefination",
		   dryRun=false,
		   monochrome=true,
		   plugin= {"pretty","html:test-output"}
		  
		   
		  
		  

		
		
		
		
		
		)
public class testRunner1 {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
