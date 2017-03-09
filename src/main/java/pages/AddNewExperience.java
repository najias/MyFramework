package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class AddNewExperience extends PageBase{
	
	@FindBy(name = "JobTitle")
	public WebElement jobTitleField;

}
