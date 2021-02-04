package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {
	public static void logIn(WebDriver driver) throws InterruptedException {
		driver.findElement(By.className("btn-primary")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("session_email")).sendKeys("dytestuser999@testemail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("session_password")).sendKeys("Password1!");
		Thread.sleep(1000);
		driver.findElement(By.className("btn-primary")).click();
		
	}
}
