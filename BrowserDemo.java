package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 */

/**
 * @author kapilnegi
 *
 */
public class BrowserDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();

		

        // Launch Website
		driver.get("http://www.javatpoint.com/");
		System.out.println("Open the javatpoint website on browser");
		
		Thread.sleep(1000);

		//Maximize the browser  
		driver.manage().window().maximize();
		System.out.println("Maximize the browser window");
		Thread.sleep(1000);

       
		// Click on the Search button  
		driver.findElement(By.xpath("//*[@id=\"link\"]/div/ul/li[3]/a")).click();
		System.out.println("Click on Core Java link");
		Thread.sleep(1000);

		// Close the driver
		driver.close();
		System.out.println("Close the browser");

	}

}

