package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
	@Test
	public void testJobTitleWithTitle() {
		addNewExperience.jobTitleField.sendKeys("jhgfdgfsadtfyg");
		addNewExperience.submitButton.click();
		Assert.assertEquals(addNewExperience.errorWebElementList.get(0).getText(), "*");

	}


}
