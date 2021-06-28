package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day1_day2_day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_Facebook {
    public static void main(String[] args) {

        //TC #3: Facebook header verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Verify header text is as expected:
        // Expected: “Connect with friends and the world around you on Facebook.”
        WebElement header = driver.findElement(By.className("_8eso"));
        String actualHeader = header.getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header verification PASSED!");
        } else {
            System.out.println("Header verification FAILED!!!");
        }

        // TC #4: Facebook header verification
        // 1.Open Chrome browser
        // 2.Go to https://www.facebook.com


        // 3.Verify “Create a page” link href value contains text:
        // Expected: “registration_form”

        WebElement hrefValue = driver.findElement(By.linkText("Create a Page"));
        String actualValue = hrefValue.getAttribute("href");
        String expectedValue = "registration_form";

        if (actualValue.contains(expectedValue)) {
            System.out.println("Href link verification PASSED!");
        } else {
            System.out.println("Href link verification FAILED!!!");
        }





    }
}
