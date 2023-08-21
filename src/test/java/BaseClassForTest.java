import com.microsoft.playwright.*;

public class  BaseClassForTest {
    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
    }

    public void tearDown() {
        page.close();
        context.close();
        browser.close();
        playwright.close();
    }
}
