package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
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
		addNewEducation.selectOptionFormDropdownList(addNewEducation.degreeType);
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(0).getText(), "*");

	}

	@Test
	public void testDegreeTypeWithNoOption() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(0).getText(), "* DegreeType can not be empty.");

	}

	@Test
	public void testDegreeNameWithEmptyField() {
		addNewEducation.degreeNameField.clear();
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(1).getText(), "* DegreeName can not be empty.");

	}

	@Test
	public void testDegreeNameWithValidName() {
		addNewEducation.degreeNameField.sendKeys("Masters Degree/Graduate");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(1).getText(), "*");

	}

	@Test
	public void testDegreeNameWithDigit() {
		addNewEducation.degreeNameField.sendKeys("12344");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(1).getText(), "*");

	}

	@Test
	public void testDegreeNameWithFiftyChar() {
		addNewEducation.degreeNameField.clear();
		addNewEducation.degreeNameField.sendKeys("asdfghjklpoiuytrewqazxcvbnmlkjhgfdsaqwertyuioplkjha");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(1).getText(),
				"* DegreeName can not be greater than 50 character.");

	}

	@Test
	public void testDegreeNameWithOneChar() {
		addNewEducation.degreeNameField.clear();
		addNewEducation.degreeNameField.sendKeys("a");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(1).getText(), "*");
	}

	@Test
	public void testStartingYearWithEmptyField() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(2).getText(), "* StartingYear can not be empty.");

	}

	@Test
	public void testStartingYearWithFutureDate() {
		addNewEducation.startingYearField.sendKeys("2020");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(2).getText(), "*");

	}

	@Test
	public void testStartingYearWithValidDate() {
		addNewEducation.startingYearField.clear();
		addNewEducation.startingYearField.sendKeys("2015");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(2).getText(), "*");

	}

	@Test
	public void testGraduationYearWithEmptyField() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(3).getText(), "* GraduationYear can not be empty.");

	}

	@Test
	public void testGraduationYearWithFutureDate() {
		addNewEducation.graduationYearField.clear();
		addNewEducation.graduationYearField.sendKeys("2022");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(3).getText(), "*");

	}

	@Test
	public void testGraduationYearWithValidDate() {
		addNewEducation.graduationYearField.clear();
		addNewEducation.graduationYearField.sendKeys("2016");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(3).getText(), "*");

	}

	@Test
	public void testSchoolNameWithSchoolName() {
		addNewEducation.schoolNameField.clear();
		addNewEducation.schoolNameField.sendKeys("Hillcrest");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(4).getText(), "*");

	}

	@Test
	public void testSchoolNameWithSchoolNameTwoChar() {
		addNewEducation.schoolNameField.clear();
		addNewEducation.schoolNameField.sendKeys("as");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(4).getText(), "*");

	}

	@Test
	public void testSchoolNameWithEmptyField() {
		addNewEducation.schoolNameField.clear();
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(4).getText(), "* SchoolName can not be empty.");

	}

	@Test
	public void testCityWithCityName() {
		addNewEducation.cityField.clear();
		addNewEducation.cityField.sendKeys("Jamaica");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(5).getText(), "*");

	}

	@Test
	public void testCityWithEmptyField() {
		addNewEducation.cityField.clear();
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(5).getText(), "* City can not be empty.");

	}

	@Test
	public void testCityWithDigit() {
		addNewEducation.cityField.clear();
		addNewEducation.cityField.sendKeys("12345");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(5).getText(), "*");

	}

	@Test
	public void testStateWithStateName() {
		addNewEducation.stateField.clear();
		addNewEducation.stateField.sendKeys("New York");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(6).getText(), "*");
	}

	@Test
	public void testStateWithStateNameDigit() {
		addNewEducation.stateField.clear();
		addNewEducation.stateField.sendKeys("987");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(6).getText(), "*");
	}

	@Test
	public void testStateWithEmptyField() {
		addNewEducation.stateField.clear();
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(6).getText(), "* State can not be empty.");

	}

	@Test
	public void testCountryWithEmptyField() {
		addNewEducation.countryField.clear();
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(7).getText(), "* Country can not be empty.");

	}
	
	@Test
	public void testCountryWithDigit() {
		addNewEducation.countryField.clear();
		addNewEducation.countryField.sendKeys("12345");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(7).getText(), "*");

	}
	
	@Test
	public void testCountryWithCountryName() {
		addNewEducation.countryField.clear();
		addNewEducation.countryField.sendKeys("USA");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(7).getText(), "*");

	}

	@AfterClass
	public void classTearDown() {
		menuBar.logoutLink.click();
		menuBar.jobSearchLink.click();
	}

}
