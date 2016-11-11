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
	
	@AfterClass
	public void classTearDown(){
		menuBar.jobSearchLink.click();
	}

}
