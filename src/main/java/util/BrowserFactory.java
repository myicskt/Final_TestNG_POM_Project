package util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory extends BasePage {

	// public static WebDriver driver= null;

	public static String baseURL = null;
	public static String browser = null;
	public static String driverManager = null;
	static WebDriver driver;

	public static WebDriver init() throws IOException {

		baseURL = ReadConFig("src/main/java/config/config.properties", "baseURL");
		browser = ReadConFig("src/main/java/config/config.properties", "browser");
		driverManager = ReadConFig("src/main/java/config/config.properties", "driverManager");
		
		if (driverManager.equalsIgnoreCase(driverManager)) {
			// This method does not need to download the (using WebDrivrManager dependency )
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else if (browser.equalsIgnoreCase("internetExplore")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			} else if (browser.equalsIgnoreCase("safari")) {
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
			}
		} else {
			// This method need to download the Webdriver
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("fireox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/drivers/edge");
				driver = new EdgeDriver();
			} else if (browser.equalsIgnoreCase("safari")) {
				System.setProperty("webdriver.safari.driver", System.getProperty("user.dir") + "/drivers/safaridriver");
				driver = new SafariDriver();
			} else if (browser.equalsIgnoreCase("internetecplore")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/iedriver");
				driver = new InternetExplorerDriver();
			}
		}
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

	public static void tearDown() {
		driver.quit();

	}
}
