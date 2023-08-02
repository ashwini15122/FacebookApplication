package PageLayer;

import static UtilityLayer.HandleDropDown.selectDropDown;
import static UtilityLayer.UtilsClass.sendKeys;
import static UtilityLayer.HandleRadioButton.*;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
public class RegisterPage extends BaseClass{
	
	@FindBy(name="firstname")
    private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	@FindBy(name="reg_passwd__")
	private WebElement password;
	
	@FindBy(name="birthday_day")
	private WebElement bday;
	
	@FindBy(name="birthday_month")
	private WebElement bmonth;
	
	@FindBy(name="birthday_year")
	private WebElement byear;
	
	@FindBy(name="sex")
	private List<WebElement> gender;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void registerFunctionality(String fname,String lname,String Email,String pass,String day,String month,String year,String Gender)
	{
		sendKeys(firstname,fname);
		sendKeys(lastname,lname);
		sendKeys(email,Email);
		sendKeys(password,pass);
		selectDropDown(bday,day);
		selectDropDown(bmonth,month);
		selectDropDown(byear,year);
		System.out.println(gender);
		selectRadio(gender,Gender);
	}
	}
