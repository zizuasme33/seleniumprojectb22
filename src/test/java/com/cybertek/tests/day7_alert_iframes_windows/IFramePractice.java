package com.cybertek.tests.day7_alert_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IFramePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){


        //TC #4 : Iframe practice
        //1. Create a new class called: IframePractice
        //2. Create new test and make set ups
        //3. Go to: http://practice.cybertekschool.com/iframe
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }

    @Test
    public void iframe_test() {

        //#1 - changing to iframe by index: we pass index number
      //  driver.switchTo().frame(0);

        //#2 - locate as a Web Element to switch
        // We find and locate <iframe> web element from the page
//        WebElement iframe = driver.findElement(By.xpath("//iframe[@id = 'mce_0_ifr']"));
//        driver.switchTo().frame(iframe);

        //#3 - if <iframe> tag has Id or Name Attribute, we can pass its attribute value as a string into
        //.switchTo().frame()method directly
        driver.switchTo().frame("mce_0_ifr");



        //Locating web element text
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

       // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        //locating header as web element
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        Assert.assertTrue(headerText.isDisplayed());



    }
}
