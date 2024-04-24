package practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practise1 {

//	public static void main(String[] args) {
//	WebDriver driver= new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://demo.automationtesting.in/Static.html");
//	driver.switchTo().newWindow(WindowType.TAB);
//	driver.get("https://www.facebook.com/login/");
//	Set<String> tabs = driver.getWindowHandles();
//	Iterator<String> iterator = tabs.iterator();
//	String parentId = iterator.next();
//	String ChildId = iterator.next();
//	driver.switchTo().window(ChildId);
//	driver.close();
////	driver.close();
////	driver.switchTo().
////	driver.findElement(By.className("gLFyf")).sendKeys("Abcd");
//	
//	driver.switchTo().window(parentId);
//	driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Abcd");
//		WebElement dropDown = driver.findElement(By.name("fromPort"));
//		Select select = new Select(dropDown);
//		select.selectByValue("Paris");
		
//	Actions a = new Actions(driver);
//	WebElement dragable = driver.findElement(By.id("angular"));
//	WebElement dropable = driver.findElement(By.id("droparea"));
//	a.dragAndDrop(dragable, dropable).build().perform();

	@Test
	public void tC1() {
		System.out.println("Test One");
	}
	
	@Test
	public void tC2() {
		System.out.println("Test Two");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
}


