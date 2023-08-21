import org.junit.Test;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class DragandDropTest {
	@Test
	public void main() {
	 try (Playwright playwright = Playwright.create()) {
	        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	          .setHeadless(false));
	        BrowserContext context = browser.newContext();
	        Page page = context.newPage();
	        page.navigate("https://demoqa.com/");
	        page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Interactions")).click();
	        page.locator("li").filter(new Locator.FilterOptions().setHasText("Droppable")).click();


			page.waitForTimeout(2000);


			page.locator("#draggable").hover();
			page.mouse().down();
			page.locator("#droppable").first().hover();
			page.mouse().up();

		
			// Wait for some time to observe the effect
			page.waitForTimeout(5000); // Adjust the timeout as needed
	 	}
	 }
}
