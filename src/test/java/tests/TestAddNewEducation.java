package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestAddNewEducation extends TestBase {
	

	@BeforeClass
	public void classSetUp() {

		menuBar.signInLink.click();
		signinPage.signIn("nurul@yahoo.com", "365827");
		jobSeekerProfileMenu.addEducationLink.click();
	}
	
	@Test
	public void testDegreeTypeWithSelectOption() {
		addNewEducation.degreeType.sendKeys("High School Diploma/GED");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(0).getText(), "*");

	}
	@Test
	public void testDegreeTypeWithNoOption() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(0).getText(), "* DegreeType can not be empty.");

	}


}
