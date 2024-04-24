package udemyAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Number of Rows in the table is "+ driver.findElements(By.cssSelector("table.table-display tr")).size());
		System.out.println("Number of Columns in the table is "+driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[1]/th")).size());
		WebElement table = driver.findElement(By.id("product"));
		List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//		System.out.println(secondrow.get(0).getText());
//		System.out.println(secondrow.get(1).getText());
//		System.out.println(secondrow.get(2).getText());
		
//		Put above code in for loop
		for (int i=0; i<secondrow.size(); i++) {
			System.out.println(secondrow.get(i).getText());
		}
	}

}
