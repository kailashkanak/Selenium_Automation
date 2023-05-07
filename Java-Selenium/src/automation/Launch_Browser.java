package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch_Browser {

	public static void main(String[] args) {
		
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\eclipse-workspace\\Java-Selenium\\Browser_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://xoxoday.com");
		String title = driver.getTitle();
		System.out.println("Title of the webpage is=" + title);
		
		driver.findElement(By.xpath("//a[@class='btn-with-arrow purple for-desktop w-button']")).click();
		driver.findElement(By.id("firstname-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("Kailashmoontester");
		driver.findElement(By.id("email-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("test@xoxoday.com");
		driver.findElement(By.id("company-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("Xoxoday");
		driver.findElement(By.id("phone-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("976464644");
		Select select = new Select(driver.findElement(By.id("country-666f1de3-3223-4635-89ce-ee6da9d099fb")));
		select.selectByValue("Austria");
		
		driver.findElement(By.id("message-666f1de3-3223-4635-89ce-ee6da9d099fb")).sendKeys("Plz ignore this submission");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='hs-button primary large' and @value='SCHEDULE DEMO']")).click();
		
		
		//driver.close();
	   

	}
	catch(Exception e) {
		System.out.println(e);
	}

}
}
