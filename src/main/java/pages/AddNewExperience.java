package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class AddNewExperience extends PageBase{
	
	@FindBy(name = "JobTitle")
	public WebElement jobTitleField;
	
	@FindBy(name = "Company")
	public WebElement companyField;
	

	@FindBy(name = "Responsibility")
	public WebElement responsibilityField;
	
	@FindBy(name = "JoiningDate")
	public WebElement joiningDateField;
	
	@FindBy(name = "ResignationDate")
	public WebElement resignationDateField;

	@FindBy(name = "submit")
	public WebElement submitButton;
	
	@FindBy (id = "error")
	public List<WebElement> errorWebElementList;

}
