package com.cybertek.utilities;

//TASK: NEW METHOD CREATION
//Method name: getDriver
//Static method
//Accept String arg: browserType
//  - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static void main(String[] args) {

    }


    public static WebDriver getDriver(String browserType){
      //WebDriver result;

        if (browserType.equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup(); // set up chrome driver
         // result =  new ChromeDriver(); // this the one will create the webinstance
          return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")){
          WebDriverManager.firefoxdriver().setup();
           //result = new FirefoxDriver();
           return new FirefoxDriver();

        }else {
            System.out.println("Given browser type does not exist. Driver = null");
            return null;
        }


    }
}
