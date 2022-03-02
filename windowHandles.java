import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");//webdriver.chrome.driver-.value of path
		WebDriver driver = new ChromeDriver();
		@SuppressWarnings("deprecation")
		WebDriverWait w = new WebDriverWait(driver,5);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> It = windows.iterator();
		String Parent = It.next();
		String Child = It.next();
		driver.switchTo().window(Child);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class='im-para red']")));
		
		String[] txt = driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split(" ");
		String newtxt = txt[4];
		//System.out.println(newtxt);
		driver.switchTo().window(Parent);
		
		driver.findElement(By.id("username")).sendKeys(newtxt);
		
		
	}

}
