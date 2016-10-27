package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class RegisterPage extends PageBase {
	
	@FindBy(name = "FirstName")
	public  WebElement firstNameField;
	
	

}
