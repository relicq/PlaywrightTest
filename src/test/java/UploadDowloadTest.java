import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.junit.Test;

public class  UploadDowloadTest  {
	@Test
	public  void main() {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      Page page = context.newPage();
	      page.navigate("https://demoqa.com/");
	      page.locator("path").first().click();
	      page.getByText("Upload and Download").click();
	      page.getByLabel("Select a file").click();
	      page.getByLabel("Select a file").setInputFiles(Paths.get("C:\\Users\\hrizu.sharma\\Pictures\\Screenshots","Screenshot (1).png"));
	      page.waitForDownload(() -> {
	        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Download")).click();
	      });
	      page.getByText("C:\\fakepath\\Screenshot (1).png").dblclick();
	      page.getByText("Select a file").click(new Locator.ClickOptions()
	        .setButton(MouseButton.RIGHT));
	      page.getByLabel("Select a file").click(new Locator.ClickOptions()
	        .setButton(MouseButton.RIGHT));
	      page.getByText("C:\\fakepath\\Screenshot (1).png").click(new Locator.ClickOptions()
	        .setButton(MouseButton.RIGHT));
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Select a file$"))).click(new Locator.ClickOptions()
	        .setButton(MouseButton.RIGHT));
	      page.getByLabel("Select a file").click();
	      page.getByLabel("Select a file").setInputFiles(Paths.get("C:\\Users\\hrizu.sharma\\Pictures\\Screenshots","Screenshot (1).png"));
	      page.waitForDownload(() -> {
	        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Download")).click();
	      });
	    }
	  }
	}