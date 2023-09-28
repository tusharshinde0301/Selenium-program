package selenium;
import java.util.Iterator;
import java.util.Set;

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
public class PopupHandling {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		ChromeOptions cc_options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cc_options);


		driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        String MainWindow=driver.getWindowHandle();

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();  // refer relative xpath
        Thread.sleep(3000);
       

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");

                    driver.findElement(By.name("btnLogin")).click();
                    Thread.sleep(3000);

			// Closing the Child Window.
                        driver.close();
            }
            Thread.sleep(3000);
        
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);

        }
        driver.quit();
	}

}