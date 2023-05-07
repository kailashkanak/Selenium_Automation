package Manager_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumManagerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch Firefox Browser
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\KAILASH KANAK\\Documents\\BrowserDriver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://empuls.io");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); */
		//Launching Edge browser
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\KAILASH KANAK\\Documents\\BrowserDriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://empuls.io");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
