package javaUdemyLectors;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_102_Table_Grids_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//		Scrolling the web page using JavaScript
		JavascriptExecutor js = (JavascriptExecutor) driver;

//		To scroll the window we use window.scrollBy(x,y)
		js.executeScript("window.scrollBy(0,500)");

//		To scroll something which is in the window we use below method
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum = 0;
		for (int i = 0; i < value.size(); i++) {

			sum = sum + Integer.parseInt(value.get(i).getText());

		}

		System.out.println(sum);

	}

}
