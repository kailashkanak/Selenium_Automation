package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		try
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\eclipse-workspace\\RahulShettyLoginForm\\browserdriver\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumDriver\\BrowserDriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("inputUsername")).sendKeys("Kailash Kanak");
			driver.findElement(By.id("inputPassword")).sendKeys("kumar");
			driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
			driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
			driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
			System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
