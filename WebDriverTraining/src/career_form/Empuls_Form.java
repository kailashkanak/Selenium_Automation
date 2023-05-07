package career_form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empuls_Form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDriver\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.empuls.io/");
		driver.findElement(By.xpath("//*[@class='empuls-cta-nav-2 w-inline-block']")).click();
		driver.findElement(By.id("email-08148ba4-6650-4014-8947-db8cfc559cb4")).sendKeys("kailash.k@xoxoday.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit' and @class='hs-button primary large' and @value='Talk to expert']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'15 mins')]")).click();
		Thread.sleep(3000);
	}

}
