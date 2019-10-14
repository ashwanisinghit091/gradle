package FirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondCode {

	static WebDriver Driver;
	
	
	@Test
	public void print(){
		
		
		 Driver=new FirefoxDriver();
			
			Driver.get("https://www.naukri.com");
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);}	
			
		
	
}
