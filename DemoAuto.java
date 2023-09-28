package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;

public class DemoAuto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver=new FirefoxDriver();
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver=new EdgeDriver();
		/*driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("shoes");
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"landingImage\"]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();*/
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
		Thread.sleep(1000);
		driver.close();

	}

}
