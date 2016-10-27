package tests;

import org.testng.Assert;
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

}
