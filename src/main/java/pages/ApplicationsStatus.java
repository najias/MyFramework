package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class ApplicationsStatus extends PageBase {
	
	@FindBy(linkText = "AGM (Accounts)")
	public WebElement jobTitleLink;
	
	@FindBy(linkText = "View Application Decision")
	public WebElement viewApplicationDecisionLink;
	
	
	
	

}
