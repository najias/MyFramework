package tests;

import org.testng.annotations.BeforeClass;

import base.TestBase;

public class TestRegisterPage extends TestBase{
	
	@BeforeClass
	public void classSetUp(){
		menuBar.registerPageLink.click();
		
		
	}

}
