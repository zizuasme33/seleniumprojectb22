package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElements_Apple_Review {
    public static void main(String[] args) {

        //TC #02: FINDELEMENTS_APPLE
        // 1.Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to iPhone
        WebElement iphone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        iphone.click();

         // 4.Print out the texts of all links
        List<WebElement> linkText = driver.findElements(By.xpath("//body//a"));
        int count = 0;
        int countMissing = 0;
        for (WebElement each : linkText) {
            if (each.getText().isEmpty()) {
                countMissing++;
            } else {
                count++;
            }
        }
        // 5.Print out how many link is missing text
        System.out.println("countMissing = " + countMissing);
        // 6.Print out how many link has text
        System.out.println("Count Text = " + count);


        // 7.Print out how many total link
        System.out.println("Total link text = " + linkText.size());



    }
}
