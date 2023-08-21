import static org.junit.Assert.*;

import org.junit.Test;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

public class ResizableBoxTest {

	@Test
	public void test() {
	    try (Playwright playwright = Playwright.create()) {
	        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	          .setHeadless(false));
	        BrowserContext context = browser.newContext();
	        Page page = context.newPage();
	        page.navigate("https://demoqa.com/");
	        page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Interactions")).click();
	        page.locator("li").filter(new Locator.FilterOptions().setHasText("Resizable")).click();
	        
	     // Click on the first "Resizeable" element within the container with class "resizeeable-container"
	        page.locator(".resizable-container").getByText("Resizable").first().click();

	        page.waitForTimeout(1000);

	        Locator elementLocator = page.locator("#resizableBoxWithRestriction");
            elementLocator.click();
	        
	     // Get the initial size
	        BoundingBox initialBox = elementLocator.boundingBox();
	        double initialWidth = initialBox.width;
	        double initialHeight = initialBox.height;
	        
	        Locator eLocator = page.locator("#resizableBoxWithRestriction span");
	        ElementHandle spanEl = eLocator.elementHandle();
	        
	        page.locator("#resizableBoxWithRestriction span").click();

	        page.locator("#resizableBoxWithRestriction").click();
	        
	        BoundingBox spanBox = spanEl.boundingBox();

	        double startX = spanBox.x + spanBox.width / 2;
	        double startY = spanBox.y + spanBox.height / 2;
	        double endX = startX + 80; // For right/left
	        double endY = startY + -30; // For up/down
            page.waitForTimeout(3000);
	        page.mouse().move(startX, startY);
	        page.mouse().down();
	        page.waitForTimeout(3000);
	        // Drag horizontally by endX pixels and vertically by endY (positive for right, negative for left)
	        page.mouse().move(endX, endY);
	        page.mouse().up();
	        page.waitForTimeout(3000);
	        // Get the size after interactions
	        BoundingBox finalBox = elementLocator.boundingBox();
	        double finalWidth = finalBox.width;
	        double finalHeight = finalBox.height;
	     // Print initial size
	        System.out.println("Initial Width: " + initialWidth);
	        System.out.println("Initial Height: " + initialHeight);

	        // Print final size
	        System.out.println("Final Width: " + finalWidth);
	        System.out.println("Final Height: " + finalHeight);
            assertNotEquals(initialWidth, finalWidth);
            assertNotEquals(initialHeight, finalHeight);
	    }
    }
}

