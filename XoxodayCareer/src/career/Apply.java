package career;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.xoxoday.com/careers/senior-qa#apply");
		
		driver.findElement(By.id("First-Name")).sendKeys("Tester");
		
		driver.findElement(By.id("Last-Name")).sendKeys("Test");
		
		driver.findElement(By.id("Email")).sendKeys("test@xoxoday.com");
		
		driver.findElement(By.id("Phone-Number")).sendKeys("8454545454");
		
		driver.findElement(By.id("Location"));
		
		driver.findElement(By.id("Current-Salary")).sendKeys("50000");
		
		driver.findElement(By.id("Notice-Period")).sendKeys("30");
		
		driver.findElement(By.id("Linked-In-URL")).sendKeys("https://www.linkedin.com/in/test-1a199236/");
		
		driver.findElement(By.xpath("//label[@class='upload-btn w-file-upload-label']")).click();
		
		driver.findElement(By.xpath("//input[@id='w-node-a469c032-b857-e243-7112-fcb28d56c5ed-01ab3b84']"));
		
	    driver.close();
		
		driver.close();
	}

}
