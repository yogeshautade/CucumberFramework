package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pageObjects.LandingPage;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}

	public void SwitchWindowToChild() {
		
	    Set<String> setWindows=driver.getWindowHandles();
	    Iterator<String> it=setWindows.iterator();
	    String PWin=it.next();
	    String CWin=it.next();
	    driver.switchTo().window(CWin);
	}
}
