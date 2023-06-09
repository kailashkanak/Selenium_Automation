package MyAutomation.SeleniumframeworkDesign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LandingPage lp = new LandingPage(driver);
		lp.goTo();
		
		lp.loginApplication("kailash.moon12@gmail.com", "Kailash@moon12");
		
		//Once we r in the product page, we will simply captures all products in a list;
		List<WebElement> products = driver.findElements(By.cssSelector("mb-3"));
		
		//Iteration of products and matching the product title to select
		
		WebElement prod = products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals("zara coat 3")).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	}

}
