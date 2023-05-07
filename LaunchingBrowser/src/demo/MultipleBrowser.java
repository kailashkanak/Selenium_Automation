package demo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String browser;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter browser of your choice");
		browser = obj.next();
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDriver\\BrowserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumDriver\\BrowserDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://xoxoday.com");
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div[1]/div[3]/a[1]/div")).click();
		driver.findElement(By.id("email-phone")).sendKeys("kailash.k@xoxoday.com");
		
		Thread.sleep(1000);
		driver.close();
	}

}
