import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicdropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");
		//webdriver.chrome.driver-.value of path
		
		WebDriver driver = new ChromeDriver();  // only webdiver methods in chrome
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click(); //date option 1
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[29]")).click(); //date by its index value
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // select round trip to display date 2
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click(); // date option 2
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //calender next page
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[49]")).click(); //index for date 2
		
		
		
		//parent child relationship -> //parent xpath //child xpath // for writing dynamic dropdown code without inde. 
		
		
		//  //a[@class='ui-state-default ui-state-active']
		//  
		
				
				////a[@value='BLR'] 
				// (//a[@value='BHO'])[2] 
	}

}
