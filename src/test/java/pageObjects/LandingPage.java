package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	private By searchItem=By.xpath("//input[@class=\"search-keyword\"]");
	private By productName=By.xpath("//h4[text()=\"Tomato - 1 Kg\"]");
	private By clickTopDeal=By.xpath("//a[@href=\"#/offers\"]");
	
	public void searchItem(String shortname) {
		driver.findElement(searchItem).sendKeys(shortname);
	}

	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void selectToDealPage() {
		driver.findElement(clickTopDeal).click();
	}
}
