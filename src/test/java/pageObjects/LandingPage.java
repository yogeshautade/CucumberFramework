package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	private By searchItem=By.xpath("//input[@class=\"search-keyword\"]");
	private By productName=By.xpath("//div[@class=\"product\"]//h4");
	private By clickTopDeal=By.xpath("//a[@href=\"#/offers\"]");
	private By AddProduct=By.xpath("//a[@class=\"increment\"]");
	private By ClickAddToCart=By.xpath("//div//button[contains(text(),\"ADD TO CART\")]");
	
	public void searchItem(String shortname) {
		driver.findElement(searchItem).sendKeys(shortname);
	}

	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void selectToDealPage() {
		driver.findElement(clickTopDeal).click();
	}
	public void incrementProduct(int Quantity) {
		int i=Quantity;
		while(i>0) {
			driver.findElement(AddProduct).click();
		 i--;
		}
	}
public void ClickAddToCart() {
		driver.findElement(ClickAddToCart).click();
	}

 public String getTitleLandingPage() {
	 return driver.getTitle();
 }
}
