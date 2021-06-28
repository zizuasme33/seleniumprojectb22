package com.cybertek.OfficeHours.All_My_Practices.Self_Practice.Practice2WithGroup;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TAsk3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        WebElement search = driver.findElement(By.xpath("/*[@class='a-link-normal a-text-normal'][1]"));
        Thread.sleep(3000);
        search.sendKeys("Blue - One Love");
        search.submit();
        search.sendKeys(" Blue - One Love (Official Music Video) ");


        //Reuse the created WebElement to send search content into the serach bar and send "Blue - One Love" to the search bar
        //Put the whole thread to Sleep for 3 seconds
        //
        //7. Resuse the created WebElement and SUBMIT the search
        //Put the whole thread to Sleep for 3 seconds
        //
        //8. Click on the first Music video named: Blue - One Love (Official Music Video) (FEEL FREE TO USE WHATEVER LOCATER YOU WANT - JUST CLICK ON THAT VIDEO)
        //
        //then...
        //
        //Disregard add rolls - / SKipIt - and enjoy some good oldschool song 😉


    }
}
