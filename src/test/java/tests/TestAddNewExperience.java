package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import base.TestBase;

public class TestAddNewExperience extends TestBase{
	
	@BeforeClass
	public void classSetUp() {
		menuBar.signInLink.click();
		signinPage.signIn("nurul@yahoo.com", "365827");
	}
	
	@BeforeMethod
	public void reload() {
		jobSeekerProfileMenu.addExperienceLink.click();
	}


}
