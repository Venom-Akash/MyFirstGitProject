package runnerMoneyControl;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/features"},
		glue= {"stepDefinitions"},
		dryRun=true,
		monochrome= true,
		plugin= {"pretty"}
		
		
		)
public class TestRunner {

}
