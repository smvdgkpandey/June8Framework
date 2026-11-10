package Tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibrary.BaseClass;
import POMRepository.PracticeForm;
import POMRepository.TextBoxPage;

public class TextTest extends BaseClass {
	String path="C:\\Users\\HP\\eclipse-workspace\\SeleniumFramework08June\\src\\test\\resources\\TestData\\June8.xlsx";
	
	PracticeForm pf;
	TextBoxPage tp;
	@Parameters({"browser","env"})
	@BeforeClass
	public void initialize(String browser, String env) throws IOException {
		setUp(browser, env);
		pf=new PracticeForm(driver);
		tp=new TextBoxPage(driver);
	}
	
	
	@Test
	public void validateTextBox() throws IOException {
		pf.clickOnElements();
		pf.clickOnTextBoxBtn();
		tp.enterfullname(readDataFromExcel(path, "Sheet1", 1, 0));
		tp.enteremail(readDataFromExcel(path, "Sheet1", 1, 1));
	}

}
