package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:\\eclipse-jee-2018-12-R-win32-x86_64\\BDDbankExample\\src\\main\\java\\features\\bank.feature",
		glue= {"stepDefination"}// same as packageName
		)

public class TestRunner {

	
	
}
