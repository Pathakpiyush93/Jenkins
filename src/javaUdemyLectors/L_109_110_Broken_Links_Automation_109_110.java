package javaUdemyLectors;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_109_110_Broken_Links_Automation_109_110 {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		First get all urls tied up with the link using selenium
//		Java methods call the URL's and get you the status code
//		If status code>400 then the URL is not working
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		HttpsURLConnection conn =(HttpsURLConnection)new URI(url).toURL().openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int code = conn.getResponseCode();
		System.out.println(code);
			
		
	}

}
