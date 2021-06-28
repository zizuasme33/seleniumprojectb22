package com.cybertek.OfficeHours.All_My_Practices.Self_Practice.SeleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class baseTest {

    protected static ThreadLocal<ChromeDriver> getDriver = new ThreadLocal<ChromeDriver>();


    @BeforeMethod

    public void setUp(){
        getDriver.set(new ChromeDriver());
        WebDriverManager.chromedriver().setup();

        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        getDriver().get("https://qa3.vytrack.com/user/login");
    }

    public WebDriver getDriver (){
        return getDriver.get();
    }

    @AfterMethod

    public void tearDown(){
        getDriver().quit();
    }


}
