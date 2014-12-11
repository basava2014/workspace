package testngpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNGFile {
	public String baseUrl = "http://facebook.com";
	public WebDriver driver;
  
	@BeforeTest
	public void setUrl() {
	driver = new FirefoxDriver();
	driver.get(baseUrl);
	}
	
	@Test
  public void VerifyFBPage() {
		System.out.println("test passed");
  }	
		
	@AfterTest
	public void endSession() {
	driver.quit();	
	}
	
}
