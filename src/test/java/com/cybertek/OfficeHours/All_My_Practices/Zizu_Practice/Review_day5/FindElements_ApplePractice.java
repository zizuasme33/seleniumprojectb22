package com.cybertek.OfficeHours.All_My_Practices.Zizu_Practice.Review_day5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElements_ApplePractice {

    public static void main(String[] args) {

        //TC #03: FINDELEMENTS_APPLE
        // 1.Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to all of the headers one by onea.
                        // Mac, iPad, iPhone, Watch, TV, Music, Support

        String [] headerClick = {"Mac", "iPad", "iPhone", "Watch", "TV", "Music", "Support"};



        for (String each  : headerClick) {

            driver.findElement(By.xpath("//a[contains(@class, '"+each.toLowerCase() +"')]")).click();


            // 4.Print out the titles of the each page
            System.out.println("Title of each page = " + driver.getTitle());


        }

        System.out.println("************************************************");
        List<WebElement> listOFLinks= driver.findElements(By.xpath("//body//a"));
        int totalMissingText = 0;
        int totalText = 0;
        // 5.Print out total number of links in each page
        System.out.println("Total number of links = " + listOFLinks.size());


        // 6.While in each page:
        for (WebElement each : listOFLinks) {
            if (each.getText().isEmpty()){
                totalMissingText++;
            }else {
                totalText++;
            }

        }
            // a.Print out how many link is missing textTOTAL
        System.out.println("missing of total text = " + totalMissingText);

            // b.Print out how many link has textTOTAL
        System.out.println("Total of text = " + totalText);


    }

}
