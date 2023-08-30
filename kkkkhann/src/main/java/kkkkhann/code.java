package kkkkhann;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class code {
     @FindBy(css="._1lo7mt7k") private WebElement codeclick;
	
	@FindBy(css="._q92ef6") private WebElement Entercode;
	
	@FindBy(css="._1mwdd64y") private WebElement back;
	
	
	public code(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Codeclick() {
		codeclick.click();
	}
	public void entercode() {
		Entercode.sendKeys("25723578");
	}
	public void Back() {
		back.click();
	}
}


