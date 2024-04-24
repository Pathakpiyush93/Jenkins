package javaUdemyLectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_95_Open_Links_In_Separete_Tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		Below code will show all the links present on the web page
		System.out.println(driver.findElements(By.tagName("a")).size());

//		Below code will limit the scope of web element
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());

//		Below code will limit the scope of web element
		WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());

//		Opening all the links present in column in separate tabs
		for (int i = 1; i < column.findElements(By.tagName("a")).size(); i++) {
			String clickLinkInNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickLinkInNewTab);

		}

	}

}
