package javaUdemyLectors;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L_81_Explicit_Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		Applying explicit wait common sytex
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemNeeded = { "Cucumber", "Brocolli", "Beetroot", "Brinjal" };
		addItem(driver, itemNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

//		Applying explicit wait to particular part of the code
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));

		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	public static void addItem(WebDriver driver, String[] itemNeeded) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

//			Format it to get actual vegetable name
//			Brocolli - 1 Kg
//			name[0]=Brocolli 
//			name[1]=1 Kg

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

//			Convert array into arrayList>> we first create array because array consume less memory than arrayList
//			Check whether name you extracted is present in arrayList or not

			List<String> itemNeededList = Arrays.asList(itemNeeded);

			if (itemNeededList.contains(formattedName)) {
				j++;
//				Click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemNeededList.size()) {
					break;
				}
			}

		}

	}

}
