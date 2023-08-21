import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

import org.junit.Test;

public class BookStoreTest {

	@Test
	public void RegistrationTest() {
	  try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      Page page = context.newPage();
	      page.navigate("https://demoqa.com/");
	      page.waitForTimeout(3000);
	      Page page1 = context.newPage();
	      page1.close();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Selenium Online Training")).click(new Locator.ClickOptions()
	        .setButton(MouseButton.RIGHT));
	      Page page2 = context.newPage();
	      page2.navigate("https://www.toolsqa.com/selenium-training/");
	      page2.getByText("14+", new Page.GetByTextOptions().setExact(true)).click();
	      page2.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Selenium Training")).click();
	      Page page3 = page2.waitForPopup(() -> {
	        page2.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Demo Site")).click();
	      });
	      page3.close();
	      page2.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Home")).click();
	      page2.getByText("Enroll Yourself Read More").click();
	      page2.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Go To Registration")).click();
	      page2.getByLabel("First Name (required)").click();
	      page2.getByLabel("First Name (required)").fill("hrizu");
	      page2.getByLabel("Last Name").click();
	      page2.getByLabel("Last Name").fill("sharma");
	      page2.getByLabel("Email\n(required)").click();
	      page2.getByLabel("Email\n(required)").fill("nomail@gomail.com");
	      page2.getByLabel("Mobile (required)").click();
	      page2.getByLabel("Mobile (required)").fill("340273912");
	      page2.getByLabel("Country (required)").selectOption("152");
	      page2.getByLabel("Country (required)").selectOption("119");
	      page2.getByLabel("City\n(required)").click();
	      page2.getByLabel("City\n(required)").fill("Kathmandu");
	      page2.getByLabel("Your\nMessage (required)").click();
	      page2.getByLabel("Your\nMessage (required)").fill("I want this certificate for free because of financial constraints such as i am unemployed haha");
	      page2.getByLabel("Input\nthis code").click();
	      page2.getByLabel("Input\nthis code").fill("TuR2");
	      page2.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Send")).click();
	    }
	  }
	@Test
	public void EmptyCredentialTest() {
		try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = context.newPage();
		      page.navigate("https://demoqa.com/");
		      page.locator("div:nth-child(6) > div > .avatar > svg").click();
		      page.waitForTimeout(3000);
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		      page.waitForTimeout(3000);
		      page.getByPlaceholder("UserName").click();
		      page.getByPlaceholder("UserName").fill("fakeuser");
			  page.waitForTimeout(2000);
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		      page.getByPlaceholder("Password").click();
		      page.getByPlaceholder("Password").fill("fakpass");

		      page.getByPlaceholder("UserName").click();
		      page.getByPlaceholder("UserName").fill("");
		      page.getByPlaceholder("Password").click();
		      page.getByPlaceholder("Password").fill("fakpasswordslay");
		      page.waitForTimeout(2000);
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		    }
		  }
		@Test
		public void InvalidCredentialTest() {
			 try (Playwright playwright = Playwright.create()) {
			      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
			        .setHeadless(false));
			      BrowserContext context = browser.newContext();
			      Page page = context.newPage();
			      page.navigate("https://demoqa.com/");
			      page.waitForTimeout(2000);
			      page.locator("div:nth-child(6) > div > .avatar > svg").click();
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
			      page.getByPlaceholder("UserName").click();
			      page.getByPlaceholder("UserName").fill("RealUserName");
			      page.getByPlaceholder("Password").click();
			      page.waitForTimeout(2000);
			      page.getByPlaceholder("Password").fill("RealInvalidPasswordTest");
			      page.waitForTimeout(2000);
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
			      page.locator("#password-wrapper div").filter(new Locator.FilterOptions().setHasText("Password :")).click();
			      page.getByPlaceholder("Password").click();
			      page.getByPlaceholder("Password").fill("ForgotPassword");
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
			      page.getByPlaceholder("UserName").click();
			      page.getByPlaceholder("UserName").fill("Invalid User");
			      page.getByPlaceholder("Password").click();
			      page.getByPlaceholder("Password").fill("myPassword");
			      page.waitForTimeout(2000);
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
			    }
			  }
		
		@Test
		public void SuccessfulLoginTest() {
			 try (Playwright playwright = Playwright.create()) {
			      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
			        .setHeadless(false));
			      BrowserContext context = browser.newContext();
			      Page page = context.newPage();
			      page.navigate("https://demoqa.com/");
			      page.waitForTimeout(3000);
			      page.locator("div:nth-child(6) > div > .avatar > svg").click();
			      page.locator("li").filter(new Locator.FilterOptions().setHasText("Login")).click();
			      page.getByPlaceholder("UserName").click();
			      page.getByPlaceholder("UserName").fill("testuser");
			      page.getByPlaceholder("Password").click();
			      page.getByPlaceholder("Password").fill("myPassword@123");
			      page.waitForTimeout(1000);
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
			    }
			}
		@Test
		public void SelectAddBooksTest() {
			try (Playwright playwright = Playwright.create()) {
			      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
			        .setHeadless(false));
			      BrowserContext context = browser.newContext();
			      Page page = context.newPage();
			      page.navigate("https://demoqa.com/");
			      page.waitForTimeout(3000);
			      page.locator("div:nth-child(6) > div > .avatar > svg").click();
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
			      page.getByPlaceholder("UserName").click();
			      page.waitForTimeout(1000);
			      page.getByPlaceholder("UserName").fill("testuser");
			      page.getByPlaceholder("UserName").press("ArrowDown");
			      page.getByPlaceholder("Password").click();
			      page.getByPlaceholder("Password").fill("myPassword@123");
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
			      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("You Don't Know JS")).click();
			      page.onceDialog(dialog -> {
			        System.out.println(String.format("Dialog message: %s", dialog.message()));
			        dialog.dismiss();
			      });
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add To Your Collection")).click();
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back To Book Store")).click();
			      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Understanding ECMAScript 6")).click();
			      page.onceDialog(dialog -> {
			        System.out.println(String.format("Dialog message: %s", dialog.message()));
			        dialog.dismiss();
			      });
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add To Your Collection")).click();
			      page.getByText("Profile").click();
			    }
			}
		@Test
		public void EditBookCollectionTest() {
		    try (Playwright playwright = Playwright.create()) {
		        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		          .setHeadless(false));
		        BrowserContext context = browser.newContext();
		        Page page = context.newPage();
		        page.navigate("https://demoqa.com/");
			    page.waitForTimeout(3000);
		        page.locator("div:nth-child(6) > div > .avatar > svg").click();
		        page.locator("#searchBox-wrapper div").filter(new Locator.FilterOptions().setHasText("Login")).click();
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		        page.getByPlaceholder("UserName").click();
		        page.getByPlaceholder("UserName").fill("testuser");
		        page.getByPlaceholder("Password").click();
		        page.getByPlaceholder("Password").fill("myPassword@123");
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
			    page.waitForTimeout(3000);
		        page.getByText("Profile").click();
		        page.getByPlaceholder("Type to search").click();
			    page.waitForTimeout(3000);
		        page.getByPlaceholder("Type to search").fill("JS");
		        page.getByPlaceholder("Type to search").press("Enter");
			    page.waitForTimeout(3000);
		        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("You Don't Know JS")).click();
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back To Book Store")).click();
		        page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("O'Reilly Media")).first().click();
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Go To Book Store")).click();
		        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Speaking JavaScript")).click();
		        page.onceDialog(dialog -> {
		          System.out.println(String.format("Dialog message: %s", dialog.message()));
		          dialog.dismiss();
		        });
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add To Your Collection")).click();
		        page.locator("li").filter(new Locator.FilterOptions().setHasText("Profile")).click();
		        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("image Understanding ECMAScript 6 Nicholas C. Zakas No Starch Press Delete")).locator("path").click();
		        page.onceDialog(dialog -> {
		          System.out.println(String.format("Dialog message: %s", dialog.message()));
		          dialog.dismiss();
		        });
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Go To Book Store")).click();
		        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Git Pocket Guide")).click();
		        page.onceDialog(dialog -> {
		          System.out.println(String.format("Dialog message: %s", dialog.message()));
		          dialog.dismiss();
		        });
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add To Your Collection")).click();
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Back To Book Store")).click();
		        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("You Don't Know JS")).click();
		        page.onceDialog(dialog -> {
		          System.out.println(String.format("Dialog message: %s", dialog.message()));
		          dialog.dismiss();
		        });
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add To Your Collection")).click();
		      }
		}
		@Test
		public void LogOutTest() {
		    try (Playwright playwright = Playwright.create()) {
		        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		          .setHeadless(false));
		        BrowserContext context = browser.newContext();
		        Page page = context.newPage();
		        page.navigate("https://demoqa.com/");
			    page.waitForTimeout(3000);
		        page.locator("div:nth-child(6) > div > .avatar > svg").click();
		        page.locator("li").filter(new Locator.FilterOptions().setHasText("Profile")).click();
		        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("login")).click();
		        page.getByPlaceholder("UserName").click();
		        page.getByPlaceholder("UserName").fill("testuser");
		        page.getByPlaceholder("Password").click();
		        page.getByPlaceholder("Password").fill("myPassword@123");
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("image You Don't Know JS Kyle Simpson O'Reilly Media Delete")).getByAltText("image").click();
		        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("image You Don't Know JS Kyle Simpson O'Reilly Media Delete")).getByAltText("image").click();
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Go To Book Store")).click();
		        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log out")).click();

		      }
		}

}
