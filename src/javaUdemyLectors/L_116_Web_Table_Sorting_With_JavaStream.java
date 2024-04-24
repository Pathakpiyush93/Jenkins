package javaUdemyLectors;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class L_116_Web_Table_Sorting_With_JavaStream {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

//		Click on the column to sort 

		driver.findElement(By.cssSelector("th[role='columnheader']")).click();

//		Capture all the web element into list

		List<WebElement> veg = driver.findElements(By.cssSelector("tr td:nth-child(1)"));

//		Capture text of all web element into new (original) list

		List<String> originalList = veg.stream().map(s -> s.getText()).collect(Collectors.toList());

//		Using java stream sort the original list step-3 >> sorted list

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

//		Compare original list vs sorted list

		Assert.assertTrue(originalList.equals(sortedList));
		driver.close();

	}

}
