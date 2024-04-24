package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.knowledgeware.in/final.html");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Piyush");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd123");
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("Abcd123");
		

	}

}
