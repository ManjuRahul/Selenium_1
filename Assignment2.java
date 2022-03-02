import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/manjurahul/Downloads/chromedriver");
		//webdriver.chrome.driver-.value of path
		
		WebDriver driver = new ChromeDriver();  // only webdiver methods in chrome
		
		String name = "Manju Rahul";
		String email = "manjurahul2606@gmail.com";
		String password = "rahul123";
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys(name);
		driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys(email);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(password);
		driver.findElement(By.id("exampleCheck1")).click();
		
		//driver.findElement(By.xpath("//select[@class='form-control']/option")).click();
		
		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(gender);
		dropdown.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.className("form-control")).sendKeys("26/06/1996");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());  
		
		
		
		
	}

}

//WebElement staticdropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		//Select dropdown = new Select(staticdropdown);
		
		//dropdown.selectByIndex(3); // select by index value
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		//dropdown.selectByValue("INR");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		
