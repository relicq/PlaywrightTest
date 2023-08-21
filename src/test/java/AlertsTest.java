import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AlertsTest {

	@Test
	public void test() {
	    try (Playwright playwright = Playwright.create()) {
	        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	          .setHeadless(false));
	        BrowserContext context = browser.newContext();
	        Page page = context.newPage();
	        page.navigate("https://demoqa.com/");
	        page.locator("div:nth-child(3) > div > .avatar > svg").click();
	        page.getByText("Alerts", new Page.GetByTextOptions().setExact(true)).click();
	        page.locator("#alertButton").click(new Locator.ClickOptions()
	          .setButton(MouseButton.RIGHT));
	        page.onceDialog(dialog -> {
	          System.out.println(String.format("Dialog message: %s", dialog.message()));
	          dialog.dismiss();
	        });
	        page.locator("#alertButton").click();
	        page.onceDialog(dialog -> {
	          System.out.println(String.format("Dialog message: %s", dialog.message()));
	          dialog.dismiss();
	        });
	        page.locator("#alertButton").click();
	        page.locator("#timerAlertButton").click();
	        page.onceDialog(dialog -> {
	          System.out.println(String.format("Dialog message: %s", dialog.message()));
	          dialog.dismiss();
	        });

	        page.locator("#confirmButton").click();
	        page.onceDialog(dialog -> {
	          System.out.println(String.format("Dialog message: %s", dialog.message()));
	          dialog.dismiss();
	        });
	        page.locator("#confirmButton").click();
	        page.onceDialog(dialog -> {
	          System.out.println(String.format("Dialog message: %s", dialog.message()));
	          dialog.dismiss();
	        });
	        page.locator("#promtButton").click();
	        page.onceDialog(dialog -> {
	          System.out.println(String.format("Dialog message: %s", dialog.message()));
	          dialog.dismiss();
	        });
	        page.locator("#promtButton").click();
	        page.onceDialog(dialog -> {
	          System.out.println(String.format("Dialog message: %s", dialog.message()));
	          dialog.dismiss();
	        });
	        page.locator("#promtButton").click();
	        page.getByText("Browser Windows").click();
	        Page page1 = page.waitForPopup(() -> {
	          page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("New Tab")).click();
	        });
//	        assertThat(context.pages()).hasSize(2); // Main page + New Tab
            assertTrue( "New tab should have opened", page1 != null);
            page1.close();
	       
	        Page page2 = page.waitForPopup(() -> {
	          page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("New Window").setExact(true)).click();
	        });
	        assertTrue( "New windows should have opened", page2 != null);
	        page2.close();
	        Page page3 = page.waitForPopup(() -> {
	          page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("New Window Message")).click();
	        });
	        assertTrue( "New window with message should have opened", page3 != null);
	        page3.close();
	        page.locator("li").filter(new Locator.FilterOptions().setHasText("Alerts")).click();
	        page.onceDialog(dialog -> {
	          System.out.println(String.format("Dialog message: %s", dialog.message()));
	          dialog.dismiss();
	        });
	        page.locator("#confirmButton").click();
	      }
	    }	
	}



