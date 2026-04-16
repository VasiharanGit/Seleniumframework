package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import drivers.driverInstance;

public class SauceSteps {

	

	    driverInstance driver=new driverInstance();

	    // ---------- BACKGROUND ----------
	    @Given("user is on the login page")
	    public void user_is_on_login_page() {
	        driverInstance.driver = new ChromeDriver();
	        driverInstance.driver.manage().window().maximize();
	        driverInstance.driver.get("https://www.saucedemo.com/");
	    }

	    @Given("user is logged in with valid credentials")
	    public void user_is_logged_in() {
	    	driverInstance.driver = new ChromeDriver();
	    	driverInstance.driver.manage().window().maximize();
	    	driverInstance.driver.get("https://www.saucedemo.com/");

	    	driverInstance.driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    	driverInstance.driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    	driverInstance.driver.findElement(By.id("login-button")).click();
	    }

	    // ---------- LOGIN ----------
	    @When("user enters username {string} and password {string}")
	    public void user_enters_credentials(String username, String password) {
	    	driverInstance.driver.findElement(By.id("user-name")).sendKeys(username);
	    	driverInstance.driver.findElement(By.id("password")).sendKeys(password);
	    }

	    @When("user clicks on login button")
	    public void user_clicks_login() {
	    	driverInstance.driver.findElement(By.id("login-button")).click();
	    }

	    @Then("user should be navigated to the products page")
	    public void user_on_products_page() {
	        Assert.assertTrue(driverInstance.driver.getCurrentUrl().contains("inventory"));
	    }

	    @Then("user should see error message")
	    public void user_should_see_error() {
	        Assert.assertTrue(driverInstance.driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed());
	    }

	    // ---------- CART ----------
	    @When("user adds a product to the cart")
	    public void user_adds_product() {
	    	driverInstance.driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	    }

	    @Then("product should be displayed in the cart")
	    public void product_in_cart() {
	    	driverInstance.driver.findElement(By.className("shopping_cart_link")).click();
	        Assert.assertTrue(driverInstance.driver.findElement(By.className("cart_item")).isDisplayed());
	    }

	    @When("user removes the product from the cart")
	    public void user_removes_product() {
	    	driverInstance.driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	    }

	    @Then("cart should be empty")
	    public void cart_empty() {
	    	driverInstance.driver.findElement(By.className("shopping_cart_link")).click();
	        Assert.assertTrue(driverInstance.driver.findElements(By.className("cart_item")).size() == 0);
	    }

	    // ---------- CHECKOUT ----------
	    @Given("user navigates to the cart page")
	    public void user_goes_to_cart() {
	    	driverInstance.driver.findElement(By.className("shopping_cart_link")).click();
	    }

	    @When("user clicks on checkout")
	    public void user_clicks_checkout() {
	    	driverInstance.driver.findElement(By.id("checkout")).click();
	    }

	    @When("user enters first name {string} last name {string} and postal code {string}")
	    public void user_enters_details(String fname, String lname, String zip) {
	    	driverInstance.driver.findElement(By.id("first-name")).sendKeys(fname);
	    	driverInstance.driver.findElement(By.id("last-name")).sendKeys(lname);
	    	driverInstance.driver.findElement(By.id("postal-code")).sendKeys(zip);
	    }

	    @When("user clicks on continue")
	    public void user_clicks_continue() {
	    	driverInstance.driver.findElement(By.id("continue")).click();
	    }

	    @When("user clicks on finish")
	    public void user_clicks_finish() {
	    	driverInstance.driver.findElement(By.id("finish")).click();
	    }

	    @Then("order should be placed successfully")
	    public void order_success() {
	        Assert.assertTrue(driverInstance.driver.findElement(By.className("complete-header")).isDisplayed());
	        driverInstance.driver.quit();
	    
	}

}
