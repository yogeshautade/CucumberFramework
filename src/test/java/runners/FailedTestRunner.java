package runners;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="@target/failed_scenarios.txt",glue="stepDefinations1",
			monochrome=true,dryRun=false, tags="@CheckoutPage or @OfferPage",plugin={"pretty","html:Target/Cucumber.html",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
			public class FailedTestRunner extends AbstractTestNGCucumberTests{
				
				@Override
				@DataProvider(parallel=true)
				public Object[][] scenarios(){
					return super.scenarios();
				}
     }
