package javaUdemyLectors;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class L_98_Calender_UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String month = "6";
		String day = "15";
		String year = "2027";
		String[] expectedList = { month, day, year };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("input.react-date-picker__inputGroup__input")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label span")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label span")).click();

//		Below steps we concat the given values
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector("button.react-calendar__year-view__months__month"))
				.get(Integer.parseInt(month) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + day + "']")).click();

		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i = 0; i < actualList.size(); i++) {
			actualList.get(i).getAttribute("value");
			Assert.assertEquals(expectedList[i], actualList.get(i).getAttribute("value"));
		}
		driver.close();

	}

}
