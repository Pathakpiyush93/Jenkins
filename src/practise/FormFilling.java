package practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFilling {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "P:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Piyush Pathak");
		driver.findElement(By.name("email")).sendKeys("pathakpiyush93@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Piyush@123");
		driver.findElement(By.id("exampleCheck1")).click();
		Select s =new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		s.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("11111993");	
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		String successMessage=driver.findElement(By.cssSelector(".alert-dismissible")).getText();
		System.out.println(successMessage);
		
		
		
		
		
		

	}

}
