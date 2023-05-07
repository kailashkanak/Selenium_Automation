package selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumCode {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Browser_Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.xoxoday.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}
}
