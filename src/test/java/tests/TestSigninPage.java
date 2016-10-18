package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestSigninPage extends TestBase {
	
	@BeforeClass
	public void classSetUp(){
		menuBar.signInLink.click();
		
	}
	
	@Test
	public void  testSignInWithValidCredentials(){
		signinPage.signIn(getProperty("email"), getProperty("password"));
		String Url = signinPage.getCurrentUrl();
		Assert.assertTrue(Url.contains("/profile.php"));
	}
	
	@AfterClass
	public void classSet(){
		menuBar.logoutLink.click();
	}
	

}
