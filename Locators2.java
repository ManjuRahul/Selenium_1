import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");  //webdriver.chrome.driver-.value of path
		
		WebDriver driver = new ChromeDriver(); // only webdiver methods in chrome
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); //wait until synchronization, i,e. Wait for elements to showup
		
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // load the URL
		
		driver.findElement(By.id("inputUsername")).sendKeys(name); // find the textbox by id
		
		driver.findElement(By.name("inputPassword")).sendKeys(password); // find password by name
		
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();

		driver.close();


	}
	public static String getPassword(WebDriver driver) throws InterruptedException

	{	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //xpath for element
		String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
		String[] Extractpass = passwordtext.split("'"); // Please use temporary password 'rahulshettyacademy' to Login.
														// 0th index = Please use temporary password 
														// 1st index = rahulshettyacademy' to Login.
		String Password = Extractpass[1].split("'")[0];
		return Password;
			
	}
}
//Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1] 
//header/div/button[1]/parent::div/button[2]


