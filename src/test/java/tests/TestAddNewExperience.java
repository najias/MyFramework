package tests;

import org.openqa.selenium.Keys;
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
	@Test
	public void testJobTitleWithEmpty() {
		addNewExperience.submitButton.click();
		Assert.assertEquals(addNewExperience.errorWebElementList.get(0).getText(), "* JobTitle can not be empty.");

	}

	@Test
	public void testSelectYourCompanyWithSelectOption() {
		addNewExperience.selectOptionFormDropdownList(addNewExperience.companyField);
		addNewExperience.submitButton.click();

		Assert.assertEquals(addNewExperience.errorWebElementList.get(1).getText(), "*");

	}

	@Test
	public void testSelectYourCompanyWithEmpty() {
		addNewExperience.submitButton.click();
		Assert.assertEquals(addNewExperience.errorWebElementList.get(1).getText(), "* Company can not be empty.");
	}

	@Test
	public void testJoiningDateWithValidDate() {
		addNewExperience.joiningDateField.sendKeys(Keys.DELETE);
		if (getProperty("browser").equalsIgnoreCase("chrome")) {
			addNewExperience.joiningDateField.sendKeys("15/01/2016");
		}else {
		addNewExperience.joiningDateField.sendKeys("2016-01-15");
		}
		addNewExperience.submitButton.click();
		Assert.assertEquals(addNewExperience.errorWebElementList.get(2).getText(), "*");

	}

	@Test
	public void testJoiningDateWithEmpty() {
		//addNewExperience.joiningDateField.clear();
		addNewExperience.submitButton.click();
		Assert.assertEquals(addNewExperience.errorWebElementList.get(2).getText(), "* JoiningDate can not be empty.");

	}


}
