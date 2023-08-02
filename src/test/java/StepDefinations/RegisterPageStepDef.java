package StepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterPageStepDef extends BaseClass{
	
	public static RegisterPage registerPage;
	@Given("User is on registration on {string}")
	public void user_is_on_registration_on(String browser) {
	    BaseClass.initialization(browser);
	    
	}

	@Then("User enter valid {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_valid_and_and_and_and_and_and_and(String fname, String lname, String email, String pass, String bday, String bmonth, String byear, String gender) throws InterruptedException {
         registerPage=new RegisterPage();
         registerPage.registerFunctionality(fname, lname, email, pass, bday, bmonth, byear, gender);
	Thread.sleep(10000);
	}
	@After
	public static void tearDown(Scenario scenario) throws InterruptedException
	{
		if(scenario.isFailed())
		{
			byte f []=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f,"image/png",scenario.getName());
			
		}
		else 
		{
			byte f []=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 scenario.attach(f, "image/png", scenario.getName());
			
		}
		Thread.sleep(5000);
}
}
