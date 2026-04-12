package stepDefinations1;

import java.io.IOException;

import io.cucumber.java.After;
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

}
