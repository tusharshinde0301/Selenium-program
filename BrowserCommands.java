package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */

/**
 * @author kapilnegi
 *
 */
public class BrowserCommands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System Property for Chrome Driver
		ChromeOptions cc_options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cc_options);


		driver.get("http://www.seleniumframework.com/demo-sites/");

		String pageTitle = driver.getTitle();
		System.out.println("Page Title = " + pageTitle);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL = " + currentUrl);

		String pageSource = driver.getPageSource();
		System.out.println("Current Page Source = " + pageSource);

		driver.close();
		driver.quit();

	}

}
