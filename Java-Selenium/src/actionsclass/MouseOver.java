package actionsclass;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\eclipse-workspace\\Java-Selenium\\Browser_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://demoqa.com/menu/");
		String title = driver.getTitle();
		System.out.println("Title of the webpage is=" + title);
		
		// To perform any Mouse actions we need to create an object of Actions class
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Main Item 2"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sub Item")).click();
		
		
		

	}

}
