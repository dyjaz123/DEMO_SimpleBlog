package Test_Suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Supporting_Classes.LogIn;
import Supporting_Classes.LogOut;
import org.junit.*;


public class LogOutUser {
	 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-blog.herokuapp.com/");
		
		LogIn.logIn(driver);
		Thread.sleep(3000);		
		LogOut.logOut(driver);
		
		WebElement LogOutConfirm = driver.findElement(By.id("flash_success"));
		
		Assert.assertEquals("You have logged out", LogOutConfirm.getText());
		
		//Note - I would not have the below in a normal test.  Just added it for reference.
		System.out.println(LogOutConfirm.getText());
				
		driver.quit();
		
	}

}
