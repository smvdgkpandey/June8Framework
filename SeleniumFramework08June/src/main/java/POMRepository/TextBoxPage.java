package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseClass;

public class TextBoxPage extends BaseClass{
	WebDriver driver;
	public TextBoxPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id=\"fullname1\"]")
	private WebElement fullnameText;
	
	
	@FindBy(id="fullemail1")
	private WebElement fullemail;
	
	public void enterfullname(String str) {
		enterValue(fullnameText, str);
	}
	
	
	public void enteremail(String str) {
		enterValue(fullemail, str);
	}
	
	
	
	
}
