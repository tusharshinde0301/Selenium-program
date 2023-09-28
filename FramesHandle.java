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
public class FramesHandle {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		ChromeOptions cc_options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cc_options);
		driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	      
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID
	       Thread.sleep(3000);
			System.out.println("********We are switch to the iframe*******");
			Thread.sleep(3000);
  		driver.findElement(By.xpath("html/body/a/img")).click();
		    //Clicks the iframe
    
			System.out.println("*********We are done***************");
            driver.quit();

	}

}
