package com.cybertek.OfficeHours.OH_day01;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MoneyGamingTask {

    @Test
    public void Task1(){
        /*
            REAL JOB INTERVIEW TASK
            1. Navigate to: https://moneygaming.qa.gameaccount.com/
            2. Click the JOIN NOW button to open the registration page
            3. Select a title value from the dropdown
            4. Enter your first name and surname in the form
            5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
            6. Submit the form by clicking the JOIN NOW button
            7. Validate that a validation message with text ‘ This field is required’ appears under the date of
            birth box
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/");

        // Let's handle time display
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement joinButton = driver.findElement(By.xpath("//*[@class= 'newUser green']"));
        joinButton.click();

        WebElement titleElement = driver.findElement(By.id("title"));

        Select titleDropDown = new Select(titleElement);

        // we are going to add Mr to gaming
        titleDropDown.selectByVisibleText("Mr");

        // verify that Mr is selected
        String expectedTitle = "Mr";
        String actualTitle = titleDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualTitle, expectedTitle, "verify the title");

        // first name and last name box
        WebElement firstName = driver.findElement(By.xpath("//*[@id= 'forename']"));
        WebElement lastName = driver.findElement(By.xpath("//*[@name= 'map(lastName)']"));

        firstName.sendKeys("Mike");
        lastName.sendKeys("Smith");

        WebElement tickBox = driver.findElement(By.xpath("//*[@name= 'map(terms)']"));
        tickBox.click();


        // submit the form by clicking the JOIN NOW BUTTON
        WebElement submitButton = driver.findElement(By.xpath("//*[@id= 'form']"));
        submitButton.click();

        //7. Validate that a validation message with text ‘ This field is required’ appears under the date of
                //birth box

        String expectedError = "This field is required";
        String actualError = driver.findElement(By.xpath("//*[@for= 'dob']")).getText();

        Assert.assertEquals(actualError,expectedError,"verify DOB error message");




    }

}
