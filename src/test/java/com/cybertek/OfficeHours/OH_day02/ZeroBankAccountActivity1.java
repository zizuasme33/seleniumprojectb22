package com.cybertek.OfficeHours.OH_day02;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ZeroBankAccountActivity1 {


    //2. The user logs in with the user "username" and the password "password"
    //3. The user navigates to Account Activity page



    //Declare our driver object

    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        //1. The user navigates to the login page: http://zero.webappsecurity.com/login.html
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://zero.webappsecurity.com/login.html");

        // login
        driver.findElement(By.cssSelector("[id*='user_login']")).sendKeys("username");
        driver.findElement(By.cssSelector("[id*='user_pass']")).sendKeys("password");
        driver.findElement(By.cssSelector("[type*='submit']")).click();
        driver.findElement(By.cssSelector("[id*='primary-button']")).click();


    }

    @Test
    public void accountActivity() {
        //4. Then The page should have the title "Zero - Account Activity"

        driver.findElement(By.cssSelector("[id*='account']")).click();
        String expectedTitle = "Zero - Account Activity";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle, "Verify Title");

        //5. Then Account drop down should have the following options :
                //(Savings, Checking, Savings, Loan, Credit Card, Brokerage)
                //6. Brokerage option should have

        List<String> expectedOptions = new ArrayList<String>(Arrays.asList("Savings", "Checking", "Savings", "Loan", "Credit Card", "Brokerage"));
        Select accountDropDown = new Select(driver.findElement(By.cssSelector("[id*='aa']")));
        List<WebElement> actualOptions = accountDropDown.getOptions();
        List<String> actualOptionsText = new ArrayList<String>();
        for (WebElement each : actualOptions) {
            actualOptionsText.add(each.getText());

        }

        System.out.println("expectedOptions = " + expectedOptions);
        System.out.println("actualOptions = " + actualOptions);
        System.out.println("actualOptionsTexts = " + actualOptionsText);

        Assert.assertEquals(actualOptionsText,expectedOptions,"verify Dropdown Options");

        accountDropDown.selectByValue("Brokerage");

        String expectedText = "No results.";
        String actualText = driver.findElement(By.cssSelector("[class*='well']")).getText();

        Assert.assertEquals(actualText,expectedText,"verify result text");

    }

    @AfterClass
    public void tearDownClass(){
        driver.quit();
    }

}
