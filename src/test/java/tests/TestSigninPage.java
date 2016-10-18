package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class TestSigninPage extends TestBase {
	
	@Test
	public void  testSignInWithValidCredentials(){
		signinPage.signIn(getProperty("email"), getProperty("password"));
		String Url = signinPage.getCurrentUrl();
		Assert.assertTrue(Url.contains("/profile.php"));
	}

}
