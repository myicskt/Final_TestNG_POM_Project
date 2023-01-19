package page;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class TC_01_ValidateCheckBox_Page extends BasePage {
	// Test 1: Validate when the toggle all check box is CHECKED, all check boxes
	// for list items are also CHECKED ON.

	WebDriver driver;

	// Element library

	
	@FindBy(how = How.NAME, using = "allbox")WebElement TAGGEL_ALL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//form[@name='todo']//ul//input")List<WebElement> TAGGEL_LIST_ELEMENT;
	
	//
	@FindBy(how = How.XPATH, using = "//input[@name='data']")WebElement INPUT_ELEMENT;
	@FindBy(how = How.XPATH, using = " //input[@value='Add']")WebElement ADD_ELEMENT;
	

	public TC_01_ValidateCheckBox_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ValidateAllCheckBox() {
		TAGGEL_ALL_ELEMENT.click();
		for (WebElement a : TAGGEL_LIST_ELEMENT) {
			if (a.equals(a.isSelected())) {
				boolean elementCheck = a.isSelected();
				//Assert.assertTrue(elementCheck);
			}
		}
	}
	
	public void addtolist() {
		for(int i =0 ; i<5; i++) {
			String randomWord =BasePage.createRandomWord(5);
			INPUT_ELEMENT.sendKeys(randomWord);
			ADD_ELEMENT.click();
			
			
			
		}
	}
	

}
