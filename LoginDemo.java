package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.support.ui.Select;
public class LoginDemo {
	public static String browser= "edge";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/a")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		/*driver.get("https://demo.openmrs.org/openmrs/referenceapplication/login.page");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("xyz");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("abcd1234");
		Thread.sleep(3000);
		driver.findElement(By.id("Pharmacy")).click();
		driver.findElement(By.id("loginButton")).submit();
		Thread.sleep(3000);*/
		driver.close();
		
		
		
		
		
		
		
		
		
		
		/*driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	
		Thread.sleep(2000);
		driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		driver.navigate().to("https://www.sugarcrm.com/");
		driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[3]/div/div/div/div[2]/div/div[1]/a[1]/img")).click();
		driver.getWindowHandles();*/
		
	
		
		
		//driver.close();
		/*driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String title=driver.getTitle();
		System.out.println(title);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		driver.navigate().to("http://www.youtube.com");
		driver.close();*/
		
	}

}
