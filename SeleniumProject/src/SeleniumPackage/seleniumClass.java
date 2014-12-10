package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class seleniumClass {
	public static void main (String[] args){
		// declaration
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.facebook.com/";
		System.out.println("FF launched");
		String tagName = "";
		
		//String expectedTitle = ""
		
		// launch FF
		driver.get(baseUrl);
		tagName = driver.findElement(By.id("email")).getTagName();
		
		// get title
		//String title = driver.getTitle();
		
		//System.out.println("page title is ==>" +title);
		System.out.println(tagName);
		
		// close ff
		driver.close();
		
		//exit program explicitly
	System.exit(0);
	}

}
