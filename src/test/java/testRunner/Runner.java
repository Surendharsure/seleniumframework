package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	features = {"src/test/java/features/loginWithWrapper.feature"}, 
					glue = {"stepDefiniton"}, 
					monochrome = true,
					dryRun = false,
					publish = true)

public class Runner extends AbstractTestNGCucumberTests {

}
