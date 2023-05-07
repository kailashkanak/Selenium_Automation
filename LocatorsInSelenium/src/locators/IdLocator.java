package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("inputUsername")).sendKeys("Kailash Kanak");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("kumar");
		driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
		driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		//This will throw error as password is incorrect. To capture the error message, see the below line
		System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
		
		//To click on "Forgot your password" text link
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Kailash Kanak");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("kailash.moon12@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("833347474");
		
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String messg = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println("Password = "+messg);
		//clicking on -- Go To Login Button
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("Kailash Kanak");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		
		
		
		
		

	}

}
