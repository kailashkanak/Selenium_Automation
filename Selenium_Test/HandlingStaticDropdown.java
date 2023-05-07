package handle;

import org.openqa.selenium.By;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import browsertesting.String;

public class HandlingStaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KAILASH KANAK\\Documents\\BrowserDriver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		String str = dropdown.getFirstSelectedOption().getText();
		System.out.println(str);
		Thread.sleep(1000);
		dropdown.selectByVisibleText("AED");
		str = dropdown.getFirstSelectedOption().getText();
		System.out.println(str);
		
		dropdown.selectByValue("INR");
		str = dropdown.getFirstSelectedOption().getText();
		System.out.println(str); */

		

	}

}
