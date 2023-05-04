package testCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.ToDoPage;


public class runTask {

	@Test
	public void test_runTask() throws InterruptedException
	
	{
		
		System.setProperty("webdriver.http.factory", "jdk-http-client"); 
		
		WebDriver driver = new ChromeDriver(); // initialising the driver using chrome
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // putting an implicit wait to prevent the element from not being found
		
		driver.get("https://todo-list-login.firebaseapp.com/"); // navigating to the webpage
		
		String parentWindowHandler = driver.getWindowHandle(); // Storing the current window
		String subWindowHandler = null;
		
		driver.findElement(By.xpath("/html/body/ng-view/div/a[4]")).click();

		Set <String> handles = driver.getWindowHandles(); // geting all window handles so that i can login to the github pop up
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window to login with github
		
		driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("TestNG123321"); // typing username
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("TestNG123#"); // typing password
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/form/div/input[12]")).click(); // clicking login

		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		LoginPage lp=new LoginPage(driver); // creating an object of the login page 
		
		ToDoPage td = new ToDoPage(driver); // creating an object of the to do page
		
		for (int i=0;i<10;i++) // here basically i am adding 10 random strings by calling the method in the BasePage
		{
			td.typeStringInputBox();
			td.clickaddListButton();
		}
		
		td.clicksignOutButton(); // here i am signing out
		
		driver.findElement(By.xpath("/html/body/ng-view/div/a[4]")).click(); // relogging in, since my credentials are saved i dont need to type again
		
		// here i am removing the the last 6 elements, since its only 6 i have hardcoded them
		// but if there was more than 6 i would extract all the elements into a list and iterate through
		// them to only remove the ones i want
		
		td.remove10();
		td.remove9();
		td.remove8();
		td.remove7();
		td.remove6();
		td.remove5();

		//once it reaches the end the test case will pass.
		
	}

}
