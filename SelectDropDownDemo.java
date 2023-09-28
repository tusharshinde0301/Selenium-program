package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    WebElement ddown=driver.findElement(By.name("email"));
	    Select select=new Select(ddown);
	    select.selectByValue("Event");
		Thread.sleep(2000);
		select.deselectByVisibleText("Podcast");
		select.selectByIndex(4);
		driver.close();

	}

}
