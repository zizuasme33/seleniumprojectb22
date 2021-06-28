package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_Practice {
    public static void main(String[] args) {

        /*
            TC #2: Cybertek practice tool verifications
            1. Open Chrome browser
            2. Goto https://practice.cybertekschool.com
            3. Verify URL contains
                    Expected: cybertekschool
            4. Verify title:
                    Expected: Practice
         */
            // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // 2. Goto https://practice.cybertekschool.com
        driver.get("https://practice.cybertekschool.com");

          // 3. Verify URL contains
        // Expected: cybertekschool
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        String expectedUrl = "cybertekschool";

        if (actualUrl.contains(expectedUrl)){
            System.out.println("True = Url is contains cybertekschool");

        }else {
            System.out.println("Url is not contains cybertekschool");
        }


        //  4. Verify title:
        // Expected: Practice
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String expectedTitle = "Practice";
        System.out.println("expectedTitle = " + expectedTitle);

        if (currentTitle.contains(expectedTitle)){
            System.out.println("True");
        }else {
            System.out.println("False title is not visible!");
        }


    }
}
