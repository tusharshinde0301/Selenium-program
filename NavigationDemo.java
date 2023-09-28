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
public class NavigationDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		
		ChromeOptions cc_options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cc_options);

		driver.navigate().to("http://www.seleniumframework.com/demo-sites/");

		driver.navigate().refresh();
	     Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@href='http://www.seleniumframework.com/introduction/']")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("SELENIUM")).click();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);

		driver.navigate().forward();
		Thread.sleep(5000);

		driver.quit();

	}

}
