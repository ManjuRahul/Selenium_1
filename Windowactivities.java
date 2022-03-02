import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowactivities {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");  //webdriver.chrome.driver-.value of path
		
		WebDriver driver = new ChromeDriver(); // only webdiver methods in chrome
		driver.manage().window().maximize(); //maximize window
		driver.get("https://www.google.com"); //will wait untill all components in the page is loaded. (inbuilt synch wait)
		driver.navigate().to("https://www.gmail.com"); 
		driver.navigate().back();
		driver.navigate().forward(); 
	}

}
