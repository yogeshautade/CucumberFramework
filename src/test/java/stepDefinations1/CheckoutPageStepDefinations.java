package stepDefinations1;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import utils.TestConceptSetup;

public class CheckoutPageStepDefinations {
	TestConceptSetup testConceptSetup;
	CheckoutPage checkoutPage;
	
	public CheckoutPageStepDefinations(TestConceptSetup testConceptSetup) {
		this.testConceptSetup=testConceptSetup;
		checkoutPage=testConceptSetup.pageObjectManager.getCheckoutPage();
	}

	@Then("^user proceed to checkout and validate the (.+) items in cart page$")
	public void user_proceed_to_checkout_and_validate_the_items_in_cart_page(String name) {
		checkoutPage.CheckOutItems();
		String name1=checkoutPage.getProductName();
		Assert.assertEquals(name, name1);
		
	}
	@Then("verify user has ability enter promo code and place the order")
	public void verify_user_has_ability_enter_promo_code_and_place_the_order() throws InterruptedException {
		
		Assert.assertTrue(checkoutPage.VerifyPlaceOrderBTN());
		Assert.assertTrue(checkoutPage.VerifyPromoButton());
	}
}
