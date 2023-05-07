package gmaildemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Browser_Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
+		String page_title = driver.getTitle();
		System.out.println(page_title);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(2000);
		String str = driver.getTitle();
		//System.out.println(str);
		if(str.equalsIgnoreCase("actiTIME - Enter Time-Track")) {
			System.out.println("Login test case pass");
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("C:/Users/KAILASH KANAK/eclipse-workspace/SeleniumGmail/Screenshot/Pass.jpg");
			//Copy file at destination
            FileUtils.copyFile(SrcFile, DestFile);
		}
		else {
			System.out.println("Login test case fail");
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("C:/Users/KAILASH KANAK/eclipse-workspace/SeleniumGmail/Screenshot/Fail.jpg");
			//Copy file at destination
            FileUtils.copyFile(SrcFile, DestFile);
			}
		driver.close();
		
	}
	
}
