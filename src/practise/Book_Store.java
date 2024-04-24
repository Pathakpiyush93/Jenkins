package practise;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_Store {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/books");
		driver.findElement(By.linkText("Git Pocket Guide")).click();
		String expectedText= driver.findElement(By.id("userName-value")).getText();
		System.out.println(expectedText);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("newUser")).click();
		driver.findElement(By.id("firstname")).sendKeys("Piyush");
		driver.findElement(By.id("lastname")).sendKeys("Pathak");
		driver.findElement(By.id("userName")).sendKeys("piyushpathak");
		driver.findElement(By.id("password")).sendKeys("Piyush@123");
		driver.findElement(By.id("recaptcha-anchor")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("register")).click();
		driver.switchTo().alert().accept();
		

	}

}
