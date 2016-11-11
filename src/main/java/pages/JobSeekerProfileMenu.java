package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class JobSeekerProfileMenu extends PageBase{
	
	@FindBy(linkText = "ADD EDUCATION")
	public WebElement addEducationLink;

}
