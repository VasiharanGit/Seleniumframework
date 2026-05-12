import com.microsoft.playwright.*;
import com.microsoft.playwright.options.MouseButton;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class PlaywrightLearning {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//        Page page = browser.newPage();
//    	Playwright playwright = Playwright.create();
//
//    	Browser browser = playwright.chromium().launch();

    	//BrowserContext context = browser.newContext();
    	BrowserContext c1 = browser.newContext();
    	//BrowserContext c2 = browser.newContext();


    	Page page = c1.newPage();
    	//Page page2= c2.newPage();

        page.navigate("https://www.qaplayground.com/");
        //page2.navigate("https://amazon.com");
        //page.fill("//input[@id='twotabsearchtextbox']", "Playwright");
        //page.waitForNavigation(() -> {
        //    page2.keyboard().press("Enter");
        //});
        //page2.waitForNavigation();
        //page2.waitForLoadState();   
        //assertThat(page).hasTitle("Googlere");

        System.out.println(page.title());
        Locator item=page.locator("text=Get Started");        //System.out.println(page2.title());
        item.click();
        Locator item1=page.locator("//span[text()='Practice Now']/ancestor::div//a[@id='card-link-input-fields']");
        item1.click();
        page.locator("#movieName").fill("Master");
        //page.keyboard().press("Tab");
        page.locator("#appendText").click();
        page.locator("#appendText").type("appendText");
        page.keyboard().press("Tab");
        String tem3=page.inputValue("#insideText");
        System.out.println(tem3);
        page.locator("#clearText").fill("");
        Boolean bool=page.locator("#disabledInput").isEnabled();
        System.out.println(bool);
        Boolean bool2=page.locator("#readonlyInput").getAttribute("readonly")!=null;
        System.out.println(bool2);
        page.locator("//div//nav//a[text()='Practice']").click();
        Locator item5=page.locator("//span[text()='Practice Now']/ancestor::div//a[@id='card-link-buttons']");
        item5.click();
        //page.locator("#btn-goto-home").click();
        page.locator("#btn-double-click").dblclick();
        page.locator("#btn-right-click").click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));
        page.locator("#btn-goto-home").click();
        Locator item6=page.locator("text=Get Started"); 
        item6.click();
        Locator item7=page.locator("//span[text()='Practice Now']/ancestor::div//a[@id='card-link-forms']");
        item7.click();
        page.locator("#firstName").fill("Vasiharan");
        page.locator("#lastName").fill("Suresh");
        page.locator("#email").fill("VSuresh@gmail.com");
        page.locator("#phone").fill("9080334645");
        page.locator("#dob").fill("05062002");
        
//        browser.close();
//        playwright.close();
    }
}

