import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class greenKart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");//webdriver.chrome.driver-.value of path
		
		WebDriver driver = new ChromeDriver(); // only webdiver methods in chrome
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //implicit wait
		WebDriverWait w = new WebDriverWait(driver, 5); //explicit wait

		// Items we need to add to cart 
				
		String[] veggies = {"Tomato", "Brocolli", "Cucumber", "Walnuts"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(5000);
		addItems(driver,veggies, w);
		
		//greenKart gk = new greenKart();
		

		
// Iterate through all the items available in the website. 
		

	}
	public static void addItems(WebDriver driver, String[] veggies, WebDriverWait w) throws InterruptedException
	{
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i=0; i<products.size(); i++)
		{	
			
			String[] veggiesAvailable = products.get(i).getText().split("-");
			String formattedVeggies = veggiesAvailable[0].trim();
			

			
			List veggies1 = Arrays.asList(veggies);
			
			int j=0;
			if(veggies1.contains(formattedVeggies))
				
				{
				j++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					if(j==veggies.length)
					{
						break;
					}
				}
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		//Thread.sleep(2000);
		driver.findElement(By.className("promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoinfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoinfo")).getText());
	}
	

}
