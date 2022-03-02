import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2E_flightbooking {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");//webdriver.chrome.driver-.value of path
		
		WebDriver driver = new ChromeDriver(); // only webdiver methods in chrome
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // Click on round trip radio button
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> countries = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement country :countries)
		{
			
				if(country.getText().equalsIgnoreCase("India"))
				{
				country.click();
				break;
				}

		}
// select to and from destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("be"); //pass keys to get auto suggestion
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])")).click(); //xpath for blr
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("ch");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click(); // Give index as there is another chennai in the page, ie, from address

		
// select depart date and one way
		//driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[10]")).click();
		
// Select number of passengers		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(5000);
		int i=1;		
		while(i<5)
		{
		 driver.findElement(By.id("hrefIncAdt")).click();
		 i++;
		}
			
		driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		
//static drop down - options dont change. (USUALLY WITH TAG SELECT)
		WebElement staticdropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
				
		dropdown.selectByIndex(3); // select by index value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
//search button 
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
