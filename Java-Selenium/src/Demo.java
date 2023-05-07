import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\eclipse-workspace\\Java-Selenium\\Browser_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath("//a[@id='u_0_0_68']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'u_d_b_z/')]")).sendKeys("Kailash");

		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("test");
		//Thread.sleep(3000);
	}

}
