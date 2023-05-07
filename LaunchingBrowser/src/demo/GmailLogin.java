package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDriver\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("identifierId")).sendKeys("kailash.moon12@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.findElement(By.name("Passwd")).sendKeys("kailash@pushpa12");
		Thread.sleep(1000);
		driver.close();		
		
		

	}

}
