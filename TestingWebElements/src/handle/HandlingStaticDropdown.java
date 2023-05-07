package handle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KAILASH KANAK\\Documents\\BrowserDriver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		
		//Selecting Dropdown value by Index
		
		//dropdown.selectByIndex(3);
		//String str = dropdown.getFirstSelectedOption().getText();
		//System.out.println("The selected Text is :"+str);
		
		//selecting dropdown value by visible text method
		
		//dropdown.selectByVisibleText("AED");
		//String str = dropdown.getFirstSelectedOption().getText();
		//System.out.println("The selected Text is : "+str);
		
		dropdown.selectByValue("INR");
		String str = dropdown.getFirstSelectedOption().getText();
		System.out.println("The selected Text is : "+str);
		
		//Selection passenger dropdown
		
		driver.findElement(By.id("divpaxinfo")).click(); 
		
		//To select 5 adults
		
		for(int i=0; i<4; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		for(int i=0; i<3; i++)
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
		
		driver.findElement(By.id("hrefIncInf")).click();
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Now displaying all selected values in passenger dropdown
		
		System.out.println("The selected values are : " + driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
	}
}
	
