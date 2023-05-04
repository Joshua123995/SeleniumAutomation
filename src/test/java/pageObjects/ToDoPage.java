package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToDoPage extends BasePage {

	public ToDoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Elements
		@FindBy(xpath = "/html/body/ng-view/div/div[2]/div[2]/button")
		WebElement addListButton;
		
		@FindBy(xpath = "/html/body/ng-view/div/div[2]/div[1]/input")
		WebElement stringInputBox;
		
		@FindBy(xpath = "/html/body/ng-view/div/nav/div/ul/li/div/button")
		WebElement signOutButton;
		
		// For the remove buttons i have hardcoded them
		// if there was more than 6 i would extract all the elements into a list and iterate through
		// them to only remove the ones i want
		
		@FindBy(xpath = "/html/body/ng-view/div/div[3]/div/ul/li[10]/div/div[2]/button")
		WebElement removeButtons10;
		
		@FindBy(xpath = "/html/body/ng-view/div/div[3]/div/ul/li[9]/div/div[2]/button")
		WebElement removeButtons9;
		
		@FindBy(xpath = "/html/body/ng-view/div/div[3]/div/ul/li[8]/div/div[2]/button")
		WebElement removeButtons8;
		
		@FindBy(xpath = "/html/body/ng-view/div/div[3]/div/ul/li[7]/div/div[2]/button")
		WebElement removeButtons7;
		
		@FindBy(xpath = "/html/body/ng-view/div/div[3]/div/ul/li[6]/div/div[2]/button")
		WebElement removeButtons6;
		
		@FindBy(xpath = "/html/body/ng-view/div/div[3]/div/ul/li[5]/div/div[2]/button")
		WebElement removeButtons5;
		
		
	// Action Methods
			public void clickaddListButton() {
			addListButton.click();
		}
			
			//randomly generate a string inherited from BasePage
			public void typeStringInputBox() {
				stringInputBox.sendKeys(randomeString());
			}
			
			public void clicksignOutButton() {
				signOutButton.click();
			}
			
			public void remove5() {
				removeButtons5.click();
			}
			public void remove6() {
				removeButtons6.click();
			}
			public void remove7() {
				removeButtons7.click();
			}
			public void remove8() {
				removeButtons8.click();
			}
			public void remove9() {
				removeButtons9.click();
			}
			public void remove10() {
				removeButtons9.click();
			}
			
			
			
			
			
}
