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
public class Webtables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System Property for Chrome Driver
		ChromeOptions cc_options = new ChromeOptions();
		cc_options.addArguments("--headless");//desired capabilities
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cc_options);
		String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";

		driver.get(baseUrl);
		String innerText = driver.findElement(
			By.xpath("//center/table/tbody/tr[1]/td[1]")).getText(); 	
	        System.out.println(innerText); 
		driver.quit();
		
	}

}
