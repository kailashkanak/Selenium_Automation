package browsertesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\Documents\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("Page Title=" + driver.getTitle());
		System.out.println("Page URL=" +driver.getCurrentUrl());
		
		driver.findElement(By.id("inputUsername")).sendKeys("kailash Kanak");
		driver.findElement(By.name("inputPassword")).sendKeys("kumar");
		driver.findElement(By.className("signInBtn")).click();
		
		//To capture error message text
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		// Reset password
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Kailash");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kailash.moon12@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("654544557");
		//driver.findElement(By.xpath("//button[@class='reset-pwd-btn']']")).click();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//clicking on go to login button to go back to login page
		
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		// Code to fill the login page
		
		driver.findElement(By.id("inputUsername")).sendKeys("kailash kanak");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		System.out.println("Successfully Logged In");
		//driver.close();

	}

}
