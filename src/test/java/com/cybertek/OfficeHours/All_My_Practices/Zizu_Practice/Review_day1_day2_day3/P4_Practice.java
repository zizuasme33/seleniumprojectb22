package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day1_day2_day3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_Practice {
    public static void main(String[] args) {
        //TC#4: Google search
        // 1-Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2-Go to: https://google.com
        driver.get("https://google.com");


        // 3-Write “apple” in search box
        // 4-Click google search button
        WebElement searchApple = driver.findElement(By.name("q"));
        searchApple.sendKeys("apple"+ Keys.ENTER);

        // 5-Verify title:
        // Expected: Title should start with “apple” word
        String actualGoogleTitle = driver.getTitle();
        String expectedGoogleTitle= "apple";

        if (actualGoogleTitle.startsWith(expectedGoogleTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }

    }
}
