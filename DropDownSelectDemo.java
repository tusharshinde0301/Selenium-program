package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectDemo {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		ChromeOptions cc_options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cc_options);

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		Thread.sleep(3000);
        drpCountry.selectByIndex(3);
        Thread.sleep(1000);
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		assert fruits.isMultiple();
		/*fruits.selectByVisibleText("Banana");
		Thread.sleep(1000);
		fruits.deselectByVisibleText("Banana");
		Thread.sleep(1000);
		fruits.deselectByVisibleText("Apple");
		Thread.sleep(1000);*/
		fruits.selectByIndex(3);
		Thread.sleep(1000);
		fruits.selectByIndex(2);
		Thread.sleep(1000);
		

		driver.quit();

	}

}
