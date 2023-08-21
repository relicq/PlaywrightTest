import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.BoundingBox;

public class SortableListTest extends BaseClassForTest{
	@Before
    public void setUp() {
        super.setUp();
       
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

	@Test
	public void SortInList() {
	      page.navigate("https://demoqa.com/");
	      page.locator("div:nth-child(3) > div > .avatar > svg").click();
	      page.getByText("Frames", new Page.GetByTextOptions().setExact(true)).click();
	      page.getByText("Modal Dialogs").click();

	      page.getByText("Interactions").click();
	      page.getByText("Sortable").click();
	      page.getByLabel("List").getByText("One").click();
	      page.getByLabel("List").getByText("Four").dblclick();
	      page.getByLabel("List").getByText("One").dblclick();
	      page.getByLabel("List").getByText("Four").click(new Locator.ClickOptions()
	        .setClickCount(3));

 
       // Find the source and target elements using Locators
          Locator sourceLocator = page.locator(".sortable-container .vertical-list-container .list-group-item:nth-child(1)");
          ElementHandle sourceEl = sourceLocator.elementHandle();
          Locator targetLocator = page.locator(".sortable-container .vertical-list-container .list-group-item:nth-child(4)");
          ElementHandle targetEl = targetLocator.elementHandle();


          // Triple-click on the source element
          sourceLocator.click(new Locator.ClickOptions().setClickCount(3));

          // Scroll vertically to bring the target element into view
          targetEl.scrollIntoViewIfNeeded();

          // Perform drag-and-drop to move the source element to the target position
          BoundingBox sourceBox = sourceEl.boundingBox();
          BoundingBox targetBox = targetEl.boundingBox();

          // Calculate the coordinates for the drag-and-drop action
          double X2= sourceBox.x + sourceBox.width / 2;
          double Y2= sourceBox.y + sourceBox.height / 2;
          double X1= targetBox.x + targetBox.width / 2;
          double Y1= targetBox.y + targetBox.height / 2;

          // Perform the drag-and-drop action using mouse interactions
          page.mouse().move(X2, Y2);
          page.mouse().down();
          page.mouse().move(X1, Y1);
          page.mouse().up();
          
          page.waitForTimeout(10000);
 
	    }
	}

