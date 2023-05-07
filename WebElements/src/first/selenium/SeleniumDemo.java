package first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Browser_Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://xoxoday.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
        String page_title = driver.getTitle();
        System.out.println(page_title);
        driver.findElement(By.id("email-131e6f20-6466-421b-a7ed-4078bdeb5954")).sendKeys("kailashmoontester@xoxoday.com");
        driver.findElement(By.className("hs-button primary large")).click();
        
	}

}
