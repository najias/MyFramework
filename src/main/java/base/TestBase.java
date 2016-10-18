package base;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import pages.MenuBar;
import pages.SigninPage;

@Listeners(listener.EliteListener.class)
public class TestBase extends Driver{
	
	String  browserType = getProperty("browser");
	String  appUrl = getProperty("appUrl");
	
	protected static SigninPage  signinPage;
	protected static MenuBar  menuBar;
	
	@BeforeSuite
	
	public void setUp(){
		try{
			setDriver(browserType  , appUrl);
			
		}catch(Exception  e){
			e.printStackTrace();
		}
		
		signinPage = PageFactory.initElements(driver,SigninPage.class);
		menuBar = PageFactory.initElements(driver, MenuBar.class);
		
		
	}
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}

}
