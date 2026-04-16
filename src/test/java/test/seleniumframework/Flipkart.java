package test.seleniumframework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
			WebDriver driver;
			
			
		    @BeforeMethod
			public void setup() {
				// TODO Auto-generated method stub
				driver=new ChromeDriver();
				driver.get("https://www.amazon.in");
				//driver.manage().window().maximize();
			}
			@Test(priority=-2)
			public void gettitle() {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String title=driver.getTitle();
				System.out.println(title);
				driver.quit();
			}
	}


