package selenium;
/**
 * 
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author kapilnegi
 *
 */
public class DatadrivenDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// System Property for Chrome Driver

		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		ChromeOptions cc_options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cc_options);
		cc_options.addArguments("--remote-allow-origins=*");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Import excel sheet.
		File dataFile = new File("C:\\Users\\Tushar\\eclipse-workspace-new\\selenium\\src\\main\\java\\resources\\testData.xlsx");

		// Load the file.
		FileInputStream finput = new FileInputStream(dataFile);

		// Finds the workbook instance for XLSX file
        XSSFWorkbook myWorkBook = new XSSFWorkbook (finput);

        // Return first sheet from the XLSX workbook
        XSSFSheet mySheet = myWorkBook.getSheetAt(0);

        int my_rows = mySheet.getPhysicalNumberOfRows();
        for (int i=1; i<my_rows; i++)
        {
        	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        	XSSFRow my_row = mySheet.getRow(i);
        	Thread.sleep(3000);
        	driver.findElement(By.name("username")).sendKeys(my_row.getCell(1).getStringCellValue());
 			driver.findElement(By.name("password")).sendKeys(my_row.getCell(2).getStringCellValue());
 			//driver.findElement(By.id("signin")).click();
 			Cell cell2Update = my_row.createCell(3);
 			cell2Update.setCellValue("Pass");
 			
        }
        finput.close();
        FileOutputStream outFile =new FileOutputStream(dataFile);
        myWorkBook.write(outFile);
		outFile.close();
        driver.quit();



	}

}
