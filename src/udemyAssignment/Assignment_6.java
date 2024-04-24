package udemyAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String checkBox = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByVisibleText(checkBox);
		driver.findElement(By.id("name")).sendKeys(checkBox);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		if (alert.contains(checkBox)) {
			System.out.println("Right option is selected");
		} else {
			System.out.println("Wrong option is selected");
		}
		driver.switchTo().alert().accept();
	}

}
