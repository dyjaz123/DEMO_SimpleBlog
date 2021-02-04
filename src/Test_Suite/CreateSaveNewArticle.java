package Test_Suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Supporting_Classes.LogIn;
import Supporting_Classes.SaveNewArticle;
import Supporting_Classes.CreateArticle;
import Supporting_Classes.GoToArticles;
import org.junit.*;



public class CreateSaveNewArticle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-blog.herokuapp.com/");
		
		LogIn.logIn(driver);
		Thread.sleep(1000);
		
		GoToArticles.gotoArticles(driver);
		Thread.sleep(1000);
		
		CreateArticle.createArticle(driver);
		Thread.sleep(1000);
		
		SaveNewArticle.savenewArticle(driver);
		Thread.sleep(1000);
		
		WebElement ArticleSaveSuccess = driver.findElement(By.id("flash_success"));
		
		Assert.assertEquals("Article was successfully created", ArticleSaveSuccess.getText());
		
		//Note - I would not have the below in a normal test.  Just added it for reference.
		System.out.println(ArticleSaveSuccess.getText());
						
		driver.quit();
		
		
		
		
	 
		

		

	}

}
