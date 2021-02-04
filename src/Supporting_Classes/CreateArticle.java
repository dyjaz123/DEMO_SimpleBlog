package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateArticle {
	public static void createArticle(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/p/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("article_title")).sendKeys("Test Article Title");
		Thread.sleep(1000);
		driver.findElement(By.id("article_description")).sendKeys("Test Article Description.");
				
	}

}
