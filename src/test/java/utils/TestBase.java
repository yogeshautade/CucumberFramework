package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		FileInputStream input=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//Global.properties");
        Properties prop=new Properties();
        prop.load(input);
        System.out.println(prop.getProperty("browser"));
		if(driver==null) {
//			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
//				driver=new ChromeDriver();
//			}
//			if(prop.getProperty("browser").equalsIgnoreCase("edgeDriver")) {
//				driver=new EdgeDriver();
//			}
			switch(prop.getProperty("browser")) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "edgeDriver":
				driver=new EdgeDriver();
				break;
			default:
				System.out.println("Driver is Invalid");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.get(prop.getProperty("url"));
		}
		return driver;
	}
}
