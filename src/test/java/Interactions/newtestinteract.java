package Interactions;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import java.util.regex.Pattern;

import org.junit.Test;

public class newtestinteract {
	@Test
  public void main() {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://demoqa.com/");
      page.locator("div:nth-child(5) > div > .avatar > svg").click();
      page.getByText("Sortable").click();
      page.waitForTimeout(2000); // Pauses for 2 seconds
      page.getByLabel("List").getByText("One").click();
      page.getByLabel("List").getByText("Four").click();
      page.getByLabel("List").getByText("Four").click();
      page.getByLabel("List").getByText("Four").click();
      page.getByLabel("List").getByText("Two").click();
      page.waitForTimeout(2000); // Pauses for 2 seconds
      page.getByLabel("List").getByText("Four").dblclick();
      page.getByLabel("List").getByText("Four").click();
      page.getByLabel("List").getByText("Three").dblclick();
      page.getByLabel("List").getByText("Four").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByLabel("List").getByText("Three").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.waitForTimeout(2000); // Pauses for 2 seconds
      page.getByLabel("List").getByText("Four").click(new Locator.ClickOptions()
        .setButton(MouseButton.RIGHT));
      page.getByLabel("List").getByText("Two").click(new Locator.ClickOptions()
        .setButton(MouseButton.RIGHT));
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^ListGridOneTwoThreeFourFiveSixOneTwoThreeFourFiveSixSevenEightNine$"))).first().click();
      page.getByLabel("List").getByText("Two").click(new Locator.ClickOptions()
        .setButton(MouseButton.RIGHT));
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^ListGridOneTwoThreeFourFiveSixOneTwoThreeFourFiveSixSevenEightNine$"))).first().click();
      page.getByLabel("List").getByText("Five").click();
      page.getByLabel("List").getByText("Four").click();
      page.waitForTimeout(2000); // Pauses for 2 seconds
      page.getByLabel("List").getByText("Three").click();
      page.getByLabel("List").getByText("Four").dblclick();
      page.getByLabel("List").getByText("Three").click();
      page.waitForTimeout(2000); // Pauses for 2 seconds
      page.getByLabel("List").getByText("Four").dblclick();
      page.getByLabel("List").getByText("Three").dblclick();
      page.waitForTimeout(2000); // Pauses for 2 seconds
      page.getByLabel("List").getByText("Three").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Grid")).click();
      page.getByLabel("Grid").getByText("Two").click();
      page.getByLabel("Grid").getByText("Five").dblclick();
      page.getByLabel("Grid").getByText("Two").dblclick();
      page.getByLabel("Grid").getByText("Five").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByLabel("Grid").getByText("Two").click();
      page.getByLabel("Grid").getByText("Five").dblclick();
      page.getByLabel("Grid").getByText("Five").click();
      page.getByLabel("Grid").getByText("Two").click();
      page.getByLabel("Grid").getByText("Five").click();
      page.getByLabel("Grid").getByText("Five").click();
      page.getByLabel("Grid").getByText("Four").dblclick();
      page.getByLabel("Grid").getByText("Four").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.getByLabel("Grid").getByText("Five").click(new Locator.ClickOptions()
        .setClickCount(5));
      page.getByLabel("Grid").getByText("Four").click();
      page.getByLabel("Grid").getByText("Five").dblclick();
      page.getByLabel("Grid").getByText("Five").click();
      page.getByLabel("Grid").getByText("Four").click(new Locator.ClickOptions()
        .setClickCount(5));
      page.getByLabel("Grid").getByText("Four").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("Nine").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.getByText("Nine").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("Eight").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.getByText("Nine").dblclick();
      page.getByText("Nine").dblclick();
      page.getByLabel("Grid").getByText("Six").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("Nine").click();
      page.getByLabel("Grid").getByText("Six").dblclick();
      page.getByLabel("Grid").getByText("Six").click();
      page.getByText("Nine").click();
      page.getByLabel("Grid").getByText("Six").dblclick();
      page.getByLabel("Grid").getByText("Six").click();
      page.getByText("Nine").dblclick();
      page.getByLabel("Grid").getByText("Six").click();
      page.getByText("Nine").dblclick();
      page.getByText("Nine").click();
      page.locator("li").filter(new Locator.FilterOptions().setHasText("Selectable")).click();
      page.getByText("Cras justo odio").click();
      page.getByText("Porta ac consectetur ac").click();
      page.getByText("Cras justo odio").click();
      page.getByText("Morbi leo risus").click();
      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Grid")).click();
      page.getByText("Five").click();
      page.getByText("Four").click();
      page.getByText("Four").click();
      page.getByText("Four").click();
      page.getByText("Seven").click();
      page.locator("li").filter(new Locator.FilterOptions().setHasText("Resizable")).click();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Resizable box, starting at 200x200\\. Min size is 150x150, max is 500x300\\.$"))).first().click();
      page.locator("#resizableBoxWithRestriction span").dblclick();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Resizable box, starting at 200x200\\. Min size is 150x150, max is 500x300\\.$"))).first().click(new Locator.ClickOptions()
        .setClickCount(3));
      page.locator("#resizableBoxWithRestriction span").click();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Resizable box, starting at 200x200\\. Min size is 150x150, max is 500x300\\.$"))).first().dblclick();
      page.getByText("Resizable box, starting at 200x200. Min size is 150x150, max is 500x300.").dblclick();
      page.locator("#resizableBoxWithRestriction span").click();
      page.locator("#resizableBoxWithRestriction").dblclick();
      page.locator("#resizableBoxWithRestriction span").click();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Resizable box, starting at 200x200\\. Min size is 150x150, max is 500x300\\.$"))).first().dblclick();
      page.locator("#resizable span").click(new Locator.ClickOptions()
        .setClickCount(8));
      page.locator("#resizable span").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Resizable$"))).nth(2).dblclick();
      page.locator("#resizable span").click(new Locator.ClickOptions()
        .setClickCount(6));
      page.locator("#resizable span").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.locator("#resizable").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.locator("#resizable span").dblclick();
      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("Resizable box, starting at 200x200. Min size is 150x150, max is 500x300.Resizabl")).nth(3).click(new Locator.ClickOptions()
        .setClickCount(3));
      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("Resizable box, starting at 200x200. Min size is 150x150, max is 500x300.Resizabl")).nth(3).click();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Resizable$"))).nth(2).click(new Locator.ClickOptions()
        .setClickCount(4));
      page.locator("#resizable span").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("Resizable box, starting at 200x200. Min size is 150x150, max is 500x300.Resizabl")).nth(3).click(new Locator.ClickOptions()
        .setClickCount(4));
      page.locator("#resizable span").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.locator("#resizable span").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.locator("#resizable span").click(new Locator.ClickOptions()
        .setClickCount(5));
      page.locator("#resizableBoxWithRestriction span").click();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Resizable box, starting at 200x200\\. Min size is 150x150, max is 500x300\\.$"))).first().dblclick();
      page.locator("#resizableBoxWithRestriction span").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.locator("#resizableBoxWithRestriction span").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.locator("#resizableBoxWithRestriction span").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.locator("#resizableBoxWithRestriction span").click();
      page.locator("#resizableBoxWithRestriction span").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Resizable box, starting at 200x200\\. Min size is 150x150, max is 500x300\\.$"))).first().click(new Locator.ClickOptions()
        .setButton(MouseButton.RIGHT));
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Resizable box, starting at 200x200\\. Min size is 150x150, max is 500x300\\.$"))).first().click();
      page.locator("#resizableBoxWithRestriction span").click();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Resizable box, starting at 200x200\\. Min size is 150x150, max is 500x300\\.$"))).first().dblclick();
      page.locator("li").filter(new Locator.FilterOptions().setHasText("Droppable")).click();
      page.getByLabel("Simple").locator("#droppable").click();
      page.getByText("Drag me", new Page.GetByTextOptions().setExact(true)).click();
      page.getByLabel("Simple").locator("#droppable").dblclick();
      page.getByText("Drag me", new Page.GetByTextOptions().setExact(true)).dblclick();
      page.getByLabel("Simple").getByText("Drop here").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("Drag me", new Page.GetByTextOptions().setExact(true)).click(new Locator.ClickOptions()
        .setClickCount(3));
      page.locator("li").filter(new Locator.FilterOptions().setHasText("Dragabble")).click();
      page.getByText("Drag me").click();
      page.getByLabel("Simple").dblclick();
      page.getByText("Drag me").click();
      page.waitForTimeout(90000); // Increase the timeout to 90 seconds
      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("SimpleAxis RestrictedContainer RestrictedCursor StyleDrag meOnly XOnly YI'm cont")).nth(3).dblclick();
      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("SimpleAxis RestrictedContainer RestrictedCursor StyleDrag meOnly XOnly YI'm cont")).nth(3).click();
      page.getByText("Drag me").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.getByText("Drag me").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("SimpleAxis RestrictedContainer RestrictedCursor StyleDrag meOnly XOnly YI'm cont")).nth(3).click(new Locator.ClickOptions()
        .setClickCount(5));
      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Axis Restricted")).click();
      page.getByText("Only X").click();
      page.getByText("Only XOnly Y").dblclick();
      page.getByText("Only X").click();
      page.getByText("Only X").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("Only X").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("Only XOnly Y").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.getByText("Only X").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("Only XOnly Y").click(new Locator.ClickOptions()
        .setClickCount(4));
      page.getByText("Only X").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("Only Y").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("Only Y").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("Only Y").dblclick();
      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("SimpleAxis RestrictedContainer RestrictedCursor StyleDrag meOnly XOnly YI'm cont")).nth(3).click(new Locator.ClickOptions()
        .setClickCount(3));
      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("SimpleAxis RestrictedContainer RestrictedCursor StyleDrag meOnly XOnly YI'm cont")).nth(3).click();
      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Container Restricted")).click();
      page.getByText("I'm contained within the box").click();
      page.locator("#containmentWrapper").dblclick();
      page.getByText("I'm contained within the box").click(new Locator.ClickOptions()
        .setClickCount(5));
      page.locator("#containmentWrapper").click(new Locator.ClickOptions()
        .setClickCount(6));
      page.getByText("I'm contained within the box").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.getByText("I'm contained within my parent").click(new Locator.ClickOptions()
        .setClickCount(3));
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^I'm contained within my parent$"))).click();
      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("SimpleAxis RestrictedContainer RestrictedCursor StyleDrag meOnly XOnly YI'm cont")).nth(3).dblclick();
      page.getByText("I'm contained within my parent").click();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^I'm contained within my parent$"))).dblclick();
      page.getByText("I'm contained within my parent").click();
      page.locator("#containmentWrapper").dblclick();
      page.getByText("Interactions").click();
    }
  }
}
