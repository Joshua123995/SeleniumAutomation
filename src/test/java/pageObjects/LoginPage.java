package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
		
		// Elements
		@FindBy(xpath = "/html/body/ng-view/div/a[4]")
		WebElement loginButton;

		// Action Methods
		public void clickLogin() {
			loginButton.click();
		}
		
	}

