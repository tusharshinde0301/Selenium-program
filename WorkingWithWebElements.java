package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WorkingWithWebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(5000);
		driver.findElement(By.id("APjFqb")).clear();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("APjFqb")).getAttribute("class"));
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getText());
		System.out.println(driver.findElement(By.id("APjFqb")).getSize());
		System.out.println(driver.findElement(By.id("APjFqb")).getTagName());
		System.out.println(driver.findElement(By.id("APjFqb")).isDisplayed());
		System.out.println(driver.findElement(By.id("APjFqb")).isEnabled());
		System.out.println(driver.findElement(By.id("APjFqb")).isSelected());
		System.out.println(driver.findElement(By.id("APjFqb")).getClass());
		driver.close();
	}

}
