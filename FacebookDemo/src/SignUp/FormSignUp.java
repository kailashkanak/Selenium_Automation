package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='u_0_0_7v']")).click();
		driver.findElement(By.xpath("//input[@id='u_m_b_q/' and @name='firstname']")).sendKeys("Mayank");

	}

}
