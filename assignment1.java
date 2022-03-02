import java.lang.reflect.Array;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");
		//webdriver.chrome.driver-.value of path
		
		WebDriver driver = new ChromeDriver();  // only webdiver methods in chrome
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> checkbox = driver.findElements(By.xpath("(//input[@type='checkbox'])"));
	
//for (int i=0;i<=3;i++)	
	int i=0;
		while (i<1)
		
		{
			checkbox.get(i).click();
			System.out.println(checkbox.get(i).isSelected());
			checkbox.get(i).click();
			System.out.println(checkbox.get(i).isSelected());
			i++;
			
		}
		System.out.println(driver.findElements(By.cssSelector("input[type='Checkbox']")).size());
}

}
