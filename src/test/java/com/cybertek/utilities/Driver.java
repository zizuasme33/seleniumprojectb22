package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /*
    Creating private constructor so this can not be reached outside
     */

      private Driver(){}

    /*
    Making our 'driver' instance private so that it is not reachable from outside of the class.
    We make it static, because we want it to run before everything else, and also we will use it in a static method
     */

     private static WebDriver driver;

        /*
        Creating reusable utility method will return same driver instance everytime we call it.
         */

    public static WebDriver getDriver(){

        if(driver== null){
                /*
                We read our browser type from configuration.properties file using
                .getProperty method we creating in configurationReader class.
                 */

            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }

        }

        /*
        Same driver instance will be returned every time we call Driver.getDriver(); method
         */

        return driver;



}

    /*
        This method makes sure we have some form of driver session or driver id this.
        Either null or not null it must exit
     */

    public static void closeDriver(){

        if (driver != null){
            driver.quit();
            driver = null; // This will go back in the getDriver method to solve the solution from getting NoSuchSessionException
        }
    }


}