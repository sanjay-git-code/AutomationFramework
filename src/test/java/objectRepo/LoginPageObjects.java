package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 public class LoginPageObjects {
	
	 @FindBy(name = "username")
	     WebElement userName;
	  
	    @FindBy(name = "password")
	     WebElement password;
	  
	    @FindBy(id = "logInPanelHeading")
	     WebElement titleText;
	  
	    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	     WebElement login;
	  
	    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	      WebElement errorMessage;
	         
	    @FindBy(xpath = "//*[@href='https://www.facebook.com/OrangeHRM/mycompany']")
	      WebElement faceBookIcon;  
	     
	    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span")
	     WebElement missingUsernameErrorMessage;

		public WebElement getUserName() {
			return userName;
		}

		public void setUserName(WebElement userName) {
			this.userName = userName;
		}

		public WebElement getPassword() {
			return password;
		}

		public void setPassword(WebElement password) {
			this.password = password;
		}

		public WebElement getTitleText() {
			return titleText;
		}

		public void setTitleText(WebElement titleText) {
			this.titleText = titleText;
		}

		public WebElement getLogin() {
			return login;
		}

		public void setLogin(WebElement login) {
			this.login = login;
		}

		public WebElement getErrorMessage() {
			return errorMessage;
		}

		public void setErrorMessage(WebElement errorMessage) {
			this.errorMessage = errorMessage;
		}

		public WebElement getFaceBookIcon() {
			return faceBookIcon;
		}

		public void setFaceBookIcon(WebElement faceBookIcon) {
			this.faceBookIcon = faceBookIcon;
		}

		public WebElement getMissingUsernameErrorMessage() {
			return missingUsernameErrorMessage;
		}

		public void setMissingUsernameErrorMessage(WebElement missingUsernameErrorMessage) {
			this.missingUsernameErrorMessage = missingUsernameErrorMessage;
		}
	    
	    

}
