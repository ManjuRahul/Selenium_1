import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_intro {

	public static void main(String[] args) {
		
		
		// Invoking the browser
		// Chrome browser - Chromedriver -> Methods
		// Firefox - FirefoxDriver -> Methods
		// Method names will be same irrespective of drivers
		// Webdriver defines all the method names for all browser drivers
		
		
		// ChromeDriver driver = new ChromeDriver // Uses webdriver + own class methods
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");
		//webdriver.chrome.driver-.value of path
		
		WebDriver driver = new ChromeDriver();  // only webdiver methods in chrome
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}

}
