package page;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import util.BasePage;
public class TC_02_ValidateRemoveItems_Page extends  BasePage {
	WebDriver driver;
	// Test 2: Validate that a single list item could be removed using the remove
	// button when a single checkbox is selected.
	public TC_02_ValidateRemoveItems_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.NAME, using="submit") WebElement remove_element;
	@FindBy(how = How.XPATH, using="//form[@name='todo']//ul//input") List<WebElement> taggel_element;



	public void validate_removeSingleList() {
		
		if(!taggel_element.isEmpty()) {
			taggel_element.get(0).click();
			remove_element.click();
			
		}
		
		
		
	}


}
