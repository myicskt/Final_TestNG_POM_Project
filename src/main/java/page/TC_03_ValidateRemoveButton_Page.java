package page;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class TC_03_ValidateRemoveButton_Page extends BasePage {
	// Test 3: Validate that all list item could be removed using the remove button
	// and when "Toggle All" functionality is on.
	WebDriver driver;
	
	
	public TC_03_ValidateRemoveButton_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how = How.NAME, using="allbox") WebElement taggelAll_element;
	@FindBy(how = How.NAME, using="submit") WebElement remove_element;
	
	@FindBy(how = How.XPATH, using="//form[@name='todo']//ul//input") List<WebElement> taggel_element;
	public void Validate_allCheckBox() {
	

		if (taggel_element.size() > 0) {
			taggelAll_element.click();
			remove_element.click();
			//Assert.assertEquals(taggel_element.size(), 0);

		}

	}
	

}
