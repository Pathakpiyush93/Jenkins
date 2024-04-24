package autoIT_Practise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement element = driver.findElement(By.id("file-upload"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).click().perform();
		String[] cmdArray = new String [2];
		cmdArray[0]="C:\\Users\\user\\OneDrive\\Desktop\\AutoIT\\FileUpload.exe";
		cmdArray[1]="C:\\Users\\user\\OneDrive\\Desktop\\Demofolder\\Resume.txt";
		
		
		
		Runtime runtime = Runtime.getRuntime();
		Process process=runtime.exec(cmdArray);
//		  Runtime.getRuntime().exec("C:\\Users\\user\\OneDrive\\Desktop\\AutoIT\\FileUpload.exe");
		   
		   
		   
//           Process proc = rt.exec("C:\\Users\\user\\OneDrive\\Desktop\\AutoIT\\FileUpload.exe");
//		"C:\\Users\\user\\OneDrive\\Desktop\\AutoIT\\FileUpload.exe"
//		pb.command("C:\\Users\\user\\OneDrive\\Desktop\\AutoIT\\FileUpload.exe");
//        		 runtime.exec("C:\\Users\\user\\OneDrive\\Desktop\\AutoIT\\FileUpload.exe");
//		Runtime.getRuntime#exec("C:\\Users\\user\\OneDrive\\Desktop\\AutoIT\\FileUpload.exe");

	}

}
