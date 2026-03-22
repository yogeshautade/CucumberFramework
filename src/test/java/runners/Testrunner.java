package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinations1",
monochrome=true,dryRun=false)
public class Testrunner extends AbstractTestNGCucumberTests{
	
	}
