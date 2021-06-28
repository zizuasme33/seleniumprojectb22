package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day8;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class T6_Review {

    /*
            TC#6: Cybertek registration form confirmation
            Note: Use JavaFaker when possible.

            3.Enter first name
            4.Enter last name
            5.Enter username
            6.Enter email address
            7.Enter password
            8.Enter phone number
            9.Select a gender from radio buttons
            10.Enter date of birth
            11.Select Department/Office
            12.Select Job Title
            13.Select programming language from checkboxes
            14.Clickto sign up button
            15.Verify success message “You’ve successfully completed registration.”is displayed.
     */

    WebDriver driver;

    @BeforeMethod

    public void setUpMethod() {

        //1.Open browser
        //2.Go to website: http://practice.cybertekschool.com/registration_form

        String browser = ConfigurationReader.getProperty("browser");
        // This line returning String : chrome
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/registration_form");

    }

    @Test
    public void test1() {

        Faker faker = new Faker();

        String name = faker.name().firstName();
        WebElement firsName = driver.findElement(By.cssSelector("[name = 'firstname']"));
        firsName.sendKeys(name);

        String lName = faker.name().lastName();
        WebElement lastName = driver.findElement(By.cssSelector("[name = 'lastname']"));
        lastName.sendKeys(lName);

        String usName = faker.name().firstName()+faker.name().lastName();
        WebElement userName = driver.findElement(By.cssSelector("[name = 'username']"));
        userName.sendKeys(usName);

        String email = faker.internet().emailAddress();
        WebElement emailAddress = driver.findElement(By.cssSelector("[name = 'email']"));
        emailAddress.sendKeys(email);

        String pass = faker.internet().password();
        WebElement password= driver.findElement(By.cssSelector("[name = 'password']"));
        password.sendKeys(pass);

        String tell = faker.phoneNumber().phoneNumber();
        WebElement tellNumber= driver.findElement(By.cssSelector("[name = 'phone']"));
        tellNumber.sendKeys(tell);

        driver.findElement(By.cssSelector("[value = 'female']")).click();

        WebElement birthOfDat = driver.findElement(By.cssSelector("[name = 'birthday']"));
        birthOfDat.sendKeys("01/01/1990");

        Select dept = new Select(driver.findElement(By.cssSelector("[name = 'department']")));
        dept.selectByIndex(1);

        Select jobTitle = new Select(driver.findElement(By.cssSelector("[name = 'job_title']")));
        jobTitle.selectByIndex(4);

        driver.findElement(By.xpath("//input[@id = 'inlineCheckbox2']")).click();
        driver.findElement(By.xpath("//*[@id = 'wooden_spoon']")).click();

        WebElement verifyTitle = driver.findElement(By.xpath("//p"));

        String actualText = verifyTitle.getText();
        String expectedText = "You've successfully completed registration!";

        Assert.assertEquals(actualText, expectedText);







    }

}
