package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class AddNewEducation extends PageBase {
	
	@FindBy(name = "DegreeType")
	public WebElement degreeType;
	
	@FindBy(name = "DegreeName")
	public WebElement degreeNameField;
	
	@FindBy(name = "StartingYear")
	public WebElement startingYearField;
	
	@FindBy(name = "GraduationYear")
	public WebElement graduationYearField;
	
	
	@FindBy(name = "CGPA")
	public WebElement cgpaField;
	
	@FindBy(name = "SchoolName")
	public WebElement schoolNameField;
	
	@FindBy(name = "Address")
	public WebElement addressField;
	
	@FindBy(name = "City")
	public WebElement cityField;
	
	@FindBy(name = "State")
	public WebElement stateField;
	
	@FindBy(name = "Country")
	public WebElement countryField;
	
	@FindBy(name = "ZipCode")
	public WebElement zipCodeField;
	

	@FindBy (id = "error")
	public List<WebElement> errorWebElementList;
	
	

	@FindBy(name = "submit")
	public WebElement submitButton;

}
