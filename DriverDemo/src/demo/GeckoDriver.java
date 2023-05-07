package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KAILASH KANAK\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");

	}

}
