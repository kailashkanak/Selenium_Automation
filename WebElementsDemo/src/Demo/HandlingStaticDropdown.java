package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import browsertesting.String;

public class HandlingStaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\Documents\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
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
		System.out.println(str);



	}

}
