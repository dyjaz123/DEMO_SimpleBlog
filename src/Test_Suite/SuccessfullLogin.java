package Test_Suite;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Supporting_Classes.LogIn;

public class SuccessfullLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-blog.herokuapp.com/");
		
		LogIn.logIn(driver);
		
        WebElement LogInConfirm = driver.findElement(By.id("flash_success"));
		
		Assert.assertEquals("You have successfully logged in!", LogInConfirm.getText());
		
		//Note - I would not have the below in a normal test.  Just added it for reference.
		System.out.println(LogInConfirm.getText());
				
		driver.quit();
		

	}

}
