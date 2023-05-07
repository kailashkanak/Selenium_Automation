package browsertesting;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("1. Chrome \n2. Firefox \n3. MS Edge");
		System.out.println("Enter your choice:");
		int choice = obj.nextInt();
		CrossBrowser cb = new CrossBrowser();
		
		
		switch(choice)
		{
		case 1: cb.chromeDriver();
				break;
		case 2: cb.firefoxDriver();
				break;
		case 3: cb.edgeDriver();
				break;
		}
		
		
	}
	
	public void edgeDriver() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\KAILASH KANAK\\Documents\\BrowserDriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("Page Title=" + driver.getTitle());
		System.out.println("Page URL=" +driver.getCurrentUrl());
		//Thread.sleep(5000);
		driver.close();
	}
	
	public void firefoxDriver() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KAILASH KANAK\\Documents\\BrowserDriver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("Page Title=" + driver.getTitle());
		System.out.println("Page URL=" +driver.getCurrentUrl());
		//Thread.sleep(5000);
		driver.close();
	}
	
	public void chromeDriver() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAILASH KANAK\\Documents\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("Page Title=" + driver.getTitle());
		System.out.println("Page URL=" +driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.close();
	}

}
