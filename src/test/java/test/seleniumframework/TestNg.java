package test.seleniumframework;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestNg {
	WebDriver driver;
	
	
//    @BeforeMethod
//	public void setup() {
//		// TODO Auto-generated method stub
//		driver=new ChromeDriver();
//		driver.get("https://www.amazon.in");
//		//driver.manage().window().maximize();
//	}
//	@Test(priority=-1)
//	public void gettitle() {
//		driver.get("https://www.amazon.in");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		String title=driver.getTitle();
////		try {
////			Thread.sleep(10);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		System.out.println(title);
	//}
	//@Parameters({"searchText","browser"})
	@Test(priority=-2)
	public void getprices() {
//		switch(Browser) {
//		case"chrome":
//			driver=new ChromeDriver();
//		break;
//		case"edge":
//			driver=new FirefoxDriver();
//		default:
//			System.err.println("no valid browser");
//		}
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//System.out.println(srcTxt);
		driver.findElement(By.xpath("")).sendKeys("iphone",Keys.ENTER);
		List<WebElement> elem=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//img[@alt='One94Store Artificial Leaf Curtain Lights – 200 LED Warm White Fairy String Lights, 3x1m, Remote Control with 8 Lighting...']")));
		for(WebElement el:elem) {
			System.out.println(el.getText());
		}
		driver.quit();
		//System.out.println(elem);
		//WebElement active=driver.switchTo().activeElement();
		//active.sendKeys("chatgpt",Keys.ENTER);  --------------------active element switching
		
	}
//	@AfterMethod
//	public void quitBrowser() {
//		driver.quit();
//	}

	//private static javascriptexecutor javascriptexecutor(WebDriver driver) {
		// TODO Auto-generated method stub
	//	return null;
	}


