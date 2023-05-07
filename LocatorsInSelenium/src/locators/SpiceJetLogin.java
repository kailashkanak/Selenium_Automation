package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Selecting data from (FROM) Drop down
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']")).click();
		driver.findElement(By.xpath("//input[@value='Patna (PAT)']")).click();
		
		//selecting data from (TO) dropdown
		
		
	}

}
