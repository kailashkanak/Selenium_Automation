package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeTest {
	@Test
	public static void automationScript() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KAILASH KANAK\\eclipse-workspace\\OrangeHRM\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.name("firstName")).sendKeys("KAILASH");
		Thread.sleep(500);
		driver.findElement(By.name("middleName")).sendKeys("PRASAD");
		driver.findElement(By.name("lastName")).sendKeys("KANAK");

		driver.findElement(By.xpath("//*[text()='Employee Id']/following::div[1]")).clear();
		driver.findElement(By.xpath("//*[text()='Employee Id']/following::div[1]")).sendKeys("007");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
