import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void openGoogle() {

        WebDriver driver =
        new ChromeDriver();

        driver.get("https://google.com");

        System.out.println(
        driver.getTitle());

        driver.quit();
    }
}