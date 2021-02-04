package Test_Suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Supporting_Classes.SignUp;

public class CreateNewAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-blog.herokuapp.com/");
		
		SignUp.signUp(driver);
		
		//Note that I have commented out the below assertion.  I am not 100% sure but I don't
		//think that there is a way to check to see if the new account was added successfully.
		//A welcome banner does display but the user name has to be different each time and I don't 
		//know if I have a way of capturing that.  I may come back to this later.
		
		//WebElement welcome = driver.findElement(By.id("flash-success"));		
		//Assert.assertEquals("Welcome to the alpha blog" + userName, welcome.getText());
		
		driver.quit();		

	}

}
