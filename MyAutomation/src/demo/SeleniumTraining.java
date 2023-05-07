package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTraining {
	public static void main(String []args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\eclipse-workspace\\MyAutomation\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.xoxoday.com/book-a-demo");
			driver.findElement(By.name("firstname")).sendKeys("KAILASH TESTER");
			driver.findElement(By.id("email-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("kailash.k@xoxoday.com");
			driver.findElement(By.id("company-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("XOXODAY");
			driver.findElement(By.id("phone-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("9801881439");
			Select sel = new Select(driver.findElement(By.id("country-666f1de3-3223-4635-89ce-ee6da9d099fb")));
			sel.selectByVisibleText("Albania");
			driver.findElement(By.name("message")).sendKeys("Please ignore this . This Testing is done only for testing purpose");
			driver.findElement(By.xpath("//input[@type='submit' and @value='SCHEDULE DEMO']")).click();
			System.out.println("Thank you!! See you Again");
			driver.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
