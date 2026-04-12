package stepDefinations1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestConceptSetup;

public class Hooks {
	TestConceptSetup testConceptSetup;
	public Hooks(TestConceptSetup testConceptSetup){
		this.testConceptSetup=testConceptSetup;
	}
	@After
	public void tearDown() throws InterruptedException, IOException {
		Thread.sleep(3000);
		testConceptSetup.testBase.WebDriverManager().quit();
	}
	@AfterStep
	public void addScreenShot(Scenario scenario) throws IOException {
		WebDriver driver=testConceptSetup.testBase.WebDriverManager();
		
		if(scenario.isFailed()) {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent=FileUtils.readFileToByteArray(src);
			scenario.attach(filecontent, "image/png", "image");
		}
	}

}
