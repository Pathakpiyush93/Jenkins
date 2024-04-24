package basicsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {

	public static void main(String[] args) {
		/*Que: What is Automation Testing?
		 *Ans: To test an application, we write the
		 *code/script to check working of an application.
		 *The steps which we perform manually, in automation
		 *we write code/script to perform same steps in 
		 *automation.
		 *To write code/script we use programming languages and 
		 *automation tools.
		 *We can write code in multiple languages.
		 *C, C++, Java, pearl, ruby, C#, python, JavaScript.
		 *
		 *Que: Which tool you use?
		 *Ans: Selenium WebDriver
		 *
		 *Que: What is selenium WebDriver?
		 *Ans: It is library which automate the browser.
		 *
		 *Que: Which application you automate through selenium?
		 *Ans: Web based application.
		 *
		 *Que: What is web based application?
		 *Ans: To operate an application we need browser and internet.
		 *
		 *Que: What is browser?
		 *Ans: Browser is an interface/medium/link between client/machine
		 *and web application/website.
		 *
		 *Que: What are the different browsers?
		 *Ans: Google Chrome, Internet Explorer, mozila firefox, opera mini,
		 *microsoft edge, UC browser, Safari
		 *
		 *Que: What is a webpage?
		 *Ans: Webpage is a window which contains information about
		 *business.
		 *
		 *Que: How web page holds the information?
		 *Ans: Web page holds information in html (hyperText markup language)
		 *
		 *Que: What is html?
		 *Ans: It is a web scripting language.
		 *		It is a collection of different components(web element) present on web page.
		 *
		 *Que: What is a web element?
		 *Ans: Each and every component displayed on web page is called as web element.
		 *		Ex.: username field, password field, sign button, hyperlink, text, alphabet,
		 *			icons, images, etc.
		 *
		 *Que: How we identify web element?
		 *Ans: The web element in html is displayed with unique identifier 
		 *		in the form of key and value (tagname, attribute name and attribute value).
		 *
		 *Que: What is html tag?
		 *Ans: Any web element with unique identifier in html code written 
		 *		between "<" and ">".
		 *
		 *To identify unique identifier from html, we use locators.
		 *
		 *Que: How we locate unique identifier/webelement in html?
		 *Ans: To locate/identify web element in html, we use locators.
		 *
		 *Que: What are the different types of locators?
		 *Ans: 	Id
		 *		Name
		 *		Link Text
		 *		Partial link text
		 *		Class name
		 *		Tag name
		 *		Xpath
		 *		CSS
		 */
		
		/*Selenium Automation
		 * 
		 * WebDriver Method
		 * Web driver is an abstract method/interface between script and browser.
		 * 
		 * WebDriver methods
		 *1. driver.get()
		 *2. getCurrentUrl()
		 *3. getPageSource()
		 *4. getTitle()
		 *5. getWindowHandle()
		 *6. getWindowHandles()
		 *7. close()
		 *8. quit()
		 *9. findElement()
		 *10. findElements()
		 *11. manage()  
		 *12. navigate() 
		 *13. switchTo()
		 *14. notify()
		 *15. notifyAll()
		 *16. toString()
		 *17. wait()
		 *18. refresh()
		 */
		
	
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/");
		 driver.manage().window().maximize();
		 driver.close();
		
	}

}

