package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */

/**
 * @author kapilnegi
 *
 */
public class MouseKeyboardActions {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		ChromeOptions cc_options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cc_options);

		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));    

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();

        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);        
        mouseOverHome.perform();        
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        Thread.sleep(3000);

        driver.get("https://www.facebook.com");
        WebElement txtUsername = driver.findElement(By.id("email"));

        Action seriesOfActions = builder
        	.moveToElement(txtUsername)
        	.click()
        	.keyDown(txtUsername, Keys.SHIFT)
        	.sendKeys(txtUsername, "hello")
        	.keyUp(txtUsername, Keys.SHIFT)
        	.doubleClick(txtUsername)
        	.contextClick()
        	.build();

        seriesOfActions.perform() ;
        Thread.sleep(3000);

        driver.quit();

	}

}
