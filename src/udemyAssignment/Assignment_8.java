package udemyAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		
//		We can do it with the down keys 
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("ul#ui-id-1 li:nth-child(2)"))).click().build().perform();
		String selectedCountry = driver.findElement(By.cssSelector("ul#ui-id-1 li:nth-child(2)")).getText();
//		a.moveToElement(driver.findElement(By.cssSelector("ul#ui-id-1 li:nth-child(2)"))).click().build().perform();
		String country = driver.findElement(By.id("autocomplete")).getText();
		if(country.equalsIgnoreCase(selectedCountry)) {
			System.out.println("Both the countries are same");
			
		}
		else {
			System.out.println("Both countries are different");
		}
		

	}

}
