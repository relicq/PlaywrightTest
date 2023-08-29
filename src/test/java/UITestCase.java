import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

import java.util.regex.Pattern;

public class UITestCase extends BaseClassForTest {
	@Before
    public void setUp() {
        super.setUp();

    }

    @After
    public void tearDown() {
        super.tearDown();
    }
	@Test
	  public void CheckListTest() {
	      page.navigate("https://demoqa.com/");
	      page.waitForTimeout(3000);
	      page.locator("svg").first().click();
	      page.getByText("Check Box").click();
	      page.getByLabel("Toggle").click();
	      page.waitForTimeout(1000);
	      page.locator("li").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Downloads$"))).getByLabel("Toggle").click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Word File.doc")).getByRole(AriaRole.IMG).first().click();
	      page.getByText("Word File.doc").click();
	      page.waitForTimeout(1000);
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Documents")).getByRole(AriaRole.IMG).first().click();
	      page.locator("li").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Documents$"))).getByLabel("Toggle").click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("WorkSpace")).getByRole(AriaRole.IMG).first().click();
	      page.getByText("Office", new Page.GetByTextOptions().setExact(true)).click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Home")).getByRole(AriaRole.IMG).first().click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Home")).getByRole(AriaRole.IMG).first().click();
	      page.locator("li").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Desktop$"))).getByLabel("Toggle").click();
	      page.waitForTimeout(1000);
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Desktop")).getByRole(AriaRole.IMG).first().click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Desktop")).getByRole(AriaRole.IMG).first().click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Desktop")).getByRole(AriaRole.IMG).first().click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Downloads")).getByRole(AriaRole.IMG).first().click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Downloads")).locator("path").first().click();
	      page.waitForTimeout(1000);
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Notes")).locator("path").first().click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Commands")).locator("path").first().click();
	      page.locator("li").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Office$"))).getByLabel("Toggle").click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Classified")).getByRole(AriaRole.IMG).first().click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Private")).getByRole(AriaRole.IMG).first().click();
	      page.getByLabel("Collapse all").click();
	      page.waitForTimeout(1000);
	      page.getByLabel("Toggle").click();
	      page.locator("label").filter(new Locator.FilterOptions().setHasText("Downloads")).getByRole(AriaRole.IMG).first().click();
	    }
	@Test
	 public void InputTextTest() {
	      page.navigate("https://demoqa.com/");
	      page.waitForTimeout(4000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Elements$"))).nth(1).click();
	      page.getByText("Text Box").click();
	      page.getByPlaceholder("Full Name").click();
	      page.getByPlaceholder("Full Name").fill("hrizu sharma");
	      page.waitForTimeout(2000);
	      page.getByPlaceholder("name@example.com").click();
	      page.getByPlaceholder("name@example.com").fill("dummy@yopmail.com");
	      page.getByPlaceholder("Current Address").click();
	      page.getByPlaceholder("Current Address").fill("test");
	      page.locator("#permanentAddress").click();
	      page.locator("#permanentAddress").fill("teest1");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
	      page.getByText("Name:hrizu sharmaEmail:dummy@yopmail.comCurrent Address :test Permananet Address").click();
	      page.getByText("Name:hrizu sharmaEmail:dummy@yopmail.comCurrent Address :test Permananet Address").click();
	    }
	  
	
	@Test
	  public void ButtonTest() {
	      page.navigate("https://demoqa.com/");
	      page.waitForTimeout(3000);
	      page.locator("path").first().click();
	      page.getByText("Radio Button").click();
	      page.getByText("Yes").click();
	      page.getByText("Impressive").click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^No$"))).click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Do you like the site\\?YesImpressiveNoYou have selected Impressive$"))).first().click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Yes$"))).click();
	      page.getByText("Impressive").click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Do you like the site\\?YesImpressiveNoYou have selected Impressive$"))).first().click();
	      page.getByText("Yes").click();
	      page.locator("li").filter(new Locator.FilterOptions().setHasText("Buttons")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Double Click Me")).dblclick();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Right Click Me")).dblclick();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Double Click Me")).click(new Locator.ClickOptions()
	        .setButton(MouseButton.RIGHT));
	      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("Double Click MeRight Click MeClick MeYou have done a double click")).nth(3).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Click Me").setExact(true)).click(new Locator.ClickOptions()
	        .setButton(MouseButton.RIGHT));
	      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("Double Click MeRight Click MeClick MeYou have done a double click")).nth(3).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Click Me").setExact(true)).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Right Click Me")).dblclick();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Right Click Me")).click(new Locator.ClickOptions()
	        .setButton(MouseButton.RIGHT));
	      page.getByText("Radio Button").click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Impressive$"))).click();
	      page.locator("li").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Links$"))).click();
	      page.locator("li").filter(new Locator.FilterOptions().setHasText("Check Box")).click();
	      page.getByText("Radio Button").click();
	    }
	  
	
	@Test
	 public void EditTableTest() {
	      page.navigate("https://demoqa.com/");
	      page.waitForTimeout(3000);
	      page.locator("svg").first().click();
	      page.getByText("Web Tables").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
	      page.getByPlaceholder("First Name").click();
	      page.getByPlaceholder("First Name").fill("Clamentine");
	      page.getByPlaceholder("Last Name").click();
	      page.getByPlaceholder("Last Name").fill("DIllon");
	      page.getByPlaceholder("name@example.com").click();
	      page.getByPlaceholder("name@example.com").fill("fake@everything.com");
	      page.getByPlaceholder("Age").click();
	      page.getByPlaceholder("Age").fill("27");
	      page.getByPlaceholder("Salary").click();
	      page.getByPlaceholder("Salary").fill("30400");
	      page.getByPlaceholder("Department").click();
	      page.getByPlaceholder("Department").fill("finance");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
	      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Clamentine DIllon 27 fake@everything.com 30400 finance Edit Delete")).getByTitle("Edit").getByRole(AriaRole.IMG).click();
	      page.getByPlaceholder("Department").click();
	      page.getByPlaceholder("Department").fill("Loan and Recovery");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
	      page.locator("div:nth-child(2) > .rt-tr > div:nth-child(7) > .action-buttons").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
	      page.getByPlaceholder("First Name").click();
	      page.getByPlaceholder("First Name").fill("Dolly");
	      page.getByPlaceholder("Last Name").click();
	      page.getByPlaceholder("Last Name").fill("Parton");
	      page.getByPlaceholder("name@example.com").click();
	      page.getByPlaceholder("name@example.com").fill("test@somail.com");
	      page.getByPlaceholder("Age").click();
	      page.getByPlaceholder("Age").fill("40");
	      page.getByPlaceholder("Salary").click();
	      page.getByPlaceholder("Salary").fill("450000");
	      page.getByPlaceholder("Department").click();
	      page.getByPlaceholder("Department").fill("Influencer");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
	      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Dolly Parton 40 test@somail.com 450000 Influencer Edit Delete")).getByTitle("Edit").getByRole(AriaRole.IMG).click();
	      page.getByPlaceholder("Department").click();
	      page.getByPlaceholder("Department").fill("Social Media");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
	      page.locator("div:nth-child(6) > .rt-tr > div:nth-child(6)").click();
	      page.waitForTimeout(2000);
	      page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("Dolly")).nth(1).click();
	      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Dolly Parton 40 test@somail.com 450000 Influencer Edit Delete")).getByTitle("Edit").locator("path").click();
	      page.getByPlaceholder("First Name").click();
	      page.getByPlaceholder("First Name").fill("Clamentine");
	      page.getByPlaceholder("Last Name").click();
	      page.getByPlaceholder("Last Name").fill("Dillon");
	      page.getByPlaceholder("name@example.com").click();
	      page.getByPlaceholder("name@example.com").click();
	      page.getByPlaceholder("name@example.com").fill("fake@everything.com");
	      page.getByPlaceholder("Age").click();
	      page.getByPlaceholder("Age").fill("27");
	      page.getByPlaceholder("Salary").click();
	      page.getByPlaceholder("Salary").fill("30405");
	      page.getByPlaceholder("Department").click();
	      page.getByPlaceholder("Department").fill("Loan&Recovery");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
	      page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("cierra@example.com")).click();
	      page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("450000")).click();
	      page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("Clamentine")).click();
	      page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("Cierra").setExact(true)).click();
	      page.locator("div:nth-child(5) > .rt-tr > div").first().click();
	      page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("Parton")).click();
	      page.getByLabel("rows per page").selectOption("50");
	      page.locator("#close-fixedban").click();
	      page.locator("#close-fixedban").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
	      page.getByPlaceholder("First Name").click();
	      page.getByPlaceholder("First Name").fill("London");
	      page.getByText("First NameLast NameEmailAgeSalaryDepartmentSubmit").click();
	      page.getByPlaceholder("Last Name").click();
	      page.getByPlaceholder("Last Name").fill("May");
	      page.getByPlaceholder("name@example.com").click();
	      page.getByPlaceholder("name@example.com").fill("fyi@example.com");
	      page.getByPlaceholder("Age").click();
	      page.getByPlaceholder("Age").fill("19");
	      page.getByPlaceholder("Salary").click();
	      page.getByPlaceholder("Salary").fill("3400000");
	      page.getByPlaceholder("Department").click();
	      page.getByPlaceholder("Department").fill("Slay");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
	      page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("London May 19 fyi@example.com 3400000 Slay Edit Delete")).getByTitle("Delete").locator("path").click();
	      page.getByText("Upload and Download").click();
	      page.getByText("Web Tables").click();
	      page.locator("li").filter(new Locator.FilterOptions().setHasText("Dynamic Properties")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Visible After 5 Seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Will enable 5 seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Will enable 5 seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Will enable 5 seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Visible After 5 Seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Will enable 5 seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Visible After 5 Seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).dblclick();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Will enable 5 seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Visible After 5 Seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Will enable 5 seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByText("This text has random IdWill enable 5 secondsColor ChangeVisible After 5 Seconds").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Will enable 5 seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Visible After 5 Seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Will enable 5 seconds")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Color Change")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Visible After 5 Seconds")).click();
	    }
	  
	@Test
	 public void EmptyFormTest() {
	      page.navigate("https://demoqa.com/");
	      page.waitForTimeout(4000);
	      page.locator("div:nth-child(2) > div > .avatar > svg").click();
	      page.getByText("Practice Form").click();
	      page.getByPlaceholder("name@example.com").click();
	      page.getByPlaceholder("name@example.com").fill("toomanygal@2");
	      page.getByPlaceholder("Mobile Number").click();
	      page.getByPlaceholder("Mobile Number").fill("34");
	      page.locator("#dateOfBirthInput").click();
	      page.locator(".container > div:nth-child(2) > div:nth-child(3)").click();
	      page.locator("#dateOfBirthInput").click();
	      page.locator(".subjects-auto-complete__value-container").click();
	      page.frameLocator("iframe[name=\"google_ads_iframe_\\/21849154601\\,22343295815\\/Ad\\.Plus-Anchor_0\"]").locator("#cbb").click();
	      page.frameLocator("iframe[name=\"google_ads_iframe_\\/21849154601\\,22343295815\\/Ad\\.Plus-300x250_0\"]").locator("#cbb").click();
	      page.locator("#currentAddress-wrapper div").filter(new Locator.FilterOptions().setHasText("Current Address")).click();
	      page.locator(".container > div:nth-child(2) > div:nth-child(3)").dblclick();
	      page.getByLabel("Select picture").click();

	      page.getByText("Sports").click();
	      page.locator("#fixedban div").nth(1).click();
	      page.locator("#close-fixedban").dblclick();
	      page.locator("#fixedban div").nth(1).click();
	      page.locator("#close-fixedban").click(new Locator.ClickOptions()
	        .setClickCount(4));
	      page.locator("#fixedban div").nth(1).click();
	      page.locator("#fixedban div").nth(1).click();
	      page.locator("#close-fixedban").dblclick();
	      page.locator("#close-fixedban").dblclick();
	      page.locator("#close-fixedban").click(new Locator.ClickOptions()
	        .setClickCount(5));
	      page.locator("#close-fixedban").click(new Locator.ClickOptions()
	        .setClickCount(4));
	      page.locator("#fixedban div").nth(1).click();
	      page.locator("#close-fixedban").click(new Locator.ClickOptions()
	        .setClickCount(3));
	      page.getByPlaceholder("Current Address").click();
	      page.getByPlaceholder("Current Address").fill("fgmdrkmfd");
	      page.locator(".subjects-auto-complete__value-container").click();
	      page.locator("#subjectsInput").fill("b,lfgmg");
	      page.getByText("Female").click();
	      page.getByPlaceholder("First Name").click();
	      page.getByPlaceholder("First Name").fill("gfhfg");
	      page.getByPlaceholder("Last Name").click();
	      page.getByPlaceholder("Last Name").fill("gfhfgjh");
	      page.locator("#close-fixedban").click(new Locator.ClickOptions()
	        .setClickCount(8));
	      page.getByPlaceholder("Current Address").click();
	      page.getByPlaceholder("Current Address").fill("");
	      page.getByPlaceholder("name@example.com").click();
	      page.getByPlaceholder("name@example.com").fill("");
	      page.getByPlaceholder("First Name").click();
	      page.getByPlaceholder("First Name").fill("");
	      page.getByPlaceholder("Last Name").click();
	      page.getByPlaceholder("Last Name").fill("");
	    }
	  
	
	@Test
	public void AutoCompleteTest () {
	      page.navigate("https://demoqa.com/");
	      page.waitForTimeout(3000);
	      page.locator("div:nth-child(4) > div > .avatar > svg").click();
	      page.getByText("Accordian").click();
	      page.getByText("What is Lorem Ipsum?").click();
	      page.getByText("What is Lorem Ipsum?").click();
	      page.getByText("What is Lorem Ipsum?").click();
	      page.getByText("Where does it come from?").click();
	      page.waitForTimeout(1000);
	      page.getByText("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots ").click();
	      page.getByText("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots ").click();
	      page.getByText("Where does it come from?").click();
	      page.getByText("Why do we use it?").click();
	      page.getByText("Why do we use it?").click();
	      page.getByText("What is Lorem Ipsum?").click();
	      page.getByText("Where does it come from?").click();
	      page.waitForTimeout(1000);
	      page.locator(".row > div:nth-child(2)").click();
	      page.getByText("Why do we use it?").click();
	      page.getByText("Auto Complete").click();
	      page.waitForTimeout(1000);
	      page.locator(".auto-complete__value-container").first().click();
	      page.locator("#autoCompleteMultipleInput").fill("Pink");
	      page.locator("#autoCompleteMultipleInput").press("Enter");
	      page.locator("#autoCompleteSingleContainer > .auto-complete__control > .auto-complete__value-container").click();
	      page.locator("#autoCompleteSingleInput").fill("Pink");
	      page.waitForTimeout(1000);
	      page.locator(".auto-complete__value-container").first().click();
	      page.locator("#autoCompleteMultipleInput").fill("Yellow Blue Orange");
	      page.locator("#autoCompleteSingleContainer > .auto-complete__control > .auto-complete__value-container").click();
	      page.locator("#autoCompleteSingleInput").fill("Beige");
	      page.locator(".auto-complete__value-container").first().click();
	      page.locator("#autoCompleteMultipleInput").fill("Black");
	      page.waitForTimeout(1000);
	      page.locator("#autoCompleteMultipleInput").press("Enter");
	      page.locator("#autoCompleteMultipleInput").fill("Y");
	      page.getByText("Yellow", new Page.GetByTextOptions().setExact(true)).click();
	      page.locator("#autoCompleteMultipleInput").fill("P");
	      page.getByText("Purple", new Page.GetByTextOptions().setExact(true)).click();
	      page.locator("#autoCompleteSingleContainer > .auto-complete__control > .auto-complete__value-container").click();
	      page.locator("#autoCompleteSingleInput").fill("P");
	      page.locator("#react-select-3-option-0").click();
	      page.locator("li").filter(new Locator.FilterOptions().setHasText("Date Picker")).click();
	      page.locator("#datePickerMonthYearInput").click();
	      page.locator("#datePickerMonthYearInput").fill("08/15/2068");
	      page.getByText("19202122232425").click();
	      page.locator("#dateAndTimePickerInput").click();
	      page.getByText("August", new Page.GetByTextOptions().setExact(true)).click();
	      page.getByText("April").click();
	      page.waitForTimeout(1000);
	      page.locator("#dateAndTimePicker span").nth(2).click();
	      page.getByText("2025").click();
	      page.getByText("6789101112").click();
	      page.waitForTimeout(1000);
	      page.locator("#dateAndTimePicker").click();
	      page.locator("li").filter(new Locator.FilterOptions().setHasText("Slider")).click();
	      page.locator("span").filter(new Locator.FilterOptions().setHasText("Forms")).locator("div").first().click();
	      page.getByRole(AriaRole.SLIDER).click();
	      page.waitForTimeout(1000);
	      page.getByRole(AriaRole.SLIDER).click();
	      page.getByRole(AriaRole.SLIDER).click();
	      page.locator("#sliderValue").click();
	      page.locator("#sliderValue").fill("500");
	      page.waitForTimeout(1000);
	      page.getByRole(AriaRole.SLIDER).click();
	      page.getByRole(AriaRole.SLIDER).dblclick();
	      page.getByRole(AriaRole.SLIDER).click();
	      page.getByRole(AriaRole.SLIDER).fill("29");
	      page.getByRole(AriaRole.SLIDER).dblclick();
	      page.waitForTimeout(1000);
	      page.getByRole(AriaRole.SLIDER).click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^50$"))).first().dblclick();
	      page.waitForTimeout(1000);
	      page.locator("span").filter(new Locator.FilterOptions().setHasText("Widgets")).locator("div").first().click();
	      page.getByText("Progress Bar").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Start")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Stop")).click();
	      page.waitForTimeout(1000);
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Start")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Stop")).click();
	      page.waitForTimeout(1000);  
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Start")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reset")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Start")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reset")).click();
	    }
	  
	@Test
	public void TabsandMenuTest() {
	      page.navigate("https://demoqa.com/");
	      page.waitForTimeout(3000);
	      page.locator("div:nth-child(4) > div > .avatar > svg").click();
	      page.locator("li").filter(new Locator.FilterOptions().setHasText("Tabs")).click();
	      page.getByText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem").click();
	      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Origin")).click();
	      page.waitForTimeout(1000);
	      page.getByText("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots ").click();
	      page.getByText("The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for t").click();
	      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Use")).click();
	      page.waitForTimeout(1000);
	      page.getByText("WhatOriginUseMore").click();
	      page.getByText("WhatOriginUseMore").click();
	      page.getByText("WhatOriginUseMore").click(new Locator.ClickOptions()
	        .setClickCount(3));
	      page.waitForTimeout(1000);
	      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Origin")).click();
	      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Use")).click();
	      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("What")).click();
	      page.getByText("Tool Tips").click();
	      page.waitForTimeout(1000);
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Contrary")).click();
	      page.getByText("Menu", new Page.GetByTextOptions().setExact(true)).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Main Item 1")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Main Item 2")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sub Item")).nth(1).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Main Item 3")).click();
	      page.waitForTimeout(1000);
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Main Item 3")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Main Item 2")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Main Item 1")).click();
	      page.waitForTimeout(1000);
	      page.locator("#app div").filter(new Locator.FilterOptions().setHasText("Main Item 1Main Item 2Sub ItemSub ItemSUB SUB LIST »Sub Sub Item 1Sub Sub Item 2")).nth(3).click();
	      page.getByText("Select Menu").click();
	      page.locator("#withOptGroup svg").click();
	      page.getByText("Group 2", new Page.GetByTextOptions().setExact(true)).click();
	      page.waitForTimeout(1000);
	      page.getByText("Group 2, option 1", new Page.GetByTextOptions().setExact(true)).click();
	      page.locator("#selectOne svg").click();
	      page.getByText("Mrs.", new Page.GetByTextOptions().setExact(true)).click();
	      page.locator("#oldSelectMenu").selectOption("8");
	      page.locator("#selectMenuContainer svg").nth(2).click();
	      page.locator("#react-select-4-option-3").click();
	      page.locator("#selectMenuContainer svg").nth(2).click();
	      page.waitForTimeout(1000);
	      page.locator("#selectMenuContainer svg").nth(2).click();
	      page.getByText("Standard multi selectVolvoSaabOpelAudi").click();
	      page.locator("div:nth-child(7) > .col-md-6 > .css-2b097c-container > .css-yk16xz-control > .css-1wy0on6 > .css-tlfecz-indicatorContainer").click();
	      page.locator("#react-select-4-option-1").click();
	      page.locator("#react-select-4-option-3").click();
	      page.waitForTimeout(1000);
	      page.locator(".row > div:nth-child(3)").click();
	      page.locator("#cars").selectOption("saab");
	      page.getByText("Select ValueGroup 2, option 1Select OneMrs.Old Style Select MenuRedBlueGreenYell").click();
	      page.locator("#selectOne svg").click();
	      page.waitForTimeout(1000);
	      page.getByText("Prof.", new Page.GetByTextOptions().setExact(true)).click();
	      page.navigate("https://demoqa.com/select-menu");
	      page.waitForTimeout(1000);
	      page.locator("#withOptGroup svg").click();
	      page.getByText("Group 1, option 1", new Page.GetByTextOptions().setExact(true)).click();
	      page.frameLocator("iframe[name=\"google_ads_iframe_\\/21849154601\\,22343295815\\/Ad\\.Plus-300x250_0\"]").locator("#cbb").click();
	      page.locator("#cars").selectOption("opel");
	      page.locator("#oldSelectMenu").selectOption("3");
	      page.waitForTimeout(1000);
	      page.locator("#selectOne div").filter(new Locator.FilterOptions().setHasText("Select Title")).nth(1).click();
	      page.getByText("Mr.", new Page.GetByTextOptions().setExact(true)).click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Select\\.\\.\\.$"))).nth(2).click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Standard multi selectVolvoSaabOpelAudi$"))).first().click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Multiselect drop downSelect\\.\\.\\.$"))).first().click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Multiselect drop downSelect\\.\\.\\.$"))).first().click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Select Menu$"))).first().click();
	      page.locator("#withOptGroup svg").click();
	      page.waitForTimeout(1000);
	      page.getByText("A root option", new Page.GetByTextOptions().setExact(true)).click();
	      page.locator("#selectMenuContainer > div:nth-child(4)").click();
	    }
	  }


