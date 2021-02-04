package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoToArticles {
	public static void gotoArticles(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a")).click();
	}

}
