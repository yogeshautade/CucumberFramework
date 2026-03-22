package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestConceptSetup {
	public WebDriver driver;
	public String LandingPageProdcutName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public TestConceptSetup() {
		testBase=new TestBase();
		pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
		genericUtils=new GenericUtils(testBase.WebDriverManager());
	}
}
