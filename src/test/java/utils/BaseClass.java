package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static BaseClass baseClass;
    
    public static WebDriver driver = null;
    public final static int TIMEOUT = 10;
     
     public BaseClass() {
          
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
            driver.manage().window().maximize();
            
 
     }      
             
    public static void openPage(String url) {
        driver.get(url);
    }
     
    public static WebDriver getDriver() {
        return driver;
                 
    }

    public static void setUpDriver() {
         
        if (baseClass==null) {
             
        	baseClass = new BaseClass();
        }
    }
 

     public static void tearDown() {
          
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
          
         baseClass = null;
 
     } 
     
}
