package stepDefinations1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import utils.TestConceptSetup;

public class OfferPageStepDefinations {
	public String  OfferPageproductName;
	TestConceptSetup testConceptSetup;
	public OfferPageStepDefinations(TestConceptSetup testConceptSetup) {
		this.testConceptSetup=testConceptSetup;
	}
	@Then("user searched for {string} shortname in offer page")
	public void user_searched_for_sam_shortname_in_offer_page_to_check_if_product_is_exist(String pname) {
		OfferPage offerPage=new OfferPage(testConceptSetup.driver);
		switcToOfferPage();
	    offerPage.searchItem(pname);
	    OfferPageproductName=offerPage.getProductName();
	    System.out.println("offer page product name:"+OfferPageproductName);
	   
	}
	public void switcToOfferPage() {
		String url=testConceptSetup.driver.getCurrentUrl();
		System.out.println(url);
		LandingPage landingPage=testConceptSetup.pageObjectManager.getLandingPage();
		landingPage.selectToDealPage();
		testConceptSetup.genericUtils.SwitchWindowToChild();
	}
	@Then("Validate product name matches with offer page with landing page")
	public void validate_name_in_both_pages() {
		 Assert.assertEquals(testConceptSetup.LandingPageProdcutName,OfferPageproductName);
		
	}

}
 