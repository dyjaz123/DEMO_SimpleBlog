package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaveNewArticle {
	public static void savenewArticle(WebDriver driver) {
		driver.findElement(By.name("commit")).click();
		
	}

}
