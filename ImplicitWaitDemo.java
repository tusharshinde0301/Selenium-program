package selenium;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
public class ImplicitWaitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System Property for Chrome Driver
		ChromeOptions cc_options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cc_options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		
		try {
			driver.findElement(By.xpath("//a[@href='#'][contains(.,'Kapil')]"));
			System.out.println( "Test Passed") ;
		} catch (Exception e) {
			System.out.println( "Test Failed" );
		}
		//close browser
		driver.quit();

	}

}
