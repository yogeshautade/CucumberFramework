package stepDefinations1;

import java.io.IOException;
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
	LandingPage landingPage;
	
	TestConceptSetup testConceptSetup;
	public LandingPageStepDefinations(TestConceptSetup testConceptSetup) {
		this.testConceptSetup=testConceptSetup;
		this.LandingPageProdcutName=LandingPageProdcutName;
		this.landingPage=testConceptSetup.pageObjectManager.getLandingPage();
	}
	
	@Given("User is on Greencart Landing page")
	public void user_is_on_Greencar_landing_page() throws IOException {
		System.out.println(landingPage.getTitleLandingPage());
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
//		testConceptSetup.driver=new ChromeDriver();
//		testConceptSetup.driver.manage().window().maximize();
//		testConceptSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//testConceptSetup.testBase.WebDriverManager();
	}
	
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String name) {
	
		landingPage.searchItem(name);
		testConceptSetup.LandingPageProdcutName=landingPage.getProductName().split("-")[0].trim();
	    System.out.println("Landing page prodcut name:"+testConceptSetup.LandingPageProdcutName);
	}
	
	@When("Added {string} items of the selected prduct to cart")
	public void added_items_of_the_selected_prduct_to_cart(String Quantity) {
	    landingPage.incrementProduct(Integer.parseInt(Quantity));;
	    landingPage.ClickAddToCart();
	}

	
	



}
