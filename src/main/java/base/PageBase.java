package base;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageBase extends Driver{
	
	public String getCurrentUrl(){
		return driver.getCurrentUrl();
	}

	public void pageRefresh() {
		driver.navigate().refresh();
	}
	public String selectOptionFormDropdownList(WebElement dropdownList) {
		String selectOption = null;
		/* --  Create object of Select class  */
		Select  select = new Select(dropdownList);
		
		/* -- Collect all options WebElement from given dropdown WebElement in a List   */
		List<WebElement>  optionList = select.getOptions();
		/*  -- Generate random number/Index starting form 1 to max index of option list  */
		int min = 1;
		int max = optionList.size();
		Random  rand = new Random();
		int randomNumber = rand.nextInt(max - min ) + min;
		System.out.println(randomNumber);
		/* -- Select random option form given dropdown WebElement  */
		
		select.selectByIndex(randomNumber);
		
		/*-- collect Selected option value */
	    selectOption  = select.getFirstSelectedOption().getText();
		/*-- Return Selected option value */
		return selectOption;
		
	}

}
