package pageObjects;

import org.openqa.selenium.support.PageFactory;

import objectRepo.LoginPageObjects;
import utils.BaseClass;

public class LoginPage {
	
	LoginPageObjects loginPageObjects = null;
	
	public LoginPage() {
		 this.loginPageObjects = new LoginPageObjects();
		 
	        PageFactory.initElements(BaseClass.getDriver(),loginPageObjects);
	    
	}
	
	 public void login(String strUserName, String strPassword) {
         
	        // Fill user name
		 loginPageObjects.getUserName().sendKeys(strUserName);
	  
	        // Fill password
		 loginPageObjects.getPassword().sendKeys(strPassword);
	  
	        // Click Login button
		 loginPageObjects.getLogin().click();
	  
	    }
	  
	    //Get the title of Login Page")
	    public String getLoginTitle() {
	        return loginPageObjects.getTitleText().getText();
	    }
	       
	    // Get the error message of Login Page
	    public String getErrorMessage() {
	        return loginPageObjects.getErrorMessage().getText();
	    }
	       
	}
