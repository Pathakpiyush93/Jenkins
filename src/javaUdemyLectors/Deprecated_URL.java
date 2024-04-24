package javaUdemyLectors;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deprecated_URL {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		First get all urls tied up with the link using selenium
//		Java methods call the URL's and get you the status code
//		If status code>400 then the URL is not working
//		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection) new URI(url).toURL().openConnection();			conn.setRequestMethod("HEAD");			
		conn.connect();			
		int responseCode = conn.getResponseCode();	
		System.out.println(responseCode);
		
		
//		Below method is deprecated
		
		
//		HttpsURLConnection conn =(HttpsURLConnection)new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int code = conn.getResponseCode();
//		System.out.println(code);
			

	}

}
