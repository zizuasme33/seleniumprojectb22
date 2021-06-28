package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day1_day2_day3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Practice {
    public static void main(String[] args) throws InterruptedException {

        //TC #3: Back and forth navigation
        // 1-Open a chrome browser
        WebDriver driver =  WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2-Go to: https://google.com
        driver.get(" https://google.com");

        // 3-Click to Gmail from top right.
        WebElement topClick = driver.findElement(By.linkText("Gmail"));
        topClick.click();

        // 4-Verify title contains:
        // Expected: Gmail

        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!");
        }

        // 5-Go back to Google by using the .back();
        driver.navigate().back();

        // 6-Verify title equals:
            // Expected: Google
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Google";
        if (actualTitle1.equals(expectedTitle1)) {
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!");
        }

    }
}
