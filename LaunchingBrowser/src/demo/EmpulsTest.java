package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmpulsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDriver\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://xoxoday.com");
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div[1]/div[3]/a[1]/div")).click();
		driver.findElement(By.id("email-phone")).sendKeys("kailash.k@xoxoday.com");
		driver.findElement(By.xpath("//*[@id=\"xoxoday-webapp\"]/div[1]/div/div/div/div[3]/div/button")).click();
		driver.findElement(By.name("password")).sendKeys("Xoxo@1234");
		driver.findElement(By.xpath("//*[@id=\"xoxoday-webapp\"]/div[1]/div/div/div/div[6]/div/button")).click();
		Thread.sleep(1000);
		driver.close();
		

	}

}
