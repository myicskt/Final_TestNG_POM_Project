package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.TC_01_ValidateCheckBox_Page;
import util.BrowserFactory;

public class TC_01_ValidateCheckBox_Test {
	
WebDriver driver;

@Test
public void ValidateChackBox() throws IOException {
	driver = BrowserFactory.init();
	TC_01_ValidateCheckBox_Page testCase01 = PageFactory.initElements(driver, TC_01_ValidateCheckBox_Page.class);
	testCase01.addtolist();
	testCase01.ValidateAllCheckBox();
	BrowserFactory.tearDown();
	
}
	

}
