import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) 
	{	
		String username = "rahulshettyacademy";
		String password = "learning";
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");//webdriver.chrome.driver-.value of path
		WebDriver driver = new ChromeDriver(); // only webdiver methods in chrome
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
         
		@SuppressWarnings("deprecation")
		WebDriverWait w = new WebDriverWait(driver, 5);
		WebDriverWait s = new WebDriverWait(driver, 10);
		
		practiceAsg(driver,username, password, w,s);

	}

	public static void practiceAsg(WebDriver driver,String username, String password, WebDriverWait w, WebDriverWait s)
	{
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[class='form-control']")));
		WebElement staticdropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByValue("consult");
		
	
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		//w.until(ExpectedConditions.v)
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='btn btn-info']")));
		List<WebElement> phones = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for (int i=0;i<phones.size();i++)
		{
		 phones.get(i).click();
		}
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
		driver.findElement(By.id("country")).sendKeys("Adelaide");
		s.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox2")));
		driver.findElement(By.cssSelector("input[id='checkbox2']")).click(); // not working in this step 
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		
		
	}
}
