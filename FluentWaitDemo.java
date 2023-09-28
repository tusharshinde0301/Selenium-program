package selenium;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */

/**
 * @author kapilnegi
 *
 */
public class FluentWaitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System Property for Chrome Driver
		ChromeOptions cc_options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cc_options);
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		 driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
		 
		 
		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))
		        .ignoring(NoSuchElementException.class);
		 
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		 public WebElement apply(WebDriver driver) {
		 WebElement element = driver.findElement(By.xpath("//*[@id='demo']"));
		 String getTextOnPage = element.getText();
		 if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
		 System.out.println(getTextOnPage);
		 return element;
		 }else{
		 System.out.println("FluentWait Failed");
		 return null;
		 }
		 }
		 });

	}

}
