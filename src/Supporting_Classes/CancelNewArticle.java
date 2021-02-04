package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CancelNewArticle {
	public static void cancelnewArticle(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/a")).click();
	}

}
