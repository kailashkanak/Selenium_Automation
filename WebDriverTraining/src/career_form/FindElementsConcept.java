package career_form;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDriver\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://xoxoday.com");
		
		//To get the count of total links on Xoxoday
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("Total linls on the page =" + linklist.size());
		
		//To get the count of all inputs fields on Xoxoday
		List <WebElement> inputlist = driver.findElements(By.tagName("input"));
		System.out.println("Total count of input fields = " + inputlist.size());
		
		
		//To Display all links on Xoxoday
		for(int i=0;i<linklist.size();i++) {
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
		}
		//Thread.sleep(2000);
		
		//To take Screenshot and store as a file format
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//now copy the screenshots to a desired location using copy filr method
		
		FileUtils.copyFile(src, new File("C:\\Users\\KAILASH KANAK\\eclipse-workspace\\WebDriverTraining\\src\\career_form\\screenshot1.png"))
          
		
		
		
		
		
	}

}
