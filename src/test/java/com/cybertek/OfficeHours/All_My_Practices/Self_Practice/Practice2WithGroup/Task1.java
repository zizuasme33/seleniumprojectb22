package com.cybertek.OfficeHours.All_My_Practices.Self_Practice.Practice2WithGroup;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://qa3.vytrack.com/user/login");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";

        String check = (actualTitle.equals(expectedTitle)? "PASSED: actual title matches the expected": "FAILED: actual title doe not matches the expected");
        System.out.println(check);
       // System.out.println(driver.getTitle()); // we can get title without inspecting it

        WebElement userNameLoginPage = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userNameLoginPage.sendKeys("Storemanager201");

        WebElement passwordLoginPage = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        passwordLoginPage.sendKeys("UserUser123");
        passwordLoginPage.submit();

        String actualTitle2 = driver.getTitle();
       // System.out.println(driver.getTitle());  to get title without inspecting manual
        String expectedTile2 = "Dashboard";

        String check2 = (!actualTitle2.equals(expectedTile2)? "PASSED: expected title matches":"PASSED: expected title matches");
        System.out.println(check2);

        String checkLoginVsDashboard = actualTitle2.equals(actualTitle)?"FAILED" :"PASSED";
        System.out.println(checkLoginVsDashboard);




        //Username: Storemanager201     Password: UserUser123



    }
}
