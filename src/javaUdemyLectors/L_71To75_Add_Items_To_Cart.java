package javaUdemyLectors;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_71To75_Add_Items_To_Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		String[] itemNeeded = { "Cucumber", "Brocolli", "Beetroot", "Brinjal"};
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

//			Format it to get actual vegetable name
//			Brocolli - 1 Kg
//			name[0]=Brocolli 
//			name[1]=1 Kg

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

//			Convert array into arrayList>> we first create array because array consume less memory than arrayList
//			Check whether name you extracted is present in arrayList or not

			List<String> itemNeededList = Arrays.asList(itemNeeded);

			if (itemNeededList.contains(formattedName)) {
				j++;
//				Click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemNeededList.size()) {
					break;
				}
			}

		}
	}

}
