package stepDefinations1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestConceptSetup;

public class LandingPageStepDefinations {
	public WebDriver driver;
	public String LandingPageProdcutName;
	
	TestConceptSetup testConceptSetup;
	public LandingPageStepDefinations(TestConceptSetup testConceptSetup) {
		this.testConceptSetup=testConceptSetup;
		this.LandingPageProdcutName=LandingPageProdcutName;
	}
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		testConceptSetup.driver.quit();
	}
	
	@Given("User is on Greencart Landing page")
	public void user_is_on_Greencar_landing_page() {
		
		testConceptSetup.driver=new ChromeDriver();
		testConceptSetup.driver.manage().window().maximize();
		testConceptSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	@When("user searched with shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String name) {
		LandingPage landingPage=testConceptSetup.pageObjectManager.getLandingPage();
		landingPage.searchItem(name);
		testConceptSetup.LandingPageProdcutName=landingPage.getProductName().split("-")[0].trim();
	    System.out.println("Landing page prodcut name:"+testConceptSetup.LandingPageProdcutName);
	}

	
	



}
