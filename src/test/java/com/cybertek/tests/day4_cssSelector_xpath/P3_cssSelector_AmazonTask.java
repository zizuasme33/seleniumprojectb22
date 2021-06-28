package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) throws InterruptedException {

        //CSS Practice
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #3: Amazon link number verification
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Enter search term (use cssSelector to locate search box)
        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        Thread.sleep(1000);

        amazonSearchBar.sendKeys("wooden spoon" + Keys.ENTER);


        //4. Verify title contains search term
        //Expected: Amazon.com : wooden spoon

        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();
        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }

    }

}
