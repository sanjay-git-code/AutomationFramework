package pageObjects;

import org.openqa.selenium.support.PageFactory;

import objectRepo.HomePageObjects;
import utils.BaseClass;

public class HomePage {
	
	  HomePageObjects homePageObjects = null;
	    
	    public HomePage() {
	         
	        this.homePageObjects = new HomePageObjects();
	 
	        PageFactory.initElements(BaseClass.getDriver(),homePageObjects);
	    }
	  
	    // Get the User name from Home Page
	    public String getHomePageText() {
	        return homePageObjects.getHomePageUserName().getText();
	    }
	 
	 
	  

}
