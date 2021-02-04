package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {
	public static void logOut(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")).click();
		
				
	}

}
