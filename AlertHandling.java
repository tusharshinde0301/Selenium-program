package selenium;
import org.openqa.selenium.*;
//import org.openqa.selenium.By;
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
public class AlertHandling {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		//ChromeOptions cc_options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver(cc_options);
		ChromeDriver driver=new ChromeDriver();

		// Alert Message handling

        driver.get("http://demo.guru99.com/test/delete_customer.php");


        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);

        // Switching to Alert
        Alert alert = driver.switchTo().alert();	
        Thread.sleep(3000);
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);

        // Accepting alert		
        alert.accept();  //for okk
        //alert.dismiss();  for cancel
        driver.quit();

	}

}
