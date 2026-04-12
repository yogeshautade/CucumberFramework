package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
		WebDriver driver;
		public CheckoutPage(WebDriver driver) {
			this.driver=driver;
		}
		private By cartBag=By.xpath("//a[@class=\"cart-icon\"]");
		private By checkOutButton=By.xpath("//button[contains(text(),\"PROCEED TO CHECKOUT\")]");
		private By promobtn=By.xpath("//button[@class=\"promoBtn\"]");
		private By placeorder=By.xpath("//button[contains(text(),\"qlace Orde\")]");
		private By getProductName=By.xpath("//p[@class=\"product-name\"]");
		
		public void CheckOutItems() {
			driver.findElement(cartBag).click();
			driver.findElement(checkOutButton).click();
		}

		public Boolean VerifyPromoButton() {
			return driver.findElement(promobtn).isDisplayed();
			
		}
		public Boolean VerifyPlaceOrderBTN() throws InterruptedException {
			
			return driver.findElement(placeorder).isDisplayed();
		}
		
		public String getProductName() {
			return driver.findElement(getProductName).getText();
		}

}
