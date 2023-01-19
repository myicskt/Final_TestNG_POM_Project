package test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.TC_02_ValidateRemoveItems_Page;
import util.BrowserFactory;

public class TC_02_ValidateRemoveItems_Test {
	// Test 2: Validate that a single list item could be removed using the remove
	// button when a single checkbox is selected.

	WebDriver driver;

	@Test
	public void validate_removeSingleList() throws IOException {
		driver = BrowserFactory.init();
		TC_02_ValidateRemoveItems_Page testCase02 = PageFactory.initElements(driver, TC_02_ValidateRemoveItems_Page.class);
		testCase02.validate_removeSingleList();
		BrowserFactory.tearDown();

	}

}
