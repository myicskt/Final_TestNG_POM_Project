package test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.TC_03_ValidateRemoveButton_Page;
import util.BrowserFactory;

public class TC_03_ValidateRemoveButton_Test {
	// Test 3: Validate that all list item could be removed using the remove button
	// and when "Toggle All" functionality is on.
	WebDriver driver;

	@Test
	public void validate_removeSingleList() throws IOException {
		driver = BrowserFactory.init();
		TC_03_ValidateRemoveButton_Page testCase03 = PageFactory.initElements(driver,TC_03_ValidateRemoveButton_Page.class);
		testCase03.Validate_allCheckBox();
		BrowserFactory.tearDown();

	}

}
