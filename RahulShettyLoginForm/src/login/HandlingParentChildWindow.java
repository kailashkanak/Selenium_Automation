package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingParentChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Automation\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //http://the-internet.herokuapp.com/
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

	}

}
