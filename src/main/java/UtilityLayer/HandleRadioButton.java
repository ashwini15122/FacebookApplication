package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleRadioButton extends BaseClass{
	public static void selectRadio(List<WebElement> ls,String value)
	{
	for(WebElement abc: ls)	
	{  
		String gender=abc.getAttribute("value");
		//System.out.println(gender);
		if(gender.equals("1")&&value.equalsIgnoreCase("female"))
		{
			abc.click();
			break;
		}
		else if(gender.equals("2")&&value.equalsIgnoreCase("male"))
		{
			abc.click();
			break;
		}
		else if(gender.equals("-1")&&value.equalsIgnoreCase("custom"))
		{
			abc.click();
			break;
		}
	}
	}

}
