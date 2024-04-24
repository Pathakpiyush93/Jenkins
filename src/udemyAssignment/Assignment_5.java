package udemyAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();

//		Step by step we need to move to the frames
//		First we switch to the top frame where middle frame is present
		WebElement frameTop = driver.findElement(By.cssSelector("frame[name='frame-top']"));
		driver.switchTo().frame(frameTop);

//		Then from the top frame we switch to the middle frame
		WebElement frameMiddle = driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		driver.switchTo().frame(frameMiddle);
		
//		Switching frame by its name
//		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
