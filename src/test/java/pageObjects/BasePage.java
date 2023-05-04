package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	 WebDriver driver;
	    
	   public BasePage(WebDriver driver)
	     {
		     this.driver=driver;
		     PageFactory.initElements(driver,this);
	     }
	   
	   //method to make a random string
	   
	   public String randomeString() {
			String generatedString = RandomStringUtils.randomAlphabetic(5);
			return (generatedString);
		}
	   	   
}


