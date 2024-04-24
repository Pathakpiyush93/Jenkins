package classWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);

		List<WebElement> radioBtn = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement radio:radioBtn) {
			String lang = radio.getAttribute("value");
			if(lang.equals("HTML")) {
				radio.click();
			}
		}
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@name='age']"));
		for(WebElement radio: radios) {
			String age = radio.getAttribute("id");
			if(age.equals("age2")) {
				radio.click();
			}
			
		}
		driver.close();
	}

}
