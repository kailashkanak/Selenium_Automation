package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\eclipse-workspace\\Java-Selenium\\Browser_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.xoxoday.com/");
		
		driver.findElement(By.xpath("//a[@class='btn-with-arrow purple for-desktop w-button']")).click();
		
		driver.findElement(By.id("firstname-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("Test Tester");
		
		driver.findElement(By.id("email-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("test@xoxoday.com");

		driver.findElement(By.id("company-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("Xoxoday");
		
		//driver.findElement(By.xpath("//select[@id='phone_ext-666f1de3-3223-4635-89ce-ee6da9d099fb']")).click();
		driver.findElement(By.id("phone-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("7657568777");
		
		//*****Handling Drop down *****
		
		Select select = new Select(driver.findElement(By.id("country-666f1de3-3223-4635-89ce-ee6da9d099fb")));
		
		select.selectByValue("Australia");
		
		driver.findElement(By.id("message-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("Please ignore this");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='hs-button primary large']")).click();
	
	}

}
