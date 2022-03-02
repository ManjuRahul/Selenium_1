import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");
		//webdriver.chrome.driver-.value of path
		
		WebDriver driver = new ChromeDriver();  // only webdiver methods in chrome
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//static drop down - options dont change. (USUALLY WITH TAG SELECT)
		WebElement staticdropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		
		dropdown.selectByIndex(3); // select by index value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
int i=1;		
	while(i<5)
	{
	 driver.findElement(By.id("hrefIncAdt")).click();
	 i++;
	}
	driver.findElement(By.id("btnclosepaxoption")).click();

}
}