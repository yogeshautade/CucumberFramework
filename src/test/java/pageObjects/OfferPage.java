package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	WebDriver driver;
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}

	private By searchItem=By.xpath("//input[@id=\"search-field\"]");
	private By productName=By.xpath("//td[text()=\"Tomato\"]");
	 
    public void searchItem(String shortname) {
		driver.findElement(searchItem).sendKeys(shortname);
	}
    
    public String getProductName() {
		return driver.findElement(productName).getText();
	}
}
