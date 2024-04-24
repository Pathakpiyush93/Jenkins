package classWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		WebElement cars = driver.findElement(By.id("cars"));
		Select select = new Select(cars);
		select.selectByIndex(2); Thread.sleep(2000);
		Select select1 = new Select(cars);
		select1.selectByValue("audi"); Thread.sleep(2000);
		Select select2 = new Select(cars);
		select2.selectByVisibleText("Saab"); Thread.sleep(2000);
		driver.close();
	}

}
