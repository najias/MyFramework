package base;

public class PageBase extends Driver{
	
	public String getCurrentUrl(){
		return driver.getCurrentUrl();
	}

	public void pageRefresh() {
		driver.navigate().refresh();
	}

}
