package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Date;


public class SignUp {
	public static void signUp(WebDriver driver) throws InterruptedException{
		Date date= new Date();
		long time = date.getTime();		
		
		driver.findElement(By.className("btn-success")).click();
		Thread.sleep(1000);		
		driver.findElement(By.id("user_username")).sendKeys("dytest" + time);
		driver.findElement(By.id("user_email")).sendKeys("dytest" + time + "@testemail.com");
		driver.findElement(By.id("user_password")).sendKeys("Password1!");
		driver.findElement(By.id("submit")).click();	
				
	}

}
