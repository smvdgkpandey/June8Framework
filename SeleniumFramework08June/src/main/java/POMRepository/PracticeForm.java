package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseClass;

public class PracticeForm extends BaseClass{
	WebDriver driver;
	public PracticeForm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[@data-target='#elements']")
	private WebElement elemntsBtn;
	
	@FindBy(xpath="//a[text()='text box']")
	private WebElement textBoxBtn;
	
	
	
	public void clickOnElements() {
		
		click(elemntsBtn);
	}
	
public void clickOnTextBoxBtn() {
		
		click(textBoxBtn);
	}

}
