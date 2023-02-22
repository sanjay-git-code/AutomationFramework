package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
	 @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	 WebElement homePageUserName;

	public WebElement getHomePageUserName() {
		return homePageUserName;
	}

	public void setHomePageUserName(WebElement homePageUserName) {
		this.homePageUserName = homePageUserName;
	}
}
