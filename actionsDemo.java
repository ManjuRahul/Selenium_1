import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");//webdriver.chrome.driver-.value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.au/");
		
		Actions a = new Actions(driver); //new action class
		
		
		// hover mouse to the element
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		
		//send uppercase keys by holding shift
		WebElement type = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		a.moveToElement(type).click().keyDown(Keys.SHIFT).clickAndHold().sendKeys("Hello bro").build().perform();
		a.moveToElement(type).contextClick().build().perform();
	
	}
	
	

}
