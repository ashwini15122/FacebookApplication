package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
	public static void selectDropDown(WebElement wb,String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			new Select(wb).selectByVisibleText(value);
		}
	}

}
