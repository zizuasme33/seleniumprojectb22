package com.cybertek.tests.day6_testing_into_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Apple_TAsk {

    public static void main(String[] args) throws InterruptedException {

        //TC #03: FINDELEMENTS_APPLE
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");

        //3. Click to all of the headers one by one
            //apple logo,  Mac, iPad, iPhone, Watch, TV, Music, Support, search box

        //storing 9 web elements including "apple" logo, and search box
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        for (int eachLink = 1; eachLink < headerLinks.size()-1; eachLink++) {

          //  System.out.println(headerLinks.get(eachLink).getText()); just to print and check

            headerLinks.get(eachLink).click();
            Thread.sleep(2000);

            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));// this will refresh and ignore the (StaleElementReferenceException)
            //4. Print out the titles of the each page
            System.out.println("Current title in the page: " + driver.getTitle());


            //5. Print out total number of links in each page
            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("Number of links in current page: " + allLinks.size());


            int linksWithNoText = 0;
            int linkWithText = 0;

            for (WebElement each : allLinks) {
                if (each.getText().isEmpty()) {
                    linksWithNoText++;
                }else {
                    linkWithText++;
                }

            }


            //6. While in each page:
                //a. Print out how many link is missing text TOTAL
            System.out.println("--> Current page links with No Text: " + linksWithNoText);

                // b. Print out how many link has text TOTAL
            System.out.println("--> Current page links with Text: " +linkWithText);




        }


    }
}
