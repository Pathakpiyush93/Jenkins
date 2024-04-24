package practise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
		List<WebElement> btns = driver.findElements(By.className("form-check-input"));
		System.out.println(btns.size());
		for (WebElement btn : btns) {
			String btnName = btn.getAttribute("id");
			if (btnName.contains("radio-button2")) {
				btn.click();
			} else {
				System.out.println("Button does not exist");
			}

		}

	}

}
