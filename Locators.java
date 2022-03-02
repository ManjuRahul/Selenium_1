import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");  //webdriver.chrome.driver-.value of path
		
		WebDriver driver = new ChromeDriver(); // only webdiver methods in chrome
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); //wait until synchronization, i,e. Wait for elements to showup
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // load the URL
		
		driver.findElement(By.id("inputUsername")).sendKeys("manjurahul"); // find the textbox by id
		
		driver.findElement(By.name("inputPassword")).sendKeys("rahul@123"); // find password by name
		
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // Setup Css selector
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@Placeholder='Name']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("manjurahul2606@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("0434980484");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9742537690"); //traverse from parent to child
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //xpath for element
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	}

}

// CSS selectors syntax: 1. Classname -> Tagname.classname
//						 2. ID -> Tagname#id
//						 3. General -> Tagname[attribute='value']
//						 4. Indexing -> Tagname[attribute='value']:nth-child(index) 
//						 5. Just by tags -> parent child[index]
// 						 6. Regular expressions -> Tagname[attribute*='partialvalue'] ****** dynamically changing elements. 
//						 7. Parent and just tag name -> Parent tagname[attribute='value'] child tagname

// Xpath syntax : 		 1. general -> //Tagname[@attribute='value']
//						 2. Indexing -> //Tagname[@attribute='value'][index]
//						 3. Traversing Just by tags -> //parent/child[index]
// 						 4. Traversing(2) -> //Tagname[@attribute='value']/childTagname[index]
// 						 5. Regular expressions -> Tagname[contains(@attribute,'partialValue')] ***** dynamically changing elements.
// 						 6. Button by text -> Tagname[text()='Text on button']
//						 7. Parent and just tag name -> //Parenttagname[@attribute='value']/childtagname

// Waits 				 1. Thread.sleep(milliseconds);
//						 2. driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value of seconds));
