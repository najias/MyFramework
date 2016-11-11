package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestRegisterPage extends TestBase{
	
	@BeforeClass
	public void classSetUp(){
		menuBar.registerPageLink.click();
		
		
	}
	
	@Test
	public void testFirstNameWithOneCharacter() {
		registerPage.firstNameField.sendKeys("a");
		registerPage.submitButton.click();

		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(),
				"* FirstName can not be less than 2 character.");

	}
	
	@Test
	public void testFirstNameWithTwoCharacter() {
		registerPage.firstNameField.sendKeys("na");
		registerPage.submitButton.click();

		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(),
				"*");

	}
	

	@Test
	public void testFirstNameWithThirtyCharacter() {
		registerPage.firstNameField.sendKeys("namjkisdloiuytrewqasdfghjklmnb");
		registerPage.submitButton.click();

		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(),
				"*");

	}

	@Test
	public void testFirstNameWithThirtyOneCharacter() {
		registerPage.firstNameField.sendKeys("nmblkjhgfvcxzasdqwertyuioplkjhg");
		registerPage.submitButton.click();

		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(),
				"* FirstName can not be greater than 30 character.");

	}
	

	@Test
	public void testFirstNameWithNoCharacter() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(), "* FirstName can not be empty.");
	}
	
	@Test
	public void testFirstNameWithThirtyDigitNumber() {
		registerPage.firstNameField.clear();
		registerPage.firstNameField.sendKeys("345265789345678123456789876543");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(), "*");
	}
	
	@Test
	public void testLastNameWithOneCharacter() {
		registerPage.lastNameField.clear();
		registerPage.lastNameField.sendKeys("a");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(),
				"* LastName can not be less than 2 character.");
	}

	@Test
	public void testLastNameWithTwoCharacter() {
		registerPage.lastNameField.clear();
		registerPage.lastNameField.sendKeys("na");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(), "*");
	}

	@Test
	public void testLastNameWithThirtyCharacter() {
		registerPage.lastNameField.clear();
		registerPage.lastNameField.sendKeys("mynameisDewanNadiaSultanaShumi");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(), "*");

	}

	@Test
	public void testLastNameWithThirtyOneCharacter() {
		registerPage.lastNameField.clear();
		registerPage.lastNameField.sendKeys("my name is Dewan Nadia Sultanaa");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(),
				"* LastName can not be greater than 30 character.");

	}

	@Test
	public void testLastNameWithNoCharacter() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(), "* LastName can not be empty.");

	}

	@Test
	public void testLastNameWithThirtyDigitNumber() {
		registerPage.lastNameField.clear();
		registerPage.lastNameField.sendKeys("3452657893456712345678987653");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(), "*");
	}
	
	@Test
	public void testGenderWithSelectOption() {
		registerPage.selectOptionFormDropdownList(registerPage.genderField);
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(2).getText(), "*");
	}

	@Test
	public void testGenderWithNoOption() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(2).getText(), "* Gender can not be empty.");
	}
	
	@Test
	public void testDateOfBirthWithNoDate() {
		registerPage.dateOfBirthField.clear();
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(3).getText(), "* DateOfBirth can not be empty.");
	}

	@Test
	public void testDateOfBirthWithFutureDate() {
		registerPage.dateOfBirthField.clear();
		registerPage.dateOfBirthField.sendKeys("2018-12-19");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(3).getText(), "*");

	}
	@Test
	public void testPhoneNoWithTwoDigitNumber() {
		registerPage.phoneNoField.clear();
		registerPage.phoneNoField.sendKeys("34");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(4).getText(), "*");

	}

	@Test
	public void testPhoneNoWithThirtyOneDigitNumber() {
		registerPage.phoneNoField.clear();
		registerPage.phoneNoField.sendKeys("1234567890123456789009876543211");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(4).getText(),
				"* PhoneNo can not be greater than 30 character.");

	}

	@Test
	public void testPhoneNoWithNoNumber() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(4).getText(), "* PhoneNo can not be empty.");

	}
	
	@Test
	public void testUserTypeWithSelectOption() {
		registerPage.selectOptionFormDropdownList(registerPage.userTypeField);
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(5).getText(), "*");

	}
	
	@Test
	public void testUserTypeWithNoOption() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(5).getText(), "* UserType can not be empty.");

	}
	@Test
	public void testEmailWithInvalidEmail() {
		registerPage.emailField.clear();
		registerPage.emailField.sendKeys("sultana1@gmailcom");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(6).getText(), "* Invalid Email");

	}

	@Test
	public void testEmailWithEmptyEmailField() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(6).getText(), "* Email can not be empty.");

	}
	
	@AfterClass
	public void classTearDown(){
		menuBar.jobSearchLink.click();
	}

}
