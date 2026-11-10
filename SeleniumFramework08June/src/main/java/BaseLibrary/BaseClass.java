package BaseLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonUtils;
import Utils.ExcelReader;
import Utils.PropertyReader;

public class BaseClass  implements PropertyReader,CommonUtils,ExcelReader{
	String path="C:\\Users\\HP\\eclipse-workspace\\SeleniumFramework08June\\src\\test\\resources\\TestData\\config.properties";
	protected WebDriver driver;
	protected WebDriverWait wait;
	public void setUp(String browser,String env) throws IOException {
		if(browser.equals("chrome")) {
			 driver=new ChromeDriver();
		}else if(browser.equals("edge")) {
			 driver=new EdgeDriver();
		}
		
		
		if(env.equals("qa")) {
			driver.get(getReadData(path,"QAURL"));
		}
		driver.manage().window().maximize();
		
	}
	
	
	
	
	
	
	
	
	
	

	@Override
	public String getReadData(String path, String key) throws IOException {
		FileInputStream abc=new FileInputStream(path);
		Properties p=new Properties();
		p.load(abc);
	return	p.getProperty(key);
	}











	@Override
	public void click(WebElement ele) {
		System.out.println("step2");
		 wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
	}











	@Override
	public void enterValue(WebElement ele, String value) {
		 wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.sendKeys(value);
		
	}











	@Override
	public String readDataFromExcel(String path, String sheetname, int row, int col) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh =wb.getSheet(sheetname);
	return	sh.getRow(row).getCell(col).getStringCellValue();
	}

}
