package classWork;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxClassAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		
		List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
		
//		Check all three checkboxes and uncheck
		for(WebElement checkbox:checkboxes) {
			String vehicle = checkbox.getAttribute("value");
			if(vehicle.equals("Bike")||vehicle.equals("Car")||vehicle.equals("Boat")) {
				checkbox.click();				
			}
			if(checkbox.isSelected()) {
				checkbox.click();
			}
		}
		
//		Check first two checkboxes and uncheck
		for(WebElement checkbox:checkboxes) {
			String vehicle = checkbox.getAttribute("value");
			if(vehicle.equals("Bike")||vehicle.equals("Car")) {
				checkbox.click();
			}
			if(checkbox.isSelected()) {
				checkbox.click();
			}
		}
		
//		Check first and last checkboxes and uncheck
		for(WebElement checkbox:checkboxes) {
			String vehicle = checkbox.getAttribute("value");
			if(vehicle.equals("Bike")||vehicle.equals("Boat")) {
				checkbox.click();
			}
			if(checkbox.isSelected()) {
				checkbox.click();
			}
		}
		
//		Check second and third checkboxes and uncheck
		for(WebElement checkbox:checkboxes) {
			String vehicle = checkbox.getAttribute("value");
			if(vehicle.equals("Car")||vehicle.equals("Boat")) {
				checkbox.click();
			}
			if(checkbox.isSelected()) {
				checkbox.click();
			}
		}
		driver.close();
	}
}
