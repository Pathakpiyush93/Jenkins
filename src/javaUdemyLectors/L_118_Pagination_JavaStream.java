package javaUdemyLectors;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class L_118_Pagination_JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

//		Click on the column to sort 

		driver.findElement(By.cssSelector("th[role='columnheader']")).click();

//		Capture all the web element into list

		List<WebElement> veg = driver.findElements(By.xpath("//tr/td[1]"));

//		Capture text of all web element into new (original) list

		List<String> originalList = veg.stream().map(s -> s.getText()).collect(Collectors.toList());

//		Using java stream sort the original list step-3 >> sorted list

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

//		Compare original list vs sorted list

		Assert.assertTrue(originalList.equals(sortedList));

//		Scan the name column with get text >>beans>> print the price of beans

		List<String> price;
		do {
			List<WebElement> row = driver.findElements(By.xpath("//tr/td[1]"));

			price = row.stream().filter(s -> s.getText().contains("Rice")).map(s -> getVeggiePrice(s))
					.collect(Collectors.toList());
			price.forEach(s -> System.out.println(s));

			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1);

	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String veggiePrice = s.findElement(By.xpath("following-sibling:: td[1]")).getText();
		return veggiePrice;

	}

}
