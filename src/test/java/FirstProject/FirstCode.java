package FirstProject;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FirstCode {

	static WebDriver Driver;
	static String   browser= System.getProperty("browser");
	
	@Test
	public static void sho(){
		System.out.println(browser);
		System.out.println(browser);
	
		
		
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver1.exe");
		 Driver=new ChromeDriver();
		 Driver.get("https://mvnrepository.com");
	
		
		}
		
		
		
	}
	
	
	
	
	
}
