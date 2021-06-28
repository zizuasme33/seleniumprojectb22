package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day1_day2_day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1WithBackAndForth {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.findElement(By.linkText("Gmail")).click();
       WebElement h1 =  driver.findElement(By.tagName("h1"));
        System.out.println(h1);

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        driver.navigate().back();

        String expectedTitle1 = "Google";
        String actualTitle1 = driver.getTitle();
        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }



    }
}
