package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-automation-practice.netlify.app/checkboxes");
		List<WebElement> checks = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checks.size());
		for(WebElement check:checks) {
			String checkName = check.getAttribute("id");
			if(checkName.contains("checkbox2")||checkName.contains("checkbox3")) {
				check.click();
			}
			else {
				System.out.println("Checkbox does not exist");
			}
			if(check.isSelected()) {
				check.click();
			}
		}
	}

}
