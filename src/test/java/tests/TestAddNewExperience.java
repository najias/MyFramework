package tests;

import org.testng.annotations.BeforeClass;

import base.TestBase;

public class TestAddNewExperience extends TestBase{
	
	@BeforeClass
	public void classSetUp() {
		menuBar.signInLink.click();
		signinPage.signIn("nurul@yahoo.com", "365827");
	}

}
