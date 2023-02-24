package stepDefs;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ForgetPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utils.BaseClass;

public class LoginPageStepDefs extends BaseClass{
	
	public LoginPageStepDefs() {
		super();
	}

	LoginPage objLogin = new LoginPage();
    HomePage objHomePage = new HomePage();
    ForgetPasswordPage objForgotPasswordPage = new ForgetPasswordPage();
	
	@Given("User is on HRMLogin page {string}")
	public void user_is_on_hrm_login_page(String url) {
		openPage(url);
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String userName, String passWord) {
        objLogin.login(userName, passWord);
	}

	@Then("User should be able to login successfully and new page open")
	public void user_should_be_able_to_login_successfully_and_new_page_open() {
        Assert.assertTrue(objHomePage.getHomePageText().contains("Dashboard"));
	}

	@Then("User should be able to see error message {string}")
	public void user_should_be_able_to_see_error_message(String expectedErrorMessage) {
        Assert.assertEquals(objLogin.getErrorMessage(),expectedErrorMessage);
  
	}

}
