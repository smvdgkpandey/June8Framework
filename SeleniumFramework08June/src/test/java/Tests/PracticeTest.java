package Tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLibrary.BaseClass;
import POMRepository.PracticeForm;







public class PracticeTest extends BaseClass {
	
	
	PracticeForm pf;
	@Parameters({"browser","env"})
	@BeforeClass
	public void initialize(String browser, String env) throws IOException {
		setUp(browser, env);
		pf=new PracticeForm(driver);
	}
	
	
	@Test
	public void elementClick() {
		pf.clickOnElements();
		pf.clickOnTextBoxBtn();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	PracticeForm pf;
//	@Parameters({"browser","env"})
//	@BeforeTest
//	public void initialize(String browser,String env) throws IOException {
//		setUp(browser, env);
//		pf=new PracticeForm(driver);
//		
//	}
//	
//	
//	@Test
//	public void firstMethod() {
//		pf.clickOnElements();
//	}

}
