package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day1_day2_day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankPractice {
    public static void main(String[] args) {

        //TC #1: Zero Bank header verification
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3. Verify header text
        // Expected: “Log in to ZeroBank”

        WebElement headerText = driver.findElement(By.tagName("h3"));
        String actualHeader = headerText.getText();
        String expectedHeader = "Log in to ZeroBank";

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header verification PASSED!");
        }else {
            System.out.println("Header verification FAILED");
        }




        // TC #2: Zero Bank link text verification1.
        // Open Chrome browser
        // 2.Go to http://zero.webappsecurity.com/login.html


        // 3.Verify link text from top left:
        // Expected: “Zero Bank”

        WebElement zeroBankLink = driver.findElement(By.className("brand"));


        String actualLinkText = zeroBankLink.getText();
        String expectedLinkText = "Zero Bank";
        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link text verification PASSED!");
        }else {
            System.out.println("Link text verification FAILED!!!");
        }


        // 4.Verify link href attribute value contains:
        // Expected: “index.html”

        String actualAttributeHref = zeroBankLink.getAttribute("href");
        String expectedAttributeHref = "index.html";

        if (actualAttributeHref.contains(expectedAttributeHref)) {
            System.out.println("Href attribute verification PASSED!");
        }else {
            System.out.println("Href attribute verification FAILED!!!");
        }


    }
}
