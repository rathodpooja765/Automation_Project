package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"abc.feature"},
glue= {"abc.java"},
dryRun=false,
monochrome=true

		
		
		
		
		)



public class Runner {

}
